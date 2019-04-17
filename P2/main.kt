package P2

fun main(args : Array<String>){
    val console = ConsoleObserver()
    val textfilePrime = TextObserver("Prime")
    val primeHtmlfile = HTMLObserver("Prime")
    val primeWatcher = PrimeCompute()

    val palindromWatcher = PalindromCompute()
    val palindromHtmlfile = HTMLObserver("Palindrom")
    val palindromTextFile = TextObserver("Palindrom")

    palindromWatcher.addObserver(console)
    palindromWatcher.addObserver(palindromHtmlfile)
    palindromWatcher.addObserver(palindromTextFile)

    primeWatcher.addObserver(console)
    primeWatcher.addObserver(textfilePrime)
    primeWatcher.addObserver(primeHtmlfile)

    primeWatcher.run()

    palindromWatcher.run()

    for (i in 0..10){
        primeWatcher.generateNumber()
        palindromWatcher.generateNumber()
    }
}