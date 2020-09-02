import java.net.URL

plugins {
    kotlin("multiplatform") version "1.4.0-rc"
    id("org.jetbrains.dokka")
}

group = "me.marcinaman"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
//    maven("https://dl.bintray.com/kotlin/kotlin-dev")
//    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
    jcenter()
}

kotlin {
    jvm {}
    sourceSets {
        val commonMain by getting {}
    }
}

tasks.dokkaHtml {
    outputDirectory.set(buildDir.resolve("dokka"))
    dokkaSourceSets {
        val commonMain by creating {
            sourceLink {
                localDirectory.set(File("commonMain/src/kotlin"))
                remoteUrl.set(URL("https://google.com"))
                remoteLineSuffix.set("#L")
            }
        }
    }
}