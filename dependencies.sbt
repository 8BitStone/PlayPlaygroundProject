resolvers += "informaticon" at "https://maven.devops.informaticon.com"
credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

libraryDependencies ++= Seq(
  guice,
  jdbc,
  "com.h2database" % "h2" % "1.4.199",
  "mysql" % "mysql-connector-java" % "8.0.17",
  "org.awaitility" % "awaitility" % "3.1.6" % Test,
  "org.assertj" % "assertj-core" % "3.12.2" % Test,
  "org.mockito" % "mockito-core" % "3.0.0" % Test,
  // To provide an implementation of JAXB-API, which is required by Ebean.
  "javax.xml.bind" % "jaxb-api" % "2.3.1",
  "javax.activation" % "activation" % "1.1.1",
  "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.2",

  "com.informaticon" % "lib.java.base.notify" % "0.3.0",
  "com.informaticon" %% "lib.play.base.auth" % "1.4.5",
  "com.informaticon" %% "lib.play.base.i18n" % "1.2.1",
  "com.informaticon" %% "lib.play.base.logging" % "1.1.1"
,
)