package de.nephtys.buildinfo

import java.time.LocalDateTime

import scala.util.{Failure, Success, Try}

/**
  * Created by Christopher on 04.04.2017.
  */
object CurrentInfo {

  def Date : LocalDateTime = LocalDateTime.now()

  private final val gitcmd = "git rev-parse --short HEAD"
  def GitShortCommitHexcode : String = {
    import sys.process._
    val t = Try(gitcmd !!)
    var s = t match {
      case Success(e) => e
      case Failure(e) => e.getMessage
    }
    //println(s"GitResult: $s")
    s
  }
}
