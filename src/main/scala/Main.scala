import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.SparkSession

object Main{
  def main(args: Array[String]): Unit = {
    Logger.getLogger("org").setLevel(Level.OFF)
    Logger.getLogger("akka").setLevel(Level.OFF)
    //Image.fromFolderToByte("images/")
    kafkaProducer.sendReport("test",1,"test1")
    kafkaProducer.sendReport("test",1,"test2")
    println("main")
    kafkaConsumer.consumeAll()
  }
}
