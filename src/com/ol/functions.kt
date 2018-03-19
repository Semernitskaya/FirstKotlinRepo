package com.ol

/**
 * Created by Semernitskaya on 15.03.2018.
 */

fun main(args: Array<String>) {
    println(defaultArgsMult())
    println(defaultArgsMult(10))
    println(defaultArgsMult(y = 10))
    calculatedDefaultArgs("my str")
    calculatedDefaultArgs()
    calculatedDefaultArgs()
    println(varargsMult())
    println(varargsMult(10))
    println(varargsMult(1, 2, 5, 8))

}

fun mult1(a: Int, b: Int): Int {
    return a * b
}

fun mult2(x: Int, y: Int) = x * y

fun printMult(x: Int, y: Int) {
    println(x * y)
//    return
//    return Unit
}

fun defaultArgsMult(x: Int = 2, y: Int = 3) = mult1(x, y)

fun calculatedDefaultArgs(str: String = calcStr()) {
    println("Hello $str")
}

fun  calcStr(): String {
    println("calculating str")
    return "default str " + Math.random()
}

fun varargsMult(vararg x: Int) = x.fold(1, {a, b -> a * b})
