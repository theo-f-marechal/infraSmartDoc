import java.io.File
import javax.imageio.ImageIO

object Main{
  def main(args: Array[String]): Unit = {
    val img = ImageIO.read(new File("images/padoru.jpeg"))
    println(img.getRGB(1,1).toByte)
    kafkaProducer.sendReport("test",1,"lol")
    println("main")
    kafkaConsumer.kafkaConsumer()
  }
}
