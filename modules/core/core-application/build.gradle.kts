dependencies {
    implementation(Dependencies.Kotlin.stdlib)
    implementation(Dependencies.Kotlin.Coroutines.core)
    implementation(Dependencies.Kotlin.Coroutines.javaFx)
    implementation(Dependencies.Kotlin.Coroutines.rx2)

    implementation(Dependencies.RxJava2.rxJava)
    implementation(Dependencies.RxJava2.rxJavaFx)
    implementation(Dependencies.RxJava2.rxKotlin)
    implementation(Dependencies.Tornado.tornadoFx)

    testImplementation(Dependencies.junit)
    testImplementation(Dependencies.mockK)
    testImplementation(Dependencies.Kotlin.Coroutines.test)
}
