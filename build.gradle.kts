plugins {
    id("java")
}

group = "sentinelguard"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.cloud:spring-cloud-starter-gateway:4.0.0")
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client:4.0.2")
    implementation("com.google.code.gson:gson:2.8.9")
    implementation("org.springframework.boot:spring-boot-starter-actuator:3.1.5")
    implementation("io.micrometer:micrometer-tracing-bridge-brave:1.0.2")
    implementation("io.zipkin.reporter2:zipkin-reporter-brave:2.16.3")
}