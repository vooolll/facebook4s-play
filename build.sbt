name := "facebook4s-play"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.12.6"

resolvers += Resolver.sonatypeRepo("releases")

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "com.github.vooolll" %% "facebook4s" % "0.2.6"
)