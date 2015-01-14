# cookiecutter-scala-spark

The template includes a build.sbt, an assembly.sbt and scripts to submit the spark application to a YARN cluster (run the scripts in top-level folder like `/bin/run-local.sh`. Feel free to fork and to add other scripts. 

## Generate a Project Skeleton

This is a cookiecutter template for Scala Spark applications. You need to install cookiecutter first. 

  <pre># pip install cookiecutter</pre>

<pre>
  $ cookiecutter https://github.com/jpzk/cookiecutter-scala-spark.git
  Cloning into 'cookiecutter-scala-spark'...
  remote: Counting objects: 32, done.
  remote: Compressing objects: 100% (25/25), done.
  remote: Total 32 (delta 12), reused 25 (delta 5)
  Unpacking objects: 100% (32/32), done.
  Checking connectivity... done.

  project_name (default is "My Scala Spark Application")? 
  app_name (default is "sparkapp")? 
  project_short_description (default is "A Scala Spark Application")? 
  jarfile (default is "sparkapp.jar")? 
  version (default is "0.0.1")? 
  scala_version (default is "2.10.4")? 
  org_package (default is "org.something")? 
  org_name (default is "Organization")? 
  org_website (default is "Some(url("http://www.somesite.com"))")? 
</pre>
