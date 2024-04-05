plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("kotlin-android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.pritikjain.androidprojecttestingbasics"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.pritikjain.androidprojecttestingbasics"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        buildConfigField ("String","API_KEY", "\"${properties["API_KEY"]}\"")

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        buildConfig = true
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

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")


    // Adding Test dependencies 
    testImplementation ("com.google.truth:truth:1.0.1")
    androidTestImplementation ("com.google.truth:truth:1.0.1")

    // Material Design
    implementation ("com.google.android.material:material:1.11.0")

    // Architectural Components
    val lifecycleVersion = "2.7.0"
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion")

    // Lifecycle
    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.2.0")

    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation ("androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion")

    // Room Library for local Database
    val roomVersion = "2.6.1"
    implementation ("androidx.room:room-runtime:$roomVersion")
    annotationProcessor ("androidx.room:room-compiler:$roomVersion")
    //To use Kotlin annotation processing tool (KSP)
    ksp("androidx.room:room-compiler:$roomVersion")

    // Kotlin Extensions and Coroutines support for Room
    implementation ("androidx.room:room-ktx:$roomVersion")

    // Retorfit for Network calls
    val retrofitVersion = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    // Gson converter for Retrofit
    implementation ("com.squareup.retrofit2:converter-gson:$retrofitVersion")

    //Kotlin Coroutines
    val coroutineVersion="1.8.0"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutineVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutineVersion")


    // Navigation Components
    val navVersion="2.7.7"
    implementation("androidx.navigation:navigation-fragment-ktx:$navVersion")
    implementation("androidx.navigation:navigation-ui-ktx:$navVersion")

    // Glide
    val glideVersion="4.13.2"
    implementation ("com.github.bumptech.glide:glide:$glideVersion")
    annotationProcessor ("com.github.bumptech.glide:compiler:$glideVersion")

    // Activity KTX for viewModels()
    implementation ("androidx.activity:activity-ktx:1.8.2")

    val hiltVersion="2.50"
    //Hilt:Dependency Injection
    implementation("com.google.dagger:hilt-android:$hiltVersion")
    ksp("com.google.dagger:hilt-android-compiler:$hiltVersion")


    // Timber
    implementation ("com.jakewharton.timber:timber:5.0.1")

    // Local Unit Tests
    implementation ("androidx.test:core:1.5.0")
    testImplementation ("junit:junit:4.13.2")
    testImplementation ("org.hamcrest:hamcrest-all:1.3")
    testImplementation ("androidx.arch.core:core-testing:2.2.0")
    testImplementation ("org.robolectric:robolectric:4.3.1")
    testImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.0")
    testImplementation ("com.google.truth:truth:1.0.1")
    androidTestImplementation ("org.mockito:mockito-core:3.3.3")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Instrumented Unit Tests
    androidTestImplementation ("com.linkedin.dexmaker:dexmaker-mockito-inline:2.28.3")
    androidTestImplementation ("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.8.0")
    androidTestImplementation ("androidx.arch.core:core-testing:2.2.0")
    androidTestImplementation ("com.google.truth:truth:1.0.1")
    androidTestImplementation ("androidx.test.ext:junit:1.1.5")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation ("org.mockito:mockito-core:3.3.3")

}