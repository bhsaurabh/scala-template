-> How to get started:

Create an intellij idea project from the source

	$sbt gen-idea

Create a jar file containing all dependent jars

	$sbt assembly

Start the complex sample application

	$java -cp /Users/florian/code/scala-template/target/scala_template-assembly-1.0.jar com.airbnb.HelloWorld
