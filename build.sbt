name := "ScalaBuildInfo"

version := "1.0-SNAPSHOT"

organization := "de.nephtys"

scalaVersion := "2.11.9"

libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value

// https://mvnrepository.com/artifact/org.eclipse.jgit/org.eclipse.jgit
libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % "4.6.1.201703071140-r"
