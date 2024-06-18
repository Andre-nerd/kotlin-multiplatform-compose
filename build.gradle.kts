plugins {
    alias(libs.plugins.jb.multuplatform) apply  false
    alias(libs.plugins.jb.compose) apply  false

    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.jb.android.kotlin) apply false
}
