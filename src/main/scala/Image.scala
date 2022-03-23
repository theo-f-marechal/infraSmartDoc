import sys.process._
import java.io.File
import javax.imageio.ImageIO

object Image{

  def getListOfFiles(dir: String):List[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.filter(_.isFile).toList
    } else {
      List[File]()
    }
  }

  def fromFolder(path: String): Unit = {
    val files = getListOfFiles(path)
  }

  val img = ImageIO.read(new File("photo.jpg"))
  img.getRGB(1,1).toByte

  def run(): Unit = Process("python3 ./src/main/python/ptest.py").!!

}
