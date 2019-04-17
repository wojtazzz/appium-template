## Development

Install appium with all required prerequisites 

https://medium.com/testcult/configuring-appium-in-ubuntu-from-scratch-a9f8edc02d13

Install appium-desktop

https://github.com/appium/appium-desktop/releases/

For testing with emulators install Android Studio 

https://developer.android.com/studio/install


appium-doctor should return no errors/warnings

`appium-doctor`

Run appiun server and make sure it's runnning on http://localhost:4723

`appium`

`netstat -naplt | grep appium`




## Android real device tests

On your phone enable developer options

On your phone allow USB debugging

Get .apk file.  If you have app installed from PlayStore and no access to .apk you can get .apk directly from device

`adb shell pm list packages -f | grep your-app-name`

`adb pull /package_path/package name`

Fill in device capabilities

`src/test/resources/appium-config.properties`


Platform

`capa.platformName=Android`

Android version

`capa.platformVersion=9`

device name - check with `adb devices` while device is connected with USB

`capa.deviceName=FA79L1A08247`

path to .apk file relative to project root

`capa.app=src/test/resources/myapp.apk`

Not required but recommended: package and activity (you can get those values with Android Studio->Build->Analyse APK-> open AndoirdManifest.xml)
 
`capa.appPackage=eu.testarmy.myapp`
`capa.appActivity=eu.testarmy.myapp.SplashActivity_`


Running all tests

`mvn clean test`

Running scenarios by tags

`mvn clean test Dcucumber.options="--tags @debug1 --tags @debug2"`