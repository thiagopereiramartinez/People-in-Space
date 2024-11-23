plugins {
    kotlin("multiplatform")
    application
    kotlin("plugin.serialization")
    id("com.github.johnrengelman.shadow")
}


kotlin {
    jvm() {
        withJava()
    }

    sourceSets {
        jvmMain.dependencies {
            implementation(libs.kotlinx.coroutines)
            implementation(libs.kotlinx.serialization)

            implementation("io.ktor:ktor-server-core:3.0.0")
            implementation("io.ktor:ktor-server-netty:3.0.0")
            implementation("io.ktor:ktor-server-cors:3.0.0")
            implementation("io.ktor:ktor-serialization-kotlinx-json:3.0.0")
            implementation("io.ktor:ktor-server-content-negotiation:3.0.0")

            implementation("ch.qos.logback:logback-classic:1.5.8")

            implementation(projects.common)
        }
    }
}

application {
    mainClass.set("ServerKt")
}