package com.gabriel.exercisekts.basic.controller

import com.gabriel.exercisekts.basic.controller.service.BasicCalculatorService
import com.gabriel.exercisekts.basic.resource.BasicResource
import org.springframework.web.bind.annotation.RestController

@RestController
class BasicRestController : BasicResource {
    val calculatorService: BasicCalculatorService = BasicCalculatorService()

    override fun squareTheNumber(number: Int): Int {
        return calculatorService.squared(number)
    }

    override fun cubTheNumber(number: Int): Int {
        return calculatorService.cub(number)
    }

}