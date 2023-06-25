package com.gabriel.exercisekts.basic.resource

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

const val API_PATH: String = "/basic/calculator"

@RequestMapping(path = [API_PATH])
interface BasicResource {

    @GetMapping(path = ["/square"])
    fun squareTheNumber(@RequestParam number: Int): Int

    @GetMapping(path = ["/cub"])
    fun cubTheNumber(@RequestParam number: Int): Int

}