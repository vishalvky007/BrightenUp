plugins {
    id("com.android.library")
}

android {
    namespace = "com.example.facerecognition"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

//    implementation("androidx.appcompat:appcompat:1.7.0")
//    implementation("com.google.android.material:material:1.12.0")
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.2.1")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")
    // Android Libraries

    implementation("androidx.appcompat:appcompat:1.4.2")
    implementation("com.google.android.material:material:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.navigation:navigation-fragment:2.5.1")
    implementation("androidx.navigation:navigation-ui:2.5.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

    // ML Kit (To detect faces)
    implementation("com.google.mlkit:face-detection:16.1.5")
    implementation("com.google.android.gms:play-services-mlkit-face-detection:17.0.1")

    // GSON (Conversion of String to Map & Vice-Versa)
    implementation("com.google.code.gson:gson:2.8.9")

    // Lottie-files (Splash-screen Animation)
    implementation("com.airbnb.android:lottie:4.2.2")

    // CameraX View class (For camera preview)
    implementation("androidx.camera:camera-core:1.2.0-alpha04")
    implementation("androidx.camera:camera-camera2:1.2.0-alpha04")
    implementation("androidx.camera:camera-lifecycle:1.2.0-alpha04")
    implementation("androidx.camera:camera-view:1.2.0-alpha04")

    // TensorFlow Lite libraries (To recognize faces)
//    implementation("org.tensorflow:tensorflow-lite-task-vision:0.3.0")
//    implementation("org.tensorflow:tensorflow-lite-support:0.3.0")
//    implementation("org.tensorflow:tensorflow-lite:0.0.0-nightly-SNAPSHOT")
    implementation("org.tensorflow:tensorflow-lite:2.3.0")
}