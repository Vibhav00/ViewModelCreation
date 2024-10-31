# 📱 ViewModel Experimentation in Android

This project explores different ways to create and access ViewModels in Android. It includes examples with and without parameters and covers various scenarios, such as creating instances within activities and fragments. These  snippets and explanations of the different approaches to managing ViewModels in an Android project.

---

## 📝 Overview

In this experiment, the following scenarios were covered:

1. **ViewModel without parameters**
2. **ViewModel with parameters using `ViewModelProviderFactory`**
3. **Accessing ViewModels with `by viewModels` and `by activityViewModels`**

---

## 🛠️ ViewModel without Parameters

### 📂 Activity Example

To create a `ViewModel` without parameters in an activity:

```kotlin
private lateinit var noParamViewModel: NoParamViewModel // ViewModel without parameter

// Initializing using the `by viewModels` delegate
private val noParamViewModel: NoParamViewModel by viewModels()
```

## Logcat 😼🐈‍⬛
```text
(NoParamViewModel) creation time = 31st Oct 2024 at 11:28:50 PM  (664)
(ParamViewModel) creation time = 31st Oct 2024 at 11:28:50 PM  (672) and value is = Data from Ac 1
(NoParamViewModel) creation time = 31st Oct 2024 at 11:28:50 PM  (701)
(ParamViewModel) creation time = 31st Oct 2024 at 11:28:50 PM  (704) and value is = Data from frag 1
(ParamViewModel) creation time = 31st Oct 2024 at 11:28:56 PM  (694) and value is = Data from Ac 2 
(NoParamViewModel) creation time = 31st Oct 2024 at 11:28:56 PM  (696)
```
