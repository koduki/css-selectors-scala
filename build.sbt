organization := "cn.orz.pascal"

name := "css-selectors-scala-uo"

version := "0.1.1"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-Xcheckinit", "-Xmigration", "-encoding", "UTF-8")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "1.6.1" % "test"
)

publishMavenStyle := true

publishTo := Some(Resolver.file("local-github-repos", file("../maven-repos")))

publishArtifact in Test := false

pomIncludeRepository := { x => false }

pomExtra := (
  <url>http://github.com/chrsan/css-selectors-scala</url>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:chrsan/css-selectors-scala.git</url>
    <connection>scm:git:git@github.com:chrsan/css-selectors-scala.git</connection>
  </scm>
  <developers>
    <developer>
      <id>chrsan</id>
      <name>Christer Sandberg</name>
      <url>http://chrsan.github.com</url>
    </developer>
  </developers>)
