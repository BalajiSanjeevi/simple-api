package com.monster.aws.simpleapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.Tag
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer
import org.springframework.context.annotation.Bean


@SpringBootApplication
class SimpleApiApplication {

    @Value("\${spring.application.name}")
    lateinit var application: String

    @Bean
    fun metricsCommonTags(): MeterRegistryCustomizer<MeterRegistry> =
            MeterRegistryCustomizer {
                it.config().commonTags(listOf(
                        Tag.of("env", "local"),
                        Tag.of("application", application)
                ))
            }

}

fun main(args: Array<String>) {
    runApplication<SimpleApiApplication>(*args)
}
