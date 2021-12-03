package Day02

import readInput

fun main() {
    val FORWARD = "forward"
    val UP = "up"
    val DOWN = "down"

    fun part1(input: List<String>): Int {
        var horizontal = 0
        var vertical = 0

        for (line in input) {
            val (command, value) = line.split(" ")
            when (command) {
                FORWARD -> {
                    horizontal += value.toInt()
                }
                UP -> {
                    vertical -= value.toInt()
                }
                DOWN -> {
                    vertical += value.toInt()
                }
            }
        }
        return(horizontal * vertical)
    }

//    fun part2(input: List<String>): Int {
//        val a = input.map { it.toInt() }
//        return a.windowed(3).map { it.sum() }.zipWithNext().count {
//                (x, y) -> y > x
//        }
//    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02/Day02_test")
    check(part1(testInput) == 150)
//    check(part2(testInput) == 5)

    val input = readInput("Day02/Day02")
    println(part1(input))
//    println(part2(input))
}
