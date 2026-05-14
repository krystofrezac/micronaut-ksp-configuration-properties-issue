plugins {
    id("org.jetbrains.kotlin.jvm") version "2.3.10"
    id("org.jetbrains.kotlin.plugin.allopen") version "2.3.10"
    id("com.google.devtools.ksp") version "2.3.8"
    id("io.micronaut.application") version "4.6.2"
}

version = "0.1"
group = "com.example"


val kotlinVersion=project.properties.get("kotlinVersion")

repositories {
    mavenCentral()
}

dependencies {
}



application {
    mainClass = "com.example.ApplicationKt"
}

java {
    sourceCompatibility = JavaVersion.toVersion("21")
}




graalvmNative.toolchainDetection = false





micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("com.example.*")
    }
}


tasks.named<io.micronaut.gradle.docker.NativeImageDockerfile>("dockerfileNative") {
    jdkVersion = "21"
}







