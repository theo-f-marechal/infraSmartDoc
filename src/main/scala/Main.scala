import java.io.File
import javax.imageio.ImageIO
import Image.imageToBytes

object Main{
  def main(args: Array[String]): Unit = {
    val img = ImageIO.read(new File("images/padoru.jpeg"))
    kafkaProducer.sendReport("test",1,"lol")
    println("main")
    kafkaConsumer.kafkaConsumer()
  }
}
