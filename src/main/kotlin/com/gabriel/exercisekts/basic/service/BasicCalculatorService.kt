package com.gabriel.exercisekts.basic.controller.service

import org.springframework.stereotype.Component

@Component
class BasicCalculatorService {

    fun squared(numberToBeSquared: Int): Int {
        return numberToBeSquared * numberToBeSquared;
    }

    fun cub(numberToBeCubed: Int): Int {
        return numberToBeCubed * numberToBeCubed * numberToBeCubed;
    }

}