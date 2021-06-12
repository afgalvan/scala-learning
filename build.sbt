name := "scala-learning"

version := "0.1"

scalaVersion := "2.13.6"

// TEST DEPENDENCIES
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test,
  "org.scalamock" %% "scalamock" % "5.1.0" % Test
)

addCommandAlias("t", "test")
addCommandAlias("to", "testOnly")
addCommandAlias("tq", "testQuick")
addCommandAlias("tsf", "testShowFailed")

addCommandAlias("c", "compile")
addCommandAlias("tc", "test:compile")

addCommandAlias("s", "scalastyle")
addCommandAlias("ts", "test:scalastyle")

addCommandAlias("f", "scalafmt")
addCommandAlias("ft", "scalafmtTest")
