-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-verbose

-dontoptimize
-dontpreverify

-keepattributes *Annotation*
-keepclassmembers class * {
    native <methods>;
}

-repackageclasses

    -keep class com.crashlytics.** { *; }
-dontwarn com.crashlytics.**

-keeppackagenames org.jsoup.nodes


-keepclassmembers class io.reactivex.** { *; }
-keepclassmembers class rx.** { *; }


# We want to keep methods in Activity that could be used in the XML attribute onClick
-keepclassmembers class * extends android.app.Activity {
   public void *(android.view.View);
}

# For enumeration classes, see http://proguard.sourceforge.net/manual/examples.html#enumerations
-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keepclassmembers class * implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator CREATOR;
}

-keep class com.mukesh.fast.one.pd__Exc.** { *; }
-keep class com.mukesh.fast.one.one_Pojo.** { *; }
-keep class com.mukesh.fast.one.one_fad__Sanata.** { *; }
-keep class com.mukesh.fast.one.one_Mani.** { *; }