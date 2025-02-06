import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class HelloWorldTest extends AnyFlatSpec with Matchers {
  "The application" should "return the correct result" in {
    assert(1 + 1 == 2)
  }
}