import dev.arbjerg.lavalink.gradle.gitHash

plugins {
    java
    id("dev.arbjerg.lavalink.gradle-plugin")
}

group = "dev.schlaubi.lavalink.example"
version = "1.0.0"

dependencies {
    // Only here to test dependency handling
    // And Kotlin is best dependency <3
    implementation(kotlin("stdlib", "1.8.22"))
}

lavalinkPlugin {
    apiVersion = "4.0.0-beta.1"
    serverVersion = gitHash("fc51c58e0168b63cc9d6ed37f1adc7ef369c46a3")
}
