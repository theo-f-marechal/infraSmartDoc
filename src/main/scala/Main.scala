object Main{
  def main(args: Array[String]): Unit = {
    kafkaProducer.sendReport("test",1,"lol")
    println("main")
    kafkaConsumer.kafkaConsumer()
  }
}
