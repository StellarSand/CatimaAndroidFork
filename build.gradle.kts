// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    id("com.android.application") version "8.11.1" apply false
    id("org.jetbrains.kotlin.android") version "2.2.0" apply false
}

allprojects {
    tasks.withType<JavaCompile> {
        options.compilerArgs.add("-Xlint:deprecation")
    }
}
