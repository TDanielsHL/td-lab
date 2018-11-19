name := "TD Lab"
version := "0.0.1"
scalaVersion := "2.12.7"
organization := "com.hautelook"

resolvers in Global ++= Seq(
  "Sbt plugins"                   at "https://dl.bintray.com/sbt/sbt-plugin-releases",
  "Maven Central Server"          at "http://repo1.maven.org/maven2",
  "Artima Maven Repository"       at "http://repo.artima.com/releases"
  "TypeSafe Repository Releases"  at "http://repo.typesafe.com/typesafe/releases/",
  "TypeSafe Repository Snapshots" at "http://repo.typesafe.com/typesafe/snapshots/"
)


libraryDependencies ++= Seq(
	"org.scalactic" %% "scalactic" % "3.0.5"
	"org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

assemblyJarName in assembly := "TDLab.jar"