

fun callMe(name: String, surname: String, email: String?, mobile: String?) : String {
    return name + surname
}


fun  main(args: Array<String>) {
    callMe("Veen", "Ron", null, null);
    callMe(surname = "Veen", name = "Ron", mobile = null, email = "");
}
