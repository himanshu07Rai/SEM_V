# Scala

* It’s a high-level language

* It’s statically typed

* Its syntax is concise but still readable — we call it *expressive*

* It supports the object-oriented programming (OOP) paradigm

* It supports the functional programming (FP) paradigm

* It has a sophisticated type inference system

* Scala code results in *.class* files that run on the Java Virtual Machine (JVM)

* It’s easy to use Java libraries in Scala

* Pure object-oriented language
  * Every value is an object
  
* Functional language
  * Every function is a value
  
* Pure Expression Oriented Language
  * everything is an expression
  * every expression computes to a value ( most of the times )
  * every value has a type
  * every value is an object even functions
  * no goto, no break, no continue, inferred return , inferred semicolon
  * less unnecessary curly braces , less parenthesis 
  *  
  
* Scalable Language
  * regular
  * concise
  * powerful
  
  
  
## Functional Programming

Functional programming is a way of writing software applications using only pure functions and immutable values.

## Pure function

* The input solely determines the output.
* The function doesn't change it's in put parameter value
* The function doesn't do anything else except computing the output.
* Free from side effects.



## First Class Function

If we can treat a function as a value, it is a first class function.

* We can assign it to a variable
* We can pass it as an argument to other functions.
* WE can return it as a value from other functions.



## Higher Order Functions

A function that does at least one of the following is a HOF:

* Takes one or more functions as arguments
* Returns a function as its result.



## **ABSTRACTON is the main benefit of HOF**



##  Anonymous Function

A standard function has a name, a list of parameters, a return type, and a body.
If you don't give a name to a function, it's an anonymous function. 

```scala
(i:Int) => { i*2 } :Int
```

First part is the list of parameters, then body and return type.

That entire syntax has another term - *A function literal*

## What is the purpose of an anonymous function?

There might be scenarios where we want to create an inline function for a one-time usage, and giving them a name doesn't make any sense, because you don't want to use them anywhere else. In those cases, creating an anonymous function is quite convenient.










## Variables in Scala

A variable is mutable , typed storage unit.

An assigned variable can be reassigned



## Datatypes

|         |                                        |                                                              |
| ------- | -------------------------------------- | :----------------------------------------------------------- |
| Byte    | 8 bit signed value                     | ```val byteMin :Byte=Byte.MinValue            -128   val byteMax:Byte=Byte.MaxValue   127``` |
| Short   | 16 bit signed value                    |                                                              |
| Int     | 32 bit signed value                    |                                                              |
| Long    | 64 bit signed value                    |                                                              |
| Float   | 32 bit IEEE 754 single-precision float |                                                              |
| Double  | 64 bit IEEE 754 double-precision float |                                                              |
| Char    | 16 bit unsigned Unicode character      |                                                              |
| String  | sequence of characters                 |                                                              |
| Boolean | true or false                          |                                                              |
| Unit    | Void                                   | ```val unit1 = ()```                                         |
| Nothing | literally nothing                      | ```val nothing:Nothing = throw new Exception```              |
| Null    | null                                   | ```val danger =null```                                       |
| Any     | any datatype                           |                                                              |
| AnyRef  |                                        |                                                              |

