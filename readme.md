# Music Stream App

Users can create personal accounts by signing up for the application. The application offers a wide range of categories. Users can explore rap music, popular podcasts, trends and more. Users can view the most popular songs and podcasts within the application. This feature enables users to quickly access trending content.

## Technologies Used

<b>Kotlin</b>: Kotlin is the primary programming language used for developing the application.

<b>Firebase</b>: Firebase is used for user authentication and real-time database management.

<b>Firestore</b>: Firestore is utilized for storing and managing user data, including user preferences, playlists, and listening history.

<b>Cloud Storage</b>: Cloud Storage is employed for storing and retrieving music files securely.

<b>Authentication</b>: Firebase Authentication handles user authentication, ensuring secure login/signup processes.

<b>MediaPlayer3</b>: Android's MediaPlayer3 library is used for basic music playback functionalities.

<b>ExoPlayer</b>: ExoPlayer is integrated for advanced music streaming features, including adaptive streaming and media caching.

<b>Glide</b>: Glide library is used for efficient image loading and caching, enhancing the app's UI.

## Dependencies and Configurations

```kotlin
dependencies {
    implementation("com.google.firebase:firebase-firestore:24.10.0")
    implementation ("com.google.firebase:firebase-auth-ktx:22.3.1")
    implementation ("androidx.media3:media3-exoplayer:1.2.0")
    implementation ("androidx.media3:media3-exoplayer-dash:1.2.0")
    implementation ("androidx.media3:media3-ui:1.2.0")
}
```

```kotlin
android {
    compileSdkVersion 34
    defaultConfig {
        minSdkVersion 26
        targetSdkVersion 34
    }
```

## Images of the Application

<table style="border-collapse: collapse; width: 100%;">
  <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/login_signup.jpg" alt="login signup page"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/password_control.jpg" alt="login signup page"></td>
  </tr>
    <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/confirm_password_control.jpg" alt="login signup page"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/playing_music_and_email_check.jpg" alt="login signup page"></td>
  </tr>
    <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/categories.jpg" alt="category page"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/category_detail.jpg" alt="category page"></td>
  </tr>
    <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/playing_music_end_of_the_page.jpg" alt="music playing"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/logout_right_top.jpg" alt="logout"></td>
  </tr>

</table>
<br>

## Firebase Images

<table style="border-collapse: collapse; width: 100%;">
  <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/categories.png" alt="login signup page"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/sections.png" alt="login signup page"></td>
  </tr>
    <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/songs.png" alt="login signup page"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/storage.png" alt="login signup page"></td>
  </tr>
    <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/category_images.png" alt="category page"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/song_images.png" alt="category page"></td>
  </tr>
    <tr>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/songs_mp4.png" alt="music playing"></td>
    <td align="center" style="padding: 8px; border: none;"><img src="https://github.com/reyhanturkkal/Music-Stream-App/blob/master/assets/user_authentication.png" alt="logout"></td>
  </tr>

</table>

