package dev.kotest.testing

import io.kotest.core.spec.style.FunSpec
import kotlin.time.Duration.Companion.minutes


class KotestTesting: FunSpec() {
  init {
    xtest("This will pass if project actually has a higher default than 10 mintues") {
      Thread.sleep(11.minutes.inWholeMilliseconds)
    }
  }
}