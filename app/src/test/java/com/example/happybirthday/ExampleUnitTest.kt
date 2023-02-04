package com.example.happybirthday

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun generates_numbers() {
        val cube = Cube(6)
        val spinResult = cube.spin()
        assertTrue("The value of spinning was not between 1 and 6", spinResult in 1..6)
    }
}