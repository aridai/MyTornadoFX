object Dependencies {

    object Kotlin {
        //  https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-stdlib-jdk8
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Project.kotlinVersion}"

        //  https://mvnrepository.com/artifact/org.jetbrains.kotlinx
        object Coroutines {
            private const val version = "1.4.0"

            //  https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-core
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"

            //  https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-javafx
            const val javaFx = "org.jetbrains.kotlinx:kotlinx-coroutines-javafx:$version"

            //  https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-rx2
            const val rx2 = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:$version"

            // https://mvnrepository.com/artifact/org.jetbrains.kotlinx/kotlinx-coroutines-test
            const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
        }
    }

    //  https://mvnrepository.com/artifact/io.reactivex.rxjava2
    object RxJava2 {

        // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxjava
        const val rxJava = "io.reactivex.rxjava2:rxjava:2.2.19"

        // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxjavafx
        const val rxJavaFx = "io.reactivex.rxjava2:rxjavafx:2.2.2"

        // https://mvnrepository.com/artifact/io.reactivex.rxjava2/rxkotlin
        const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:2.4.0"
    }

    //  https://mvnrepository.com/artifact/no.tornado
    object Tornado {

        // https://mvnrepository.com/artifact/no.tornado/tornadofx
        const val tornadoFx = "no.tornado:tornadofx:1.7.20"
    }

    // https://mvnrepository.com/artifact/org.controlsfx/controlsfx
    const val controlsFx = "org.controlsfx:controlsfx:11.0.2"

    //  https://mvnrepository.com/artifact/junit/junit
    const val junit = "junit:junit:4.13"

    // https://mvnrepository.com/artifact/io.mockk/mockk
    const val mockK = "io.mockk:mockk:1.10.2"
}
