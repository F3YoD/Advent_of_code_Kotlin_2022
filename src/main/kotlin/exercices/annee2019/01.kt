package exercices.annee2019

import utils.Functions
import kotlin.math.floor

fun main() {
    val input = Functions.readFile("exo1-2015")

    val sum = input.split("\n").sumOf {
        calcul(it.toInt())
    }

    val sumPart2 = input.split("\n").sumOf {
        recours(0, calcul(it.toInt()))
    }

    println(sumPart2)

}

private fun calcul(elemActuel: Int) = floor(elemActuel / 3.0).toInt() - 2

private fun recours(acc: Int, value: Int): Int {
    if (value > 0) {
        val add = acc + value
        return recours(add, calcul(value))
    }
    return acc
}