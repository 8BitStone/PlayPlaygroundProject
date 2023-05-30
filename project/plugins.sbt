addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.8.19")
addSbtPlugin("com.typesafe.sbt" %% "sbt-play-ebean" % "6.0.0")

// plugins.sbt
resolvers += "informaticon" at "https://maven.devops.informaticon.com"
credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

addSbtPlugin("com.informaticon" % "lib.sbt.base.npm-webpack-plugin" % "0.2.0")