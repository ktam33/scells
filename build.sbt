ThisBuild / scalaVersion := "2.12.12"
ThisBuild / organization := "org.stairwaybook"

lazy val main = (project in file("."))
    .settings(
        name := "scells",
        libraryDependencies += "org.scala-lang.modules" % "scala-swing_2.12" % "3.0.0",
        libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
        
    )