# SimpleTransactionApp

Shows an example of starting a new activity from a context.

## Steps to reproduce this example : 
1) Define an android activity intent with a `Context` and a `Class<Activity>` :
```kt
val intent = Intent(this, SecondActivity::class.java)
```

2) Start the intent using `startActivity(intent: Intent)` : 
```kt
startActivity(intent)
```

The 2 activities should be defined in the `AndroidManifest.xml`, with one of them marked as launcher activity, as follows : 
```xml
<activity
    android:name=".SecondActivity"
    android:exported="false" />
<activity
    android:name=".MainActivity"
    android:exported="true">
    <intent-filter>
        <action android:name="android.intent.action.MAIN" />

        <category android:name="android.intent.category.LAUNCHER" />
    </intent-filter>
</activity>
```

`Activity` : The basic entry point for android applications context, almost all activities interact with the user, 
so the Activity class takes care of creating a window for you in which you can place your UI with `setContentView(View)`.

`Intent` : A passive data structure holding an abstract description of an action to be performed.
