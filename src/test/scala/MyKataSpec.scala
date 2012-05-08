import org.scalatest.FlatSpec

class MyKataSpec extends FlatSpec {
  it should "say something" in {
    val kata = new MyKata
    assert(kata.say("Hello World!") === "Hello World!")
  }
}
