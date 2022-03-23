import java.awt.image.BufferedImage
import sys.process._
import java.io.File
import javax.imageio.ImageIO
import scala.collection.mutable.ListBuffer

object Image{

  def getListOfFiles(dir: String):List[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.filter(_.isFile).toList
    } else {
      List[File]()
    }
  }

  def fromFolderToByte(path: String): Unit = {
    val files = getListOfFiles(path)
    files.foreach( file => imageToBytes(ImageIO.read(file)))
  }

  def imageToBytes(img : BufferedImage): List[List[Byte]] = {
    val imgBytes = new ListBuffer[List[Byte]]()
    val bytes = new ListBuffer[Byte]()
    val height = img.getHeight()
    val width = img.getWidth()
    for ( j <- 0 to height) {
      bytes.clear()
      for ( i <- 0 to width) {
        val pixel = img.getRGB(i, j)
        bytes += pixel
      }
      imgBytes += bytes
    }
    imgBytes.toList
  }

  def bytesToImage(imgByteList : List[List[Byte]]) : List[List[(Int,Int,Int,Int)]] = {
    val height = imgByteList.length
    val width = imgByteList.head.length
    val imgRGBtemp = new ListBuffer[List[(Int,Int,Int,Int)]]()
    for ( j <- 0 to height) {
      for ( i <- 0 to width) {
        val pixel = b2rgb(imgByteList(j)(i))
        imgRGBtemp += pixel
      }
    }
    imgRGBtemp.toList
  }

  def b2rgb(b: Byte): (Int,Int,Int,Int) =(b & 0xff000000 >>> 24, b & 0xff0000 >> 16, b & 0xff00 >> 8, b & 0xff)

  def run(): Unit = Process("python3 ./src/main/python/ptest.py").!!

}
