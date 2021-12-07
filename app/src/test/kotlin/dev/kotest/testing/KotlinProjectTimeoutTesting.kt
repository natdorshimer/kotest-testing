package dev.kotest.testing

import io.kotest.core.spec.style.FunSpec
import kotlin.time.Duration.Companion.minutes

class KotlinProjectTimeoutTesting: FunSpec() {
  init {
    test("First test: 5 minutes") {
      Thread.sleep(5.minutes.inWholeMilliseconds)
    }
    test("Second test: 6 minutes") {
      Thread.sleep(6.minutes.inWholeMilliseconds)
    }
  }
}