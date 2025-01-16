
# Supalink Android SDK

The **Supalink Android SDK** is designed to help developers integrate Supalink functionality into their Android applications. This SDK facilitates **deferred deep linking**, **user session management**, and **URL handling** for sharing and redirection purposes.

For more details about Supalink and its features, visit [Supalink](https://supalink.cc).

## Features

- **Deferred Deep Linking**: Handle deep links even if the app is not installed at the time of the link click.
- **Universal Link Handling**: Handle Universal Links to enable deep linking functionality across Android.

## Installation

### JitPack Installation

To add Supalink Android SDK to your project using **JitPack**, follow these steps:

1. **Add JitPack repository**:
   In your `settings.gradle` or `build.gradle` file, add the following repository:

   ```gradle
   repositories {
       maven { url 'https://jitpack.io' }
   }
   ```

2. **Add Supalink SDK as a dependency**:

   In your `build.gradle` file, add the following dependency:

   ```gradle
   dependencies {
       implementation 'com.github.monibu1548:supalink-android-sdk:1.0.0'
   }
   ```

---

## Usage

### Manifest Configuration

To enable your app to handle Universal Links, add the following `<intent-filter>` in your `AndroidManifest.xml`:

```xml
<activity android:name=".MainActivity">
    <intent-filter android:autoVerify="true">
        <action android:name="android.intent.action.VIEW" />
        <category android:name="android.intent.category.DEFAULT" />
        <category android:name="android.intent.category.BROWSABLE" />
        <data android:host="example.supalink.cc" android:scheme="https" />
    </intent-filter>
</activity>
```

Make sure to replace `example.supalink.cc` with your actual subdomain.

### MainActivity Configuration

In your `MainActivity`, handle the incoming deep link using `SupalinkSDK.handleAsestLinks`:

```kotlin
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SupalinkSDK.handleAsestLinks(this, intent) { supalink ->
            supalink?.let {
                // Handle the Supalink data
                println("Received Supalink: $it")
            } ?: run {
                println("No Supalink received.")
            }
        }
    }
}
```

The `handleAsestLinks` method processes the incoming `Intent` and extracts the **Supalink** data. This data can be used to perform the necessary actions in your app, such as opening URLs or processing specific parameters.

---

## Contributing

We welcome contributions to the Supalink Android SDK! To contribute:

1. Fork the repository.
2. Create a new branch for your feature (`git checkout -b feature/YourFeature`).
3. Commit your changes (`git commit -m 'Add new feature'`).
4. Push to your branch (`git push origin feature/YourFeature`).
5. Open a pull request.

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

