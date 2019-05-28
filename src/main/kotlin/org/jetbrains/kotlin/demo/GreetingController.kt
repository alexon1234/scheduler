package org.jetbrains.kotlin.demo

import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/")
    fun greeting() = SecurityContextHolder.getContext().authentication.principal
}