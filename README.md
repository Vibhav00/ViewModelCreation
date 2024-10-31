# 📱 ViewModel Experimentation in Android

This project explores different ways to create and access ViewModels in Android. It includes examples with and without parameters and covers various scenarios, such as creating instances within activities and fragments. This README provides code snippets and explanations of the different approaches to managing ViewModels in an Android project.

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
