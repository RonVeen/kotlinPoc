import kotlin.comparisons.compareValuesBy

/**
 * Created by veenr on 10-4-2017.
 */


fun main(args : Array<String>) {
    run()
}


fun run()  {

    val theAnswerToLifeTheUniverseAndEverything: Int = 42

    var count: Int = theAnswerToLifeTheUniverseAndEverything;


    println("Value at the start: $count")
    count = increment(count)
    count = increment(count)
    count = increment(count)
    println("Value at the end: $count")
}



fun increment(value: Int)  = value + 1


