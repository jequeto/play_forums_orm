name := "play_forums_orm_new"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "mysql" % "mysql-connector-java" % "5.1.18",
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

// javacOptions += "-Xlint:unchecked" 
