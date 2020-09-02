plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
}

//tasks.dokkaHtml {
//    dokkaSourceSets {
//        val jvmMain by getting {
//            sourceLink {
//                localDirectory.set(File("jvmMain/src/kotlin"))
//                remoteUrl.set(URL("https://google.com"))
//                remoteLineSuffix.set("#L")
//            }
//        }
//    }
//}
