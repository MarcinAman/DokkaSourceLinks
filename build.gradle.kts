plugins {
//    kotlin("multiplatform") version "1.4.0"
    id("org.jetbrains.dokka") version "1.4.10-SNAPSHOT"
}
group = "me.marcinaman"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
}
//kotlin {
//    jvm {
//        compilations.all {
//            kotlinOptions.jvmTarget = "11"
//        }
//        withJava()
//    }
//    sourceSets {
//        val jvmMain by getting
//        val jvmTest by getting {
//            dependencies {
//                implementation(kotlin("test-junit"))
//            }
//        }
//        val commonMain by getting
//        val commonTest by getting {
//            dependencies {
//                implementation(kotlin("test-common"))
//                implementation(kotlin("test-annotations-common"))
//            }
//        }
//    }
//}
//
//subprojects {
//    plugins.apply("org.jetbrains.dokka")
//    repositories {
//        mavenCentral()
//        mavenLocal()
//        jcenter()
//    }
//}