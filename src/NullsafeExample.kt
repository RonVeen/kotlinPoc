package nullsafe;

fun main(args: Array<String>) {
    run()
}


fun run() {
    data class Person(val name: String, val surname: String, val city: String?);
    val person = Person(name="Ron", surname="Veen", city="Enschede")

    //  De regel hieronder compileert niet
    //  val city = person.city.toUpperCase()

    val mycity = person.city?.toUpperCase()

    val anotherCity = person.city!!.toUpperCase()

    val (n, s, c) = person



}
