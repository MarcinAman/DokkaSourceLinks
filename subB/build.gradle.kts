import java.net.URL

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.dokka")
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
        val jvmMain by getting {
            sourceLink {
                localDirectory.set(File("jvmMain/kotlin/"))
                remoteUrl.set(URL("https://google.com"))
                remoteLineSuffix.set("#L")
            }
        }
    }
}
