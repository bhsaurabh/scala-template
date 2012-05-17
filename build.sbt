name := "scala_template"

version := "1.0"

scalaVersion := "2.9.1"

libraryDependencies += "joda-time" % "joda-time" % "2.0"

libraryDependencies += "org.joda" % "joda-convert" % "1.2"

libraryDependencies +=  "org.clapper" % "argot_2.9.1" % "0.3.5"

libraryDependencies +=  "com.google.guava" % "guava" % "11.0.1"

seq(assemblySettings: _*)