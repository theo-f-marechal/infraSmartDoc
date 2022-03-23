object Main{
  def main(args: Array[String]): Unit = {
    Image.fromFolderToByte("images/")
    //kafkaProducer.sendReport("test",1,"test")
    kafkaConsumer.kafkaConsumer()
  }
}
