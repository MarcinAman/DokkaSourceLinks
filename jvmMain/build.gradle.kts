import java.net.URL
import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    kotlin("jvm") version "1.4.0-rc"
    id("org.jetbrains.dokka")
}

repositories {
    mavenLocal()
//    maven("https://dl.bintray.com/kotlin/kotlin-dev")
//    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
    jcenter()
}

tasks.dokkaHtml {
    dokkaSourceSets {
        val jvmMain by getting {
            sourceLink {
                localDirectory.set(File("jvmMain/src/kotlin"))
                remoteUrl.set(URL("https://google.com"))
                remoteLineSuffix.set("#L")
            }
        }
    }
}