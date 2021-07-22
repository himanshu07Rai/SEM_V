object operations {
  def main(args: Array[String])
  {
    var a=10
    var b=4
    val c=true
    val d=false
    var result =0

    println("Addition is: "+ (a+b))
    println("Subtraction is: "+ (a-b))
    println("Multiplication is: "+ (a*b))
    println("Division is: "+ (a/b))
    println("modulous is: "+ (a%b))


    if(a==b)
    {
      println("equal to operatior is True")

    }
    else
    {
      println("equal operator is False")

    }

    println("logical or of a||b ="+ (c||d))

    result =a&b
    println("Bitwise AND : "+result)


    println("Additional Assignment Operator: " + (a+=b))
    println(a)
  }
}
