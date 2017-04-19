package defargval

//@JvmOverloads
fun callMe(name: String = "", surname: String, email: String? = "unknown", mobile: String? = "none") : String {
    return name + surname
}


fun  main(args: Array<String>) {
    println(callMe("Veen", "Ron", null, null))
    println(callMe("Veen", "Ron", null))
    println(callMe("Veen", "Ron"))
    println(callMe(surname = "Veen", name = "Ron"))
    println(callMe(surname = "Veen"))
    //   ILLEGAL: println(callMe("Veen"))

}



