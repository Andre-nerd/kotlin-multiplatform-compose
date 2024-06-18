plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jb.android.kotlin)
}
task("testClasses").doLast {
    println("This is a dummy testClasses task")
}
android{
    namespace = findProperty("app.android.namespace").toString()
    compileSdk = findProperty("android.compileSdk").toString().toInt()
    kotlinOptions {
        jvmTarget = "17"

    }

    defaultConfig{
        minSdk = findProperty("android.minSdk").toString().toInt()
        targetSdk = findProperty("android.targetSdk").toString().toInt()
        applicationId = findProperty("application.id").toString()
        versionCode = 1
        versionName ="0.1"
    }
    compileOptions{
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility =JavaVersion.VERSION_17
    }
    buildFeatures{
        compose = true
    }
    composeOptions{
        kotlinCompilerExtensionVersion = "1.5.13"
    }
    dependencies{
        implementation(libs.androidx.core.ktx)
        implementation(libs.androidx.activity.compose)
        implementation(project(":shared"))
    }

}
