package com.monster.aws.simpleapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.Tag
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer
import org.springframework.context.annotation.Bean


@SpringBootApplication
class SimpleApiApplication {

    @Bean
    fun metricsCommonTags(): MeterRegistryCustomizer<MeterRegistry> =
            MeterRegistryCustomizer {
                it.config().commonTags(listOf(
                        Tag.of("env", "local")
                ))
            }

}

fun main(args: Array<String>) {
    runApplication<SimpleApiApplication>(*args)
}
