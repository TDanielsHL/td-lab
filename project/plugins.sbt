resolvers ++= Seq(
	Resolver.sonatypeRepo("public")
)

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.8")
