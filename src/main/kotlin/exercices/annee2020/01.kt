import utils.Functions

fun main() {
    val list = Functions
        .readFile("exo1-2020")
        .split("\n").map { it.toInt() }

    val pair = list.flatMap {
        list.map { val2 ->
            Pair<Int, Int>(it, val2)
        }
    }.find { it.first + it.second == 2020 }!!

    val triple = list.flatMap { val1 ->
        list.flatMap { val2 ->
            list.map { val3 ->
                Triple<Int, Int, Int>(val1, val2, val3)
            }
        }
    }.find { it.first + it.second + it.third == 2020 }!!


    println("Pair = ${pair.first * pair.second}")
    println("Triple = ${triple.first * triple.second * triple.third}")
}