![Scala Type Hierarchy](https://docs.scala-lang.org/resources/images/tour/unified-types-diagram.svg)

## Scala Type Hierarchy

Any is the supertype of all types, also called the top type. It defines certain universal methods such as `equals`, `hashCode`, and `toString`. `Any` has two direct subclasses: `AnyVal` and `AnyRef`.

`AnyVal` represents value types. There are nine predefined value types and they are non-nullable: `Double`, `Float`, `Long`, `Int`, `Short`, `Byte`, `Char`, `Unit`, and `Boolean`.

`AnyRef` represents reference types. All non-value types are defined as reference types. Every user-defined type in Scala is a subtype of `AnyRef`. If Scala is used in the context of a Java runtime environment, `AnyRef` corresponds to `java.lang.Object`.

##  Literals

A literal or literal data is data that appears directly in source code.

ex . : number 5, character A, text "Hello World"

These are immutable in nature by default.

- INTEGER
- FLOATING POINT
- BOOLEAN
- CHARACTER
- STRING
- MULTILINE STRING



- The return type of function is determined by the type of last expression present in the function.

- In Scala, there are no static variables or methods. Scala uses singleton object, which is essentially class with only one object in the source file. Singleton object is declared by using object instead of class keyword.

- In Scala, computation is lazy by default. Scala evaluates expressions only when they are required. You can declare a lazy variable by using lazy keyword. It is used to increase performance.

- Hexadecimal literal 

  - ```scala
    val a1 = 0xf
    println(a1) //15
    ```
  



* Numeric literal

  * ```scala
    val a:Long=1234567894613144488L
    print(a)
    ```

  * similarly 

    * Float : F
    * Double : D

## static vs dynamic 

[here](https://hackernoon.com/i-finally-understand-static-vs-dynamic-typing-and-you-will-too-ad0c2bd0acc7)



### def vs val

![image](https://user-images.githubusercontent.com/64080063/128724179-ac197d6b-0338-4088-bda9-42634f2008c0.png)





```scala
object tut{
  def main(args:Array[String]):Unit={

    println("-"*50)

    val const = {
      println("binding const to 1337")
      1337
    }
//    println(const)
//    println(const)

    println("-"*50)

    var let = {
      println("binding let to 1338")
      1338
    }
//    println(let)
//    println(let)
    let = {
      println("increasing let")
      let+1
    }
    println(let)

    println("-"*50)

    def function = {
      println("binding function to 1338")
      println("but only when it is called")
      1338
    }
    println(function)
    println("-"*50)
  }
}

```

```scala
--------------------------------------------------
binding const to 1337
--------------------------------------------------
binding let to 1338
increasing let
1339
--------------------------------------------------
binding function to 1338
but only when it is called
1338
--------------------------------------------------
```



## type

used to give alias

```scala
type i=Int
val a:i =4
println(a)
```



## String Interpolation

```scala
val a:Long=1234567894613144488L
println(s"$a is of type Long")

println(s"${a+10} is also a Long")
```

```scala
val height = 1.9d
val name = "James"
println(f"$name%s is $height%2.2f meters tall")  // James is 1.90 meters tall
```

```scala
println(s"a\nb")
```

a

b

```scala
println(raw"a\nb")
```

a\nb



## Loops

```scala
import scala.annotation.tailrec

println("-"*50)
@tailrec
def loop(acc:Int=0):Unit={
  if(acc<10){
    println(acc)

    loop(acc+1)
  }
}
loop()
println("-"*50)
```

```scala
--------------------------------------------------
0
1
2
3
4
5
6
7
8
9
--------------------------------------------------
```



```scala
println("-"*50)

def res() = {
var acc = 0

  while (acc < 10) {
    println(acc)
    acc += 1
  }
}
res()
println("-"*50)
```
```scala
--------------------------------------------------
0
1
2
3
4
5
6
7
8
9
--------------------------------------------------
```



## Higher Order Functions

Higher order functions take other functions as parameters or return a function as a result. 

This is possible because functions are first-class values in Scala. 

```scala
val salaries = Seq(20000, 70000, 40000)
val doubleSalary = (x: Int) => x * 2  //annonymous function
val newSalaries = salaries.map(doubleSalary) // List(40000, 140000, 80000)
```



```scala
println("-"*50)

def higherOrderFunction(f:Int=>Float):Unit = {
var acc = 0

  while (acc < 10) {
    println(f(acc))
    acc += 1
  }
}

def render(n:Int)=n

higherOrderFunction(render)
println("-"*50)
```

```scala
--------------------------------------------------
0.0
1.0
2.0
3.0
4.0
5.0
6.0
7.0
8.0
9.0
--------------------------------------------------
```

## Nested Functions

```scala
def factorial(x: Int): Int = {
   def fact(x: Int, accumulator: Int): Int = {
     if (x <= 1) accumulator
     else fact(x - 1, x * accumulator)
   }  
   fact(x, 1)
}

println("Factorial of 2: " + factorial(2))
println("Factorial of 3: " + factorial(3))
```

```
Factorial of 2: 2
Factorial of 3: 6
```



## Classes

Classes in Scala are blueprints for creating objects. They can contain methods, values, variables, types, objects, traits, and classes which are collectively called *members*.

```scala
object tut{
  def main(args:Array[String]):Unit= {
    println("-"*50)

    class Calculate(a:Int){
      println("body of the class is executed during construction")

      def add(b:Int):Int=a+b
      def subtract(b:Int):Int=a-b
    }
    val c = new Calculate(1)
    println(c.add(5))
    println(c.subtract(1))

    println("-"*50)
  }
}
```

```
--------------------------------------------------
body of the class is executed during construction
6
0
--------------------------------------------------
```

Primary constructor parameters with `val` and `var` are public. However, because `val`s are immutable, you can’t write the following.

```scala
class Point(val x: Int, val y: Int)
val point = new Point(1, 2)
point.x = 3  // <-- does not compile
```

Parameters without `val` or `var` are private values, visible only within the class.

```scala
class Point(x: Int, y: Int)
val point = new Point(1, 2)
point.x  // <-- does not compile
```



## Traits

A trait is like an interface with a partial implementation. In scala, trait is a collection of abstract and non-abstract methods.

```scala
println("-"*50)
trait Printable{
  def print():Unit
}

class A4 extends Printable{
  def print(){
    println("Hello")
  }
}

val a = new A4()
a.print()

println("-"*50)
```

```
--------------------------------------------------
Hello
--------------------------------------------------
```

If a class extends a trait but does not implement the members declared in that trait, it must be declared abstract.

```scala
trait Printable{
  def print()
}

abstract class A4 extends Printable{      // Must declared as abstract class  
  def printA4(){
    println("Hello, this is A4 Sheet")
  }
}
```

If a class implements multiple traits, it will extend the first trait, class, abstract class. with keyword is used to extend rest of the traits.

We can achieve multiple inheritances by using trait.

```scala
trait Printable{
  def print()
}

trait Showable{
  def show()
}

class A6 extends Printable with Showable{
  def print(){
    println("This is printable")
  }
  def show(){
    println("This is showable");
  }
}

object MainObject{
  def main(args:Array[String]){
    var a = new A6()
    a.print()
    a.show()
  }
}
```



## Access Modifiers

**Access Modifiers** in scala are used to define the access field of members of packages, classes or objects in scala.We can apply accessibly to classes, traits, data members, member methods and constructors etc.

| Modifier                    | Outside package | Package | Class | Subclass | Companion |
| :-------------------------- | :-------------- | :------ | :---- | :------- | :-------- |
| No access modifier / Public | Yes             | Yes     | Yes   | Yes      | Yes       |
| Protected                   | No              | No      | Yes   | Yes      | Yes       |
| Private                     | No              | No      | Yes   | No       | Yes       |

* **Protected:** They can be only accessible from sub classes of the base class in which the member has been defined.

```scala
class C1{
  protected val a = 9
}

class c2 extends C1{
  def display(): Unit ={
    println(a)
  }
}
object tut{
  def main(args:Array[String]):Unit= {
    println("-"*50)
    val c = new c2
    c.display()
    println("-"*50)
  }
}
```

```
--------------------------------------------------
9
--------------------------------------------------
```



## Scope of Protection in Scala

Access modifiers in Scala can be augmented with qualifiers.

A modifier of the form private[X] or protected[X] means that access is private or protected **up to X** , where X designates some enclosing package, class or singleton object





## Control Structure in Scala

* if
* [while](## Higher Order Functions)
* do while



## for



```scala
for (var x <- Range){
      statement(s);
}
```



```scala
object loop {
  def main(args:Array[String]): Unit ={
    var a = 0
    for (a<-1 until 10){
      println("Value of a : "+a)
    }
  }
}

# 1...9

```



```scala
object loop {
  def main(args:Array[String]): Unit ={
    var a = 0
    for (a<-1 to 10){
      println("Value of a : "+a)
    }
  }
}

# 1...10

```



```scala
object loop {
  def main(args:Array[String]): Unit ={
    var a = 0
    var b=0
    // nested loop
    for (a<-1 to 3;b<-1 to 3){
      println("Value of a : "+a)
      println(f"Value of b : $b")
    }
  }
}
```



**With collections**

```scala
object loop {
  def main(args:Array[String]): Unit ={
   var a = 0
    val numList = List(1,2,3,4,5,6)
    for(a<-numList){
      println(f"value of a : $a")
    }
  }
}

value of a : 1
value of a : 2
value of a : 3
value of a : 4
value of a : 5
value of a : 6
```



```scala
object loop {
  def main(args:Array[String]): Unit ={
   var a = 0
    val numList = List(1,2,3,4,5,6)
    for(a<-numList  if (a % 2==0); if (a>2))
        {
          println(f"value of a : $a")
        }
  }
}
```



```scala
object loop {
  def main(args:Array[String]): Unit ={
   var a = 0
    val numList = List(1,2,3,4,5,6)
    var retVal = for(a<-numList  if (a % 2==0); if (a>2))
        yield a
    for (a<-retVal)
      println(a)
  }
}

4
6
```





## Closure

Function bundled with its lexical environment

```scala
object closure {
  def main(args:Array[String]): Unit ={
    def x()={
      val b = 9
       def y(a:Int) ={
        a+b
      }
      y(8)
    }
    print(x())
  }
}
```



## Pattern Matching

```scala
def myTest(x: Any) = {
      x match {
        case i: Integer => "It's an Integer = " + i
        case s: String  => "It's an String = " + s
        case d: Double  => "It's a double = " + d
        case _ => "Opps! Somthing Else"
      }
    }
    println(myTest("abc"))
    println(myTest(2.5))
    println(myTest(2))
    println(myTest(1 to 10))
```

