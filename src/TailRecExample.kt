package tailrec

fun main(args: Array<String>) {
   val x = decrease(10)
   println("$x")
}


tailrec fun decrease(x: Int)  {
    println("now x is $x")
    if (x == 0) x else decrease(x - 1)
}

