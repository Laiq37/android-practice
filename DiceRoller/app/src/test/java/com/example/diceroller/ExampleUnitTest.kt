package com.example.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun randomNumTest() {
        val dice:Dice = Dice(6)
        val rollResult : Int = dice.rollDice()
        assertTrue("The result is in between 1 to 6", rollResult in 1..6)
    }
}