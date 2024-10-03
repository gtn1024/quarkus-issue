plugins {
    java
}

allprojects {
    apply { plugin("java") }

    repositories {
        mavenCentral()
        mavenLocal()
    }

    group = "io.github.gtn1024"
    version = "1.0-SNAPSHOT"

    java {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}


