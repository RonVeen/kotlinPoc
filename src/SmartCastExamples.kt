package smart.cast

fun main(arg: Array<String>) {


    var str:String = arg[0] as String
    println(str.trim())

    if (arg[0] is String) {
        str = str.toUpperCase()

        str = str.toLowerCase()

        val x = str.length
    }



}

