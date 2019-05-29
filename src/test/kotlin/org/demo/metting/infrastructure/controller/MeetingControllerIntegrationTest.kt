package org.demo.metting.infrastructure.controller

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@RunWith(SpringRunner::class)
@WebMvcTest(MeetingController::class)
class MeetingControllerIntegrationTest {

    @Autowired
    private val mvc: MockMvc? = null

    @Test
    fun controller_should_return_hello_world() {
        mvc
                ?.perform(
                        get("/api/meeting").contentType(MediaType.APPLICATION_JSON).content("Hello World"))
                ?.andExpect(status().is5xxServerError)

    }
}