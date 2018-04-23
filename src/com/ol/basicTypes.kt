package com.ol

/**
 * Created by Semernitskaya on 26.03.2018.
 */

fun main(vararg args: String) {
    val i = 6
    println(i.javaClass)

    val k: Long = 7
    println(k.javaClass)

    val n: Long? = 8
    println(n)

    val m = 9199999999999999999
    println(m.javaClass)

    val b1 = 0b0101
    val b2 = 0b1001

    println(b1 xor b2)

    equalityVsIdentity()
    conversions()
    operations()
}

fun operations() {
    val a = 2
    val b: Long = 4

    printMultiline(
            "simple operations",
            a shr 1,
            a * 4,
            a until 10,
            a.coerceIn(9, 19),
            a < b,
            a in 1..10,
            a !in 1..10
    )

    printMultiline(
            "NaN operations",
            Float.NaN,
            Double.NaN
    )
    assert(Float.NaN != Float.NaN)
    assert(!(Double.NaN <= Float.NaN))
    assert(!(Double.NaN >= Float.NaN))
    assert(!(Float.NaN > Float.POSITIVE_INFINITY))
    assert(!(Float.NaN < Float.POSITIVE_INFINITY))
}

fun  printMultiline(vararg ts: Any) = ts.forEach(::println)

fun conversions() {
    val a: Int = 1
    val b: Long = a.toLong()

//    val c: Byte = 1000000
    val c: Byte = 10
    val d = c
//    val e: Int = c
    val e: Int = c.toInt()

    val f = a + b + c + d
    println(f.javaClass)

    val g: Int = a + b.toInt() + c + d
    println(g.javaClass)

    println(232.toChar())
}

fun equalityVsIdentity() {
    val a = 1000
    val b = 1000
    val aNullable: Int? = 1000
    val bNullable: Int? = b

    assert(a == b)
    assert(a === b)

    assert(a == aNullable)
    assert(a !== aNullable)

    assert(b == bNullable)
    assert(b !== bNullable)
    assert(aNullable !== bNullable)
}

