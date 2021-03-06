package de.nephtys.buildinfo



import scala.language.experimental.macros
import scala.language.experimental.macros
import scala.reflect.macros.blackbox

/**
  * Created by Christopher on 04.04.2017.
  */
object BuiltInfo{


  //private val df = DateTimeFormatter.ISO_DATE_TIME
  //def Date() : LocalDateTime = LocalDateTime.parse(DateStr(), df)

  def DateStr() : String = macro date_impl

  def GitShortCommitHexcode() : String = CurrentInfo.GitShortCommitHexcode() //causes 128 error code in macro: macro git_impl


  def date_impl(c: blackbox.Context)():c.Expr[String] = {
    import c.universe._
    val result : String = CurrentInfo.Date().toString()
    c.Expr(Literal(Constant(result)))
  }
  def git_impl(c: blackbox.Context)():c.Expr[String] = {
    import c.universe._


    val result : String = CurrentInfo.GitShortCommitHexcode()
    c.Expr(Literal(Constant(result)))
  }

}
