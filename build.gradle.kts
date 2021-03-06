plugins {
	eclipse
    java
    id("org.springframework.boot") version "2.2.2.RELEASE"
    id("io.spring.dependency-management") version "1.0.9.RELEASE"
}

group = "gr.home"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = org.gradle.api.JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    annotationProcessor("org.projectlombok", "lombok")

    compileOnly("org.projectlombok", "lombok")

    implementation("javax.persistence", "javax.persistence-api")
    implementation("org.springframework.boot","spring-boot-starter-data-rest")
    implementation("org.springframework.boot", "spring-boot-starter-data-mongodb")


    testImplementation("org.mongodb", "mongodb-driver-sync", "3.11.2")
    testImplementation("de.flapdoodle.embed", "de.flapdoodle.embed.mongo", "2.2.0")

    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.3.1")
    testImplementation("org.junit.jupiter", "junit-jupiter-params", "5.3.1")
    testImplementation("org.junit.jupiter", "junit-jupiter-engine", "5.3.1")

    testImplementation("org.springframework.boot", "spring-boot-starter-web")
    testImplementation("org.springframework.boot", "spring-boot-starter-webflux")
    testImplementation("org.springframework.boot", "spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }

    testImplementation("com.google.code.gson", "gson", "2.8.6")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
