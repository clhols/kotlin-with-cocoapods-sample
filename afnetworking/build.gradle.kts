plugins {
    kotlin("multiplatform") version "1.4.0"
    kotlin("native.cocoapods") version "1.4.0"
}

group = "org.jetbrains.kotlin.sample"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    jcenter()
    maven { setUrl("https://dl.bintray.com/kotlin/kotlinx.html/") }
}

kotlin {
    ios()

    cocoapods {
        summary = "Kotlin sample project with CocoaPods dependencies"
        homepage = "https://github.com/Kotlin/kotlin-with-cocoapods-sample"

        ios.deploymentTarget = "13.5"

        //Example of usage remote Cocoapods dependency from Cocoapods repository
        pod("AFNetworking", "~> 4.0.0")

    }
}