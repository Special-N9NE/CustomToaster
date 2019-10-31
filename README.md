# CustomToaster
simple library to show your custom toasts :smiley:

## ScreenShots

![Screenshot 1](https://cdn1.imggmi.com/uploads/2019/10/31/d5fed8153dd92c828ce4a1e5617d46a8-full.png)
![Screenshot 2](https://cdn1.imggmi.com/uploads/2019/10/31/2e414bf845a4182695446a741fb301ef-full.png)

## Usage 

```java
CustomToaster.makeText(this                           //context
                , "Hi"                                //message
                , CustomToaster.LENGTH_LONG           //duration
                , R.drawable.ic_android               //icon
                , R.drawable.background               //background drawable
                , CustomToaster.BLACK                 //text color 
        ).show();
```
## installation

In your project’s build.gradle add the following line

maven { url 'https://jitpack.io' }

```
allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://jitpack.io' }
    }
}
```
and in your app’s build.gradle add the dependency
```
implementation 'com.github.amirhossein-bigdeli:CustomToaster:0.1'
```
Enjoy :heart:
