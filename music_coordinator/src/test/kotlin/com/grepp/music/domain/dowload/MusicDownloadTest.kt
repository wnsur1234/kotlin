package com.grepp.music.domain.dowload

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.runBlocking
import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import kotlin.test.Test


class MusicDownloadTest{
    @Test
    fun testScrapping() = runBlocking{
        val downloadUrls = listOf(0,1).map{
            async(Dispatchers.Default) {
                val driver = ChromeDriver()
                driver["https://www.youtube.com/results?search_query=%EC%95%84%EC%9D%B4%EC%9C%A0+%EC%A2%8B%EC%9D%80+%EB%82%A0"]
                val element = driver.findElement(By.cssSelector("a[href^=\"/watch?\"]"))
                val downloadUrl = element.getDomAttribute("href")
                driver.quit()
                downloadUrl
            }
        }.awaitAll()
        println(downloadUrls)
    }
}