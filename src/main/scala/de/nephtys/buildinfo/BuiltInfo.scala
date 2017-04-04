package de.nephtys.buildinfo


import java.time.LocalDateTime

import scala.language.experimental.macros

/**
  * Created by Christopher on 04.04.2017.
  */
object BuiltInfo{

  import scala.meta._

  def BuildDate() : LocalDateTime = ???


  def GitShortCommitHexcode() : String = ???





  /*
  import scala.language.experimental.macros

  // This function exposed to consumers has a normal Scala type:
  def factorial(n: Int): Int =
  // but it is implemented as a macro:
  macro CompileTimeFactorial.factorial_impl


  // The macro implementation will receive a 'Context' and
  // the AST's of the parameters passed to it:
  def factorial_impl(c: Context)(n: c.Expr[Int]): c.Expr[Int] = {
    import c.universe._

    // We can pattern-match on the AST:
    n match {
      case Expr(Literal(Constant(nValue: Int))) =>
        // We perform the calculation:
        val result = normalFactorial(nValue)
        // And produce an AST for the result of the computation:
        c.Expr(Literal(Constant(result)))
      case other =>
        // Yes, this will be printed at compile time:
        println("Yow!")
        ???
    }
  }

  // The actual implementation is regular old-fashioned scala code:
  private def normalFactorial(n: Int): Int =
    if (n == 0) 1
    else n * normalFactorial(n - 1)*/
}
