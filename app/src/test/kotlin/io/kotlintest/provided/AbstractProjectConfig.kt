package io.kotlintest.provided

import io.kotest.core.config.AbstractProjectConfig
import kotlin.time.Duration.Companion.minutes

object ProjectConfig: AbstractProjectConfig() {
  override val projectTimeout = 12.minutes
}