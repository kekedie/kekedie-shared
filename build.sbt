name := """kekedie-shared"""

organization := "com.github.kekedie"

version := "1.0"

scalaVersion := "2.11.7"

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"
