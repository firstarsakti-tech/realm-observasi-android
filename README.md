# Realm Observasi - Android App

A native Android app built with Jetpack Compose for the Realm Observasi educational platform. This app teaches visual observation and design awareness skills through interactive quests and progress tracking.

## Features

- 🎯 **5 Interactive Skills**: Shape recognition, color theory, lighting, patterns, and visual meaning
- 📊 **Progress Tracking**: EXP system with visual progress bars
- 🏆 **Skill Awareness**: Track your development in noticing, sensitivity, and pattern recognition
- 🎨 **Modern UI**: Built with Jetpack Compose and Material 3
- 🌙 **Dark Theme**: Eye-friendly dark interface with green, yellow, and blue accent colors

## Tech Stack

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose
- **Material Design**: Material 3
- **Target API**: 34 (Android 14)
- **Min API**: 24 (Android 7.0)

## Project Structure

```
RealmObservasi/
├── app/
│   ├── build.gradle.kts          # App-level dependencies and build config
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/realmobservasi/app/
│   │   │   │   ├── MainActivity.kt          # Main UI and Composables
│   │   │   │   └── ui/theme/
│   │   │   │       ├── Theme.kt              # Color scheme
│   │   │   │       └── Type.kt               # Typography
│   │   │   └── res/
│   │   │       ├── values/
│   │   │       │   ├── strings.xml           # String resources
│   │   │       │   ├── colors.xml            # Color definitions
│   │   │       │   └── themes.xml            # Theme resources
│   │   │       └── AndroidManifest.xml       # App manifest
│   └── proguard-rules.pro
├── settings.gradle.kts            # Project configuration
└── README.md
```

## Getting Started

### Prerequisites

- Android Studio Flamingo or later
- JDK 11 or higher
- Android SDK with API 34

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/firstarsakti-tech/realm-observasi-android.git
   cd realm-observasi-android
   ```

2. **Open in Android Studio**
   - File → Open → Select the project directory

3. **Sync Gradle**
   - Wait for Gradle to sync automatically
   - If needed: File → Sync Now

4. **Run on emulator or device**
   - Connect device or start emulator
   - Click "Run" (Shift + F10) or use Run menu

## Features Breakdown

### Realm Observasi App Features

- **Header Card**: Displays app title, level, and EXP progress bar
- **Realm Objective Card**: Explains the purpose of the learning realm
- **Mentor Tips Card**: Provides design wisdom and guidance
- **Skill Cards**: 5 interactive skill cards with:
  - Skill name and description
  - Progress indicator
  - Quest description
  - "Mulai Quest" (Start Quest) button
- **Skill Awareness Card**: Tracks development in:
  - Noticing (10%)
  - Sensitivity (5%)
  - Pattern Recognition (2%)

## Color Scheme

- **Primary Green**: `#22c55e` - Main accent and buttons
- **Light Green**: `#86efac` - Secondary text and highlights
- **Dark Background**: `#07111F` - Main background
- **Secondary Green**: `#182f22` - Card backgrounds
- **Yellow**: `#facc15` - Alternative accent
- **Blue**: `#60a5fa` - Tertiary accent

## Composable Components

### Main Composables

- `RealmObservasiApp()` - Root composable with layout and state
- `HeaderCard()` - Profile and EXP display
- `RealmObjectiveCard()` - Learning objective
- `MentorTipsCard()` - Mentor guidance
- `SkillCard()` - Individual skill with quest
- `SkillAwarenessCard()` - Skill progress tracking
- `ProgressItem()` - Reusable progress bar component

## Data Models

```kotlin
data class Skill(
    val title: String,        // Skill name (e.g., "Melihat Bentuk")
    val desc: String,         // Short description
    val progress: String,     // Progress format "X/Y"
    val task: String          // Quest description
)
```

## Responsive Design

The app is optimized for:
- **Phone screens** (4.5" - 6.7")
- **Tablets** (7" and above with responsive padding)
- **Portrait orientation** (primary)
- **Landscape orientation** (supported)

## Building and Distribution

### Build Debug APK
```bash
./gradlew assembleDebug
```

### Build Release APK
```bash
./gradlew assembleRelease
```

### Generate App Bundle (for Play Store)
```bash
./gradlew bundleRelease
```

## Customization Guide

### Changing Colors

Edit `src/main/res/values/colors.xml`:
```xml
<color name="green_primary">#22c55e</color>
```

### Adding New Skills

Modify the `skills` list in `MainActivity.kt`:
```kotlin
val skills = listOf(
    Skill(
        title = "New Skill",
        desc = "Description here",
        progress = "0/3",
        task = "Quest task description"
    ),
    // ... more skills
)
```

### Changing Theme

Edit `src/main/java/com/realmobservasi/app/ui/theme/Theme.kt` to modify colors and typography.

## Performance Optimization

- Efficient recomposition using Compose's smart diff algorithm
- LazyColumn or LazyRow can be used for larger skill lists
- Minimal state management to reduce recompositions

## Future Enhancements

- [ ] Quest detail screens with image capture functionality
- [ ] Backend integration for progress persistence
- [ ] Notifications and reminders
- [ ] Leaderboards and community features
- [ ] Achievements and badges system
- [ ] Animation and micro-interactions
- [ ] Offline support with local caching

## License

This project is proprietary software. All rights reserved.

## Support

For issues, questions, or suggestions, please open an issue in the repository.

---

**Made with ❤️ for visual awareness and design education**