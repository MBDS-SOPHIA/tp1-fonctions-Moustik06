fun main(){
    println("FONCTION 1")
    fn1(10, true)
    println()

    println("FONCTION 2")
    fn2(10)
    println()

    println("FONCTION 3")
    println("Factoriel de 5: ${fn3(5)}")
    println("Factoriel par défaut: ${fn3()}")
    println()

    println("FONCTION 4")
    fn4(10)
}

fun fn1(x: Int, pair: Boolean) {
    for (i in 1..x) {
        if (pair) {
            println(i * 2)
        } else {
            println(i * 2 - 1)
        }
    }
}

fun fn2(x: Int) {
    var a = 0
    var b = 1

    for (i in 1..x) {
        println(a)
        val temp = a
        a = b
        b += temp
    }
}

fun fn3(x: Int = 10): Int {
    var result = 1
    for (i in 1..x) {
        result *= i
    }
    return result
}

fun fn4(x: Int) {
    var count = 0
    var number = 2

    while (count < x) {
        if (isPrime(number)) {
            println(number)
            count++
        }
        number++
    }
}
fun isPrime(number: Int): Boolean {
    if (number < 2) {
        return false
    }
    for (i in 2..number / 2) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}