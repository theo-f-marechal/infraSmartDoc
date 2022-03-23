import sys.process._
import java.io.File

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
    files.map(path => )
  }

  def run(): Unit = Process("python3 ./src/main/python/ptest.py").!!

}
