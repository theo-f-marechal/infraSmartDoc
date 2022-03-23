import java.io.File
import javax.imageio.ImageIO
import Image.imageToBytes

object Main{
  def main(args: Array[String]): Unit = {
    println(Image.fromFolderToByte("images/"))
    kafkaProducer.sendReport("test",1,"lol")
    println("main")
    kafkaConsumer.kafkaConsumer()
  }
}
