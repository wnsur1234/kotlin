package com.grepp.music.infra.ytdlp

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class YtdlpExeutorTest {
    @Test
    fun testProcessBuilder() = runBlocking{
        val savePath = "${System.getProperty("user.home")}\\music\\}"
        val url = "https://www.youtube.com/watch?v=jblPRwzQbtI"

        listOf(0,1).forEach { _ ->
            launch {
                val processBuilder = ProcessBuilder()
                processBuilder.command(
                    "yt-dlp",
                    "--extract-audio",
                    "--audio-format", "mp3",
                    "--audio-quality", "0",
                    "-o", "$savePath\\소주한잔.mp3",
                    url
                )
                val process = processBuilder.start()
                delay(10000)
            }
        }
    }
}