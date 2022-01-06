<pre>
<img src="https://github.com/gzeinnumer/NumberForm/blob/master/preview/example3.gif" width="200">
</pre>

<h1 align="center">
    NumberForm
</h1>

<p align="center">
    <a><img src="https://img.shields.io/badge/Version-1.0.0-brightgreen.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/ID-gzeinnumer-blue.svg?style=flat"></a>
    <a><img src="https://img.shields.io/badge/Java-Suport-green?logo=java&style=flat"></a>
    <a><img src="https://img.shields.io/badge/kotlin-Suport-green?logo=kotlin&style=flat"></a>
    <a href="https://github.com/gzeinnumer"><img src="https://img.shields.io/github/followers/gzeinnumer?label=follow&style=social"></a>
    <br>
    <p>Easy NumberFrom , never let it empty.</p>
</p>

---
# Content List
* [Download](#download)
* [Feature List](#feature-list)
* [Tech stack and 3rd library](#tech-stack-and-3rd-library)
* [Usage](#usage)
* [Example Code/App](#example-codeapp)
* [Version](#version)
* [Contribution](#contribution)

---
# Download
Add maven `jitpack.io` and `dependencies` in `build.gradle (Project)` :
```gradle
// build.gradle project
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}

// build.gradle app/module
dependencies {
  ...
  implementation 'com.github.gzeinnumer:NumberForm:version'
}
```

---
# Feature List

- [x] [NumberForm](#NumberForm)

#
#### NumberForm

- EditText Example

```xml
<com.gzeinnumer.nf.NumberForm
    android:id="@+id/ed_data"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:hint="put number" />
```
<pre>
<img src="https://github.com/gzeinnumer/NumberForm/blob/master/preview/example1.jpg">
</pre>

- TextInputLayout and TextInputEditText Example

```xml
<com.google.android.material.textfield.TextInputLayout
    android:layout_width="match_parent"
    android:layout_marginTop="16dp"
    android:layout_height="wrap_content">

    <com.gzeinnumer.nf.NumberForm
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>
</com.google.android.material.textfield.TextInputLayout>
```
<pre>
<img src="https://github.com/gzeinnumer/NumberForm/blob/master/preview/example2.jpg">
</pre>

---
# Example Code/App

- Nested
[NestedActivity.java](https://github.com/gzeinnumer/NumberForm/blob/master/app/src/main/java/com/gzeinnumer/numberform/MainActivity.java)
[activity_nested.xml](https://github.com/gzeinnumer/NumberForm/blob/master/app/src/main/res/layout/activity_main.xml)

---
# Version
- **1.0.0**
  - First Release

---
# Contribution
You can sent your constribution to `branch` `open-pull`.

### Fore More [All My Library](https://github.com/gzeinnumer#my-library-list)

---

```
Copyright 2022 M. Fadli Zein
```