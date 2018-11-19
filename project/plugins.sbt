resolvers ++= Seq(
	Resolver.sonatypeRepo("public")
)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.8")
addSbtPlugin("com.artima.supersafe" % "sbtplugin" % "1.1.3")