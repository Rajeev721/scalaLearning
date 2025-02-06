name := "project-name"
version := "0.1"
scalaVersion := "2.13.6"

lazy val root = (project in file("."))
  .settings(
    name := "scalaLearning"
  )

libraryDependencies ++= Seq(

  // other dependencies

  "org.scalatest" %% "scalatest" % "3.2.9" % Test

)