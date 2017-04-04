package de.nephtys.buildinfo

/**
  * Created by Christopher on 04.04.2017.
  */
object InfoMain extends App{

  println("Hello World:")

  (1 to 10).foreach(i => {
    println(CurrentInfo.GitShortCommitHexcode)
    println(CurrentInfo.Date)
    Thread.sleep(100)
  })
}
