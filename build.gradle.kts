import org.apache.tools.ant.taskdefs.condition.Os
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

plugins {
    id("org.openjfx.javafxplugin") version "0.0.8"
    id("org.jlleitschuh.gradle.ktlint") version "9.2.1"
    id("com.github.ben-manes.versions") version "0.28.0"
}

buildscript {
    repositories {
        jcenter()
        mavenCentral()
    }

    dependencies {
        classpath(kotlin("gradle-plugin", version = Project.kotlinVersion))
    }
}

allprojects {
    repositories {
        jcenter()
        mavenCentral()
    }

    apply(plugin = "org.jlleitschuh.gradle.ktlint")

    ktlint {
        outputColorName.set("RED")
        ignoreFailures.set(true)
        disabledRules.set(listOf("import-ordering", "no-wildcard-imports"))
        reporters { reporter(ReporterType.CHECKSTYLE) }
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.openjfx.javafxplugin")

    javafx {
        version = JavaVersion.VERSION_14.toString()
        modules = listOf("javafx.controls", "javafx.fxml", "javafx.graphics")
    }

    tasks.withType<KotlinCompile> {
        sourceCompatibility = JavaVersion.VERSION_13.toString()
        targetCompatibility = JavaVersion.VERSION_13.toString()
        kotlinOptions.jvmTarget = JavaVersion.VERSION_13.toString()
    }
}

tasks.register<Zip>("release") {
    dependsOn("app:jpackageImage")

    val releaseName = "${Project.applicationName} v${Project.versionName}"
    val archiveName = when {
        Os.isFamily(Os.FAMILY_WINDOWS) -> "$releaseName windows.zip"
        Os.isFamily(Os.FAMILY_MAC) -> "$releaseName mac.zip"
        Os.isFamily(Os.FAMILY_UNIX) -> "$releaseName linux.zip"
        else -> throw UnsupportedOperationException()
    }

    archiveFileName.set(archiveName)
    into(releaseName) {
        from("README.md")
        from("app/build/jpackage/")
    }
}
