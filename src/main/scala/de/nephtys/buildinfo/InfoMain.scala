package de.nephtys.buildinfo

import java.io.File

import org.eclipse.jgit.api.Git

/**
  * Created by Christopher on 04.04.2017.
  */
object InfoMain extends App{

  println("Hello World:")


  (1 to 10).foreach(i => {
    //println(BuiltInfo.GitShortCommitHexcode())
    println(CurrentInfo.GitShortCommitHexcode())
    //println(BuiltInfo.DateStr())
    println(CurrentInfo.DateStr())
    Thread.sleep(10)
  })



  val status = Git.open(new File(".")).status().call().getModified.toArray.toList
  println(status)
}
