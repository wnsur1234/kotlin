package i_io

import java.io.File

private val fileName = "test.txt"
private val directory = "file"

fun main(){
    createDirectory()
}

private fun createDirectory(){
    val dir = File(directory)
    if(!dir.exists()){
        dir.mkdirs()
    }
}

