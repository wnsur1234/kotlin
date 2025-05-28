package com.grepp.music.infra.ytdlp

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.test.Test

class YtlpExecutorTest{
    @Test
    fun testProcessBuilder() = runBlocking{
        val savePath = "${System.getProperty("user.home")}\\music\\"
        val url = "https://www.youtube.com/watch?v=jeqdYqsrsA0"

        listOf(0,1).forEach {
            launch {
                val pb = ProcessBuilder()
                pb.command(
                    "./yt-dlp",
                    "--extract-audio",
                    "--audio-format=mp3",
                    "--audio-quality=0",
                    "-o", "$savePath\\좋은날$it.mp3",
                    url
                )
                val process = pb.start()
                delay(10000)
            }
        }
    }
}