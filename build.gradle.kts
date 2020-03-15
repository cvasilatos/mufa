plugins {
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
    implementation("javax.persistence", "javax.persistence-api")

    implementation("org.springframework.boot","spring-boot-starter")
    implementation("org.springframework.boot","spring-boot-starter-web")
    implementation("org.springframework.boot", "spring-boot-starter-hateoas")
    implementation("org.springframework.boot", "spring-boot-starter-data-jpa")
    implementation("org.springframework.cloud", "spring-cloud-starter", "2.2.2.RELEASE")

    testRuntimeOnly("com.playtika.testcontainers", "embedded-mongodb", "1.42")

    compileOnly("org.springframework.boot", "spring-boot-configuration-processor")
    compileOnly("org.projectlombok", "lombok")

    testCompileOnly("org.testcontainers", "testcontainers", "1.13.0")


    annotationProcessor("org.projectlombok", "lombok")

    testImplementation("org.springframework.boot", "spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
