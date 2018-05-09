import org.scalatest._

class DemoTest() extends FlatSpec with Matchers {

	"Myutil" should "Multiply 2 numbers" in {
		MyUtil.multiply(10,5) should be (50)
	}
	
	it should "let adults vote" in {
		MyUtil.canVote(18) should be (true)
	}
}