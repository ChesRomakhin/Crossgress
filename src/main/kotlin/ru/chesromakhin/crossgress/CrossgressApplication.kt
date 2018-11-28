package ru.chesromakhin.crossgress

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@EnableWebFlux
@SpringBootApplication
class CrossgressApplication

fun main(args: Array<String>) {
    runApplication<CrossgressApplication>(*args)
}
