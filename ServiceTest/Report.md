## 实验要求

 服务：启动和停止服务，服务代码运行在显示子线程。

------

## 实验内容

1.运行程序，界面有三个按钮：START SERVICE按钮、STOP SERVICE按钮和START IntentService按钮

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ServiceTest/Image/1.png)

2.点击START SERVICE按钮，观察logcat中的打印日志，如图所示

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ServiceTest/Image/2.png)

3.点击STOP SERVICE按钮，观察logcat中的打印日志，如图所示

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ServiceTest/Image/3.png)

4.点击START IntentService,观察logcat中的打印日志，如图所示

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ServiceTest/Image/4.png)

## 实验总结

通过本次实验，我学会了启动服务以及停止服务的方法。其中onCreate()方法是在服务第一次创建的时候调用的，而onStartCommand()方法则在每次启动服务的时候都会调用。如果再连续多点击几次Start Service按钮，只有onStartCommand()方法被执行。

此外，我还知道服务中代码都是默认运行在主线程当中的，要使服务代码运行在显示子线程，就需要用到Android多线程编程的技术了。