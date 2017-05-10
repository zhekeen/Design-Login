### Step 1. Add the JitPack repository to your build file
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

### Step 2. Add the dependency
```
dependencies {
      compile 'com.github.zhekeen:LoadingStyle:1.0.0.0'
      compile 'com.github.zhekeen:View-Effect:1.0.1'
}
