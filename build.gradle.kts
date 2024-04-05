// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false
    id("com.google.devtools.ksp") version "1.9.23-1.0.19"  apply  false
    id("com.google.dagger.hilt.android")version "2.50" apply false
}

buildscript {
    repositories {
        maven {
            setUrl("https://oss.sonatype.org/content/repositories/snapshots/")
        }
        // You can include other repositories here if necessary
    }
    dependencies {
        // Classpath dependencies for your build scripts go here
    }
}