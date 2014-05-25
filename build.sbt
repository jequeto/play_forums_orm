name := "play_forums_orm_new"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings

javacOptions += "-Xlint:unchecked" 