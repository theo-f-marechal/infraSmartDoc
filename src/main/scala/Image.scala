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



  def b2rgb(b: Byte): (Int,Int,Int,Int) =(b & 0xff000000 >>> 24, b & 0xff0000 >> 16, b & 0xff00 >> 8, b & 0xff)

  def run(): Unit = Process("python3 ./src/main/python/ptest.py").!!

}
