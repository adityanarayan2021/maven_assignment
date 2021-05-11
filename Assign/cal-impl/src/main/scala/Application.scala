class Application {
  val store = new Calculator()
}
object result {
  def main(args: Array[String]): Unit = {
    val results = new Application()
    println("Addition "+results.store.add(10,2))
    println("Subtraction "+results.store.subtract(20,5))
    println("Multiply "+results.store.multiply(5,3))
    println("Division "+results.store.divide(30,2))
  }
}
