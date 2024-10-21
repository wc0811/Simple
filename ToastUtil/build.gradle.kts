plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
//    id("maven-publish")
}
//afterEvaluate {
//    publishing {
//        publications {
//            create<MavenPublication>("release") {
//                from(components["release"])
//                groupId = "https://github.com/wc0811/Simple"
//                artifactId = "ToastUtil"
//                version = "1.0.0"
//            }
//        }
//    }
//}

android {
    namespace = "com.yp.toastutil"
    compileSdk = 34

    defaultConfig {
        minSdk = 26

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}