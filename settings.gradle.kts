pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }

    plugins {
        kotlin("multiplatform") version "1.5.30" apply false
        id("com.google.devtools.ksp") version "1.5.30-1.0.0" apply false
    }
}

rootProject.name = "mockative"

include(":shared")
include(":mockative")
include(":mockative-processor")
include(":mockative-test")
