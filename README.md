# W4DataStructures_SWMaintenance

To run menu update build.gradle
´´´
plugins {
id 'application'
}

apply plugin : "java"
ext {
javaMainClass = "MainClass"
}

task runWithExecJarExecutable(type: Exec) {
dependsOn jar
group = "Execution"
description = "Run the output executable jar with ExecTask"
commandLine "java", "-jar", jar.archiveFile.get()
}

task runWithJavaExec(type: JavaExec) {
group = "Execution"
description = "Run the main class with JavaExecTask"
classpath = sourceSets.main.runtimeClasspath
main = javaMainClass
}

task runWithExec(type: Exec) {
dependsOn build
group = "Execution"
description = "Run the main class with ExecTask"
commandLine "java", "-classpath", sourceSets.main.runtimeClasspath.getAsPath(), javaMainClass
}

run {
standardInput = System.in
}
´´´

in console

$ ./gradlew build
$ ./gradlew --console plain run

