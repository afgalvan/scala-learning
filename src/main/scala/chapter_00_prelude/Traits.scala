package chapter_00_prelude

object Traits extends App {

  trait Speaker {
    def speak(): String // has no body, so it’s abstract
  }

  trait TailWagger {
    def startTail(): String = "tail is wagging"
    def stopTail(): String  = "tail is stopped"
  }

  trait Runner {
    def startRunning(): String = "I’m running"
    def stopRunning(): String  = "Stopped running"
  }

  class Dog(name: String) extends Speaker with TailWagger with Runner {
    def speak(): String           = "Woof!"
    override def toString: String = name
  }

  class Cat extends Speaker with TailWagger with Runner {
    def speak(): String                 = "Meow"
    override def startRunning(): String = "Yeah ... I don’t run"
    override def stopRunning(): String  = "No need to stop"
  }

  val dog = new Dog("Otis")
  println(dog.speak())
  println(dog.startRunning())

  val cat = new Cat
  println(cat.speak())
  println(cat.startRunning())
}
