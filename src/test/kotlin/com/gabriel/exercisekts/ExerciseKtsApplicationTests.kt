package com.gabriel.exercisekts

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertNull
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ExerciseKtsApplicationTests {

    @Test
    fun contextLoads() {
        println("test")
    }

    @Test
    fun panarama() {
		val test = "al doilea test"
		println(test)
    }
}
