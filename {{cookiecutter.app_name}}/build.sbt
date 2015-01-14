name := "{{cookiecutter.projectname}}"

version := "0.1.0"

scalaVersion := "2.10.4"

description := "{{cookiecutter.project_short_description}}"

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "1.1.0" % "provided",
"org.apache.spark" %% "spark-streaming" % "1.1.0" % "provided",
"org.apache.spark" %% "spark-mllib" % "1.1.0" % "provided",
"org.scalatest" %% "scalatest" % "2.2.1" % "test",
)
