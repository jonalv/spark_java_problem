name := "Spark Java Example"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.5"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.4.5"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.1.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.1" % "test"
libraryDependencies += "org.scalatestplus"  %% "scalatestplus-junit" % "1.0.0-M2"  % "test"

libraryDependencies += "org.junit" % "junit-bom" % "5.6.2" 
libraryDependencies += "com.novocode" % "junit-interface" % "0.8" % "test->default"
