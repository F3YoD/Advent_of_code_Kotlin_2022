package utils;

import java.io.File

object Functions {

    fun readFile(fileName: String): String = File("inputs/$fileName.txt").readText()

}
