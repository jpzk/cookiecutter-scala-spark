import AssemblyKeys._

assemblySettings

// your assembly settings here
mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
  {
    case PathList("META-INF", "ECLIPSEF.RSA", xs @ _*) => MergeStrategy.last
    case PathList("META-INF", "mailcap", xs @ _*) => MergeStrategy.last
    case PathList("META-INF", "maven", "org.slf4j", xs @ _*) => MergeStrategy.last
    case PathList("com", "esotericsoftware", "minlog", xs @ _*) => MergeStrategy.last
    case PathList("org", "apache", "commons", "beanutils", xs @ _*) => MergeStrategy.last
    case PathList("org", "apache", "commons", "collections", xs @ _*) => MergeStrategy.last
    case PathList("org", "apache", "commons", "logging", xs @ _*) => MergeStrategy.last
    case PathList("org", "apache", "commons", "codec", xs @ _*) => MergeStrategy.last
    case PathList("plugin.properties", xs @ _*) => MergeStrategy.last
    case PathList("org", "slf4j", xs @ _*) => MergeStrategy.last
    case PathList("org", "mockito", xs @ _*) => MergeStrategy.last
    case PathList("org", "cyberneko", "html", _ *) => MergeStrategy.first
    case x => old(x)
  }
}

jarName in assembly := "{{cookiecutter.jarfile}}"
