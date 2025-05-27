package com.grepp.music.presentation

import com.grepp.music.domain.song.Song
import java.util.*

fun main(){
    while (true) {

        println("\n==============\n")
        print("오늘 어때요? 오늘에 어울리는 노래를 추천해드려요! (종료: exit)")
        print("입력 : ")
        val input = readln()

        if (input == "exit") break

        println("추천 곡 수 : ")
        val cnt = readln().toInt()

        println("\n====== AI 답변 ======\n")
        println("추천하는 곡은 입니다.")
        println("생성된 QR 코드를 통해 음악을 감상하세요!")
    }
}