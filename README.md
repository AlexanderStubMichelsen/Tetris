# Tetris

A Tetris game for Android, written in **Kotlin**, with an online high-score list.

**[⬇ Download the latest APK](https://github.com/AlexanderStubMichelsen/Tetris/releases/latest/download/Tetris.apk)**

## Features

- Classic Tetris: move, rotate and drop pieces, clear lines, rising levels that speed up the game
- Touch controls, with fast drop
- Pause and restart, start and game-over screens
- Sound effects
- **Online high scores** stored in Firebase Realtime Database (players sign in anonymously)

## Install

1. Open the download link above on your Android phone or tablet.
2. Open `Tetris.apk` and allow **"Install unknown apps"** for your browser when Android asks.

The app was previously on Google Play. It's now distributed directly as a signed APK.

## Tech

Kotlin · Android SDK (min 24, target 35) · Jetpack Compose for the screen, custom `View` with Canvas drawing for the game ([GameView.kt](app/src/main/java/online/devdisplay/tetris/ui/GameView.kt)) · Firebase Realtime Database + Firebase Auth

## Build

Open the project in Android Studio, or:

```bash
./gradlew assembleDebug        # app/build/outputs/apk/debug/
```

Firebase uses [app/google-services.json](app/google-services.json).

## Releases

Every push to `main` builds a signed release APK and publishes it as a [GitHub Release](https://github.com/AlexanderStubMichelsen/Tetris/releases) ([release-apk.yml](.github/workflows/release-apk.yml)). Bump `versionCode`/`versionName` in `app/build.gradle.kts` for a new version.
