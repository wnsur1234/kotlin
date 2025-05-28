plugins {
    kotlin("jvm") version "2.1.20"
}

group = "com.inflearn"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.seleniumhq.selenium:selenium-java:4.30.0")
    implementation("io.github.bonigarcia:webdrivermanager:6.1.0")
    implementation("dev.langchain4j:langchain4j:1.0.1")
    implementation("dev.langchain4j:langchain4j-google-ai-gemini:1.0.1-beta6")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}