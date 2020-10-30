import org.apache.tools.ant.taskdefs.condition.Os

plugins {
    id("application")
    id("org.beryx.runtime") version "1.11.4"
}

application {
    mainClassName = "${Project.applicationId}.MainKt"
    applicationName = Project.applicationName
}

runtime {
    options.set(listOf("--strip-debug", "--compress", "2", "--no-header-files", "--no-man-pages"))
    modules.set(
        listOf(
            "java.desktop",
            "java.xml",
            "jdk.unsupported",
            "java.scripting",
            "jdk.jfr",
            "java.logging",
            "java.prefs"
        )
    )

    jpackage {
        when {
            Os.isFamily(Os.FAMILY_WINDOWS) -> imageOptions = listOf("--icon", "src/main/resources/icon.ico")
            Os.isFamily(Os.FAMILY_MAC) -> imageOptions = listOf("--icon", "src/main/resources/icon.icns")
        }
        imageName = Project.applicationName
    }
}

dependencies {
    implementation(project(":core-ui"))

    implementation(Dependencies.Kotlin.stdlib)
    implementation(Dependencies.Tornado.tornadoFx)
}
