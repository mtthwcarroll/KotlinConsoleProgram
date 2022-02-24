// Like the main method for java
fun main(args: Array<String>) {
    // Set up an array. I don't like how I NEED to give it starting values
    val words = Array<String?>(5){i -> ""}
    // User inputs
    print("Welcome to my cool Madlib.")
    print("\nEnter a verb: ")
    words[0] = readLine()
    print("Enter a noun (place): ")
    words[1] = readLine()
    print("Enter the name of a person: ")
    words[2] = readLine()
    print("Enter an adjective: ")
    words[3] = readLine()
    print("Enter a noun: ")
    words[4] = readLine()

    // We can put variables in our strings like Python's fstring.
    print("You walk to school after a long night of ${words[0]} your homework for Computer Science Seminar. " +
            "You arrive to your\nclass, CS-495, located at ${words[1]}. Your teacher, ${words[2]} " +
            "gives you a sarcastic\ncomment as you arrive late. Your ${words[3]} classmates are all " +
            "already here. You\nspend the entire class daydreaming about ${words[4]}.")
}