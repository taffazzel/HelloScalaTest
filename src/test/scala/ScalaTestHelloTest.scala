import org.scalatest._

@DoNotDiscover
class ScalaTestHelloTest extends FlatSpec with Matchers{
  "ScalaTestHello" should "divide 2 numbers" in {
    ScalaTestHello.divide(10,5) should be (1)
  }

  it should "throw ArithmaticException if attempted to divide by 0" in {
    a[java.lang.ArithmeticException] should be thrownBy {
      ScalaTestHello.divide(20,0)
    }
  }
}
