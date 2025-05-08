package com.example.gym4jim.classesTests

import com.example.gym4jim.classes.MotivationalQuoteData
import org.junit.Assert.*
import org.junit.Test

class MotivationalQuoteDataTest {

    @Test
    fun testMotivationalQuoteDataCreation() {
        val quoteData = MotivationalQuoteData(
            quote = "Success is no accident.",
            author = "Pele"
        )

        assertEquals("Success is no accident.", quoteData.quote)
        assertEquals("Pele", quoteData.author)
    }
}
