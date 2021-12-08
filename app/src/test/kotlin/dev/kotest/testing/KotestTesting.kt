package dev.kotest.testing

import io.kotest.core.spec.style.FunSpec
import kotlinx.coroutines.launch
import kotlinx.coroutines.withTimeout
import kotlin.time.Duration
import kotlin.time.Duration.Companion.milliseconds


object CoroutineService {
  suspend fun coroutineThatTimesOut(timeout: Duration) =
    withTimeout(timeout.inWholeMilliseconds) {
      launch {
        val sleepTime = timeout.plus(10.milliseconds)
        Thread.sleep(sleepTime.inWholeMilliseconds)
      }.join()
    }
}

class KotestTesting: FunSpec() {
  init {
    test("Test with service that fails withTimeout says that it times out in 10 min instead of 15ms") {
        CoroutineService.coroutineThatTimesOut(15.milliseconds)
    }
  }
}