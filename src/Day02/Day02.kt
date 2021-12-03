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

    fun part2(input: List<String>): Int {
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

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02/Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 60)

    val input = readInput("Day02/Day02")
    println(part1(input))
//    println(part2(input))
}
