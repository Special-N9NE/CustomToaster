# CustomToaster
simple library to show your custom toasts :smiley:

## ScreenShots

![Screenshot 1](https://github.com/amirhossein-bigdeli/CustomToaster/blob/master/Screenshot1.png)
![Screenshot 2](https://github.com/amirhossein-bigdeli/CustomToaster/blob/master/Screenshot2.png)

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
