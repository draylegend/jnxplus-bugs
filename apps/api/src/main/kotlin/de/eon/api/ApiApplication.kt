package de.eon.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = arrayOf("de.eon"))
class ApiApplication

fun main(args: Array<String>) {
  runApplication<ApiApplication>(*args)
}
