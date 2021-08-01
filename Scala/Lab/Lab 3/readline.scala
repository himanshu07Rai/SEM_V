object readLineDemo {
  def main(args: Array[String])
  {
    // Applying a loop
    while (true) {
      // Reads the line from the Console
      val result = scala.io.StdIn.readLine()
      // Displays the string that is
      // given by the user
      printf("You have entered: %s", result)
      //prints newline
      println()
    }
  }
}