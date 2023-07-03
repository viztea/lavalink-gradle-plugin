plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
    id("com.gradle.plugin-publish") version "1.1.0"
    `maven-publish`
}

group = "dev.schlaubi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.arbjerg.dev/releases") {
        credentials {
            username = System.getenv("MAVEN_USERNAME")
            password = System.getenv("MAVEN_PASSWORD")
        }
    }
}

kotlin {
    jvmToolchain(17)
}

gradlePlugin {
    plugins {
        create("lavalink-gradle-plugin") {
            id = "dev.arbjerg.lavalink.gradle-plugin"
            implementationClass = "dev.arbjerg.lavalink.gradle.LavalinkGradlePlugin"

            displayName = "Lavalink Gradle Plugin"
            description = "Gradle plugin which makes it easier to create Lavalink plugins"
            tags = setOf("lavalink", "plugin", "discord")
        }

        website = "https://github.com/lavalink-devs/gradle-plugin"
        vcsUrl = "https://github.com/lavalink-devs/gradle-plugin"
    }
}
