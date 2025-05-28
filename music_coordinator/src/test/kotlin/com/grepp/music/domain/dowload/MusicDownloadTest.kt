package com.grepp.music.domain.dowload

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import kotlin.test.Test

class MusicDownloadTest {

    @Test
    fun testScraping()= runBlocking{

        val downloadUrls = listOf(0,1,2).map {
            async(Dispatchers.Default) {
                val driver = ChromeDriver()
                driver["https://www.youtube.com/results?search_query=%EC%B0%BD%EB%AA%A8"]
                val element = driver.findElement(By.cssSelector("a[href^=\"/watch?\"]"))
                val downloadUrl = element.getDomAttribute("href")
                driver.quit()
                downloadUrl
            }
        }.awaitAll()
        println(downloadUrls)
    }

}