object Main{
  def main(args: Array[String]): Unit = {
    //Image.fromFolderToByte("images/")
    kafkaProducer.sendReport("test",1,"test1")
    kafkaProducer.sendReport("test",1,"test2")
    println("main")
    kafkaConsumer.ConsumeAll()
  }
}
