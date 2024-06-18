plugins {
    alias(libs.plugins.jb.multuplatform)
    alias(libs.plugins.jb.compose)
}
task("testClasses").doLast {
    println("This is a dummy testClasses task")
}
kotlin{
    jvm("desktop")

    sourceSets{
        val jvmMain = getByName("desktopMain"){
            dependencies {
                implementation(project(":shared"))
            }
        }
    }
}
compose.desktop{
    application{
        mainClass = "MainKt"
    }
}