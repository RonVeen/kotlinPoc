
object MySingleton {
    var count: Int = 0;

    fun incr() : Int = ++count
}



fun main(args : Array<String>) {
    println(MySingleton.incr());
    println(MySingleton.incr());
    println(MySingleton.incr());
    println(MySingleton.incr());
    println(MySingleton.incr());
    println(MySingleton.incr());
}
