spark-submit --name {{cookiecutter.app_name}} --master yarn-cluster --driver-memory 1g --class {{cookiecutter.entryclass}} target/scala-2.10/{{cookiecutter.jarfile}}
