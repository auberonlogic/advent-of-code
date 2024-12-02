package day_01

import java.io.File
import kotlin.math.absoluteValue

fun main() {

    // read file into a list
    val file: String = "src/main/kotlin/day_01/01-1_input.txt"
    val inputList: List<String> = readFile(file)

    // split inputList into 2 lists, 1 for each column
    val left: MutableList<Int> = mutableListOf()
    val right: MutableList<Int> = mutableListOf()

    for (item in inputList) {
        val lineArray = item.split("\\s+".toRegex())
        left.add(lineArray[0].toInt())
        right.add(lineArray[1].toInt())
    }

    // sort each list smallest to largest
    left.sort()
    right.sort()

    // cast mutable lists to read-only lists to prevent accidental modification
    val lockedLeft: List<Int> = left
    val lockedRight: List<Int> = right

    // get the difference between each sorted element and sum
    val difference = sumDifferences(lockedLeft, lockedRight)
    println("The total difference is $difference")

    // get the similarity score
    val similarity = getSimilarity(lockedLeft, lockedRight)
    println("The similarity score is $similarity")
}

fun readFile(filename: String): List<String> = File(filename).readLines()

fun sumDifferences(listA: List<Int>, listB: List<Int>): Int {
    var num = 0
    var sum = 0
    while (num < 1000) {
        sum += (listA[num] - listB[num]).absoluteValue
        num++
    }
    return sum
}

fun getSimilarity(listA: List<Int>, listB: List<Int>): Int {
    var similarity = 0

    for (leftNum in listA) {
        var count = 0
        for (rightNum in listB) {
            if (leftNum == rightNum) {
                count++
            }
        }
        var total: Int = leftNum * count
        similarity += total
    }
    return similarity
}