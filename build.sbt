name := "My_Test"

version := "2.0.0"

scalaVersion := "2.11.11"
scapegoatVersion in ThisBuild := "1.1.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % "test"
lazy val root = (project in file(".")).enablePlugins(SonarRunnerPlugin)
wartremoverErrors ++= Warts.unsafe
