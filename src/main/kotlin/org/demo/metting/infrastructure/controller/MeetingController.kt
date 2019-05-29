package org.demo.metting.infrastructure.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@RestController
class MeetingController {

    @RequestMapping("/api/meeting")
    @ResponseBody
    fun GetAll(): String = "Hello World"
}