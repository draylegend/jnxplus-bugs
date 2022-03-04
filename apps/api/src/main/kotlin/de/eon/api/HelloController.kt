package de.eon.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api")
class HelloController {
  @GetMapping("greeting")
  fun greeting(): Collection<String> {
    return listOf("Hello", "World")
  }
}
