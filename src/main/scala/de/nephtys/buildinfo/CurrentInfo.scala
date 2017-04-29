package de.nephtys.buildinfo

import java.time.LocalDateTime

import scala.util.{Failure, Success, Try}

/**
  * Created by Christopher on 04.04.2017.
  */
object CurrentInfo {

  def Date() : LocalDateTime = LocalDateTime.now()

  def DateStr() : String = Date().toString

  private final val gitcmd = "git rev-parse --short HEAD"


  def GitShortCommitHexcode() : String = {

	Try( {

    import sys.process._
    val t = Try({
      val q = gitcmd !!

      println(Date().toString + " : SHORT COMMIT SHA1: " + q)
      q
    })
    var s = t match {
      case Success(e) => e
      case Failure(e) => e.getMessage
    }
    s
}).toOption.getOrElse("N/A")
  }


}
