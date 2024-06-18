plugins{
    alias(libs.plugins.jb.multuplatform)
    alias(libs.plugins.jb.compose)
    alias(libs.plugins.android.library)
}
task("testClasses").doLast {
    println("This is a dummy testClasses task")
}

kotlin{
    jvm()
    androidTarget()

    val appNameId = findProperty("application.id").toString()

    listOf(
        iosX64(),
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget->
        iosTarget.binaries.framework {
            baseName ="shared"
            binaryOption("bundleId", appNameId)
        }
    }

    sourceSets{
        commonMain{
            dependencies {
                implementation(compose.foundation)
                implementation(compose.runtime)
                implementation(compose.ui)
                implementation(compose.material)
            }
        }

        jvmMain{
            dependencies {
                api(compose.desktop.currentOs)// compose check Windows or Linux
            }
        }
    }
}

android{
    namespace = findProperty("app.namespace").toString()
    compileSdk = findProperty("android.compileSdk").toString().toInt()

    compileOptions{
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility =JavaVersion.VERSION_17
    }
    defaultConfig{
        minSdk = findProperty("android.minSdk").toString().toInt()
    }

}