object Main{
  def main(args: Array[String]): Unit = {
    println(Image.fromFolder("images"))
    kafkaProducer.sendReport("test",1,"lol")
    println("main")
    kafkaConsumer.kafkaConsumer()
  }
}
