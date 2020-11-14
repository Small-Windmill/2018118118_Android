## 实验要求

Intent应用，特别是系统内置隐含Intent和自定义的Intent的使用

------

## 实验目的

学会使用Intent在活动之间穿梭，掌握系统内置隐含Intent和自定义的Intent的使用

------

## 实验内容

运行程序，在FirstActivity的界面点击一下按钮

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/IntentTest/Image/1.png)

此时程序使用了隐式Intent的方式成功启动SecondActivity,结果如图所示

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/IntentTest/Image/2.png)

在SecondActivity的界面点击“Button 2”按钮就可以看到打开了系统浏览器

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/IntentTest/Image/3.png)

在SecondActivity的界面点击"拨打电话"按钮就可以看到一个系统拨号界面(默认号码设置为10086)

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/IntentTest/Image/4.png)

------

## 实验总结

通过这次实验，我学会了使用Intent来启动一个活动。使用隐式Intent，不仅可以启动自己程序内的活动，还可以启动其他程序的活动，这使得Android多个应用程序之间的功能共享称为了可能。