name := "{{cookiecutter.project_name}}"

version := "{{cookiecutter.version}}"

scalaVersion := "{{cookiecutter.scala_version}}"

description := "{{cookiecutter.project_short_description}}"

organization := "{{cookiecutter.org_package}}"

organizationName := "{{cookiecutter.org_name}}"

homepage := Some(url("{{cookiecutter.org_website}})")

libraryDependencies ++= Seq(
"org.apache.spark" %% "spark-core" % "1.1.0" % "provided",
"org.apache.spark" %% "spark-streaming" % "1.1.0" % "provided",
"org.apache.spark" %% "spark-mllib" % "1.1.0" % "provided",
"org.scalatest" %% "scalatest" % "2.2.1" % "test"
)
