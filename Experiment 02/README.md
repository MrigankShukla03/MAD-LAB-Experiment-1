# Experiment 02: Activity Lifecycle

## Overview
This experiment demonstrates the Android Activity Lifecycle. It tracks and displays state changes when an activity is created, started, resumed, paused, stopped, and destroyed.

## Concept & Technology
- **Activity Lifecycle:** Understanding `onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onRestart`, and `onDestroy`.
- **Intents:** Navigating between Login, Dashboard, and Lifecycle tracking activities.
- **UI Components:** Using `ScrollView` and `TextView` to display dynamic logs.

## Scenario
1. **Authentication:** User enters Name and USN.
2. **Dashboard:** Provides three navigation options (Home, Activity Details, Account).
3. **Lifecycle Tracking:** In the "Activity Details" section, every lifecycle event is logged with a unique descriptive message and student identity.

## Custom Messages
For each method call, the following custom message is displayed:
- **Header:** `Name: Mrigank Shukla | USN: 25MCAR0109`
- **Descriptions:**
    - `onCreate`: "System is creating the Activity."
    - `onResume`: "Activity is now interactive (Foreground)."
    - ... and others.

## Demo Video
The following video shows the full application flow, from authentication to activity lifecycle tracking.

<video src="demo_exp2.mp4" width="320" height="640" controls></video>

*If the video above doesn't load, you can [view it directly here](demo_exp2.mp4).*

## Test Cases & Screenshots

### 1. Authentication Page
The login screen where student details are entered.
![Login Screen](screenshots/login.png)

### 2. Dashboard
Navigation hub after successful authentication.
![Dashboard Screen](screenshots/dashboard.png)

### 3. Activity Lifecycle Tracking
Live logs of lifecycle method calls with custom messages.
![Lifecycle Logs](screenshots/lifecycle_initial.png)

---
**Developer:** Mrigank Shukla  
**USN:** 25MCAR0109
