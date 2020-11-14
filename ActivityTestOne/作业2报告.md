## 实验要求

以按钮为例，体验活动的生命周期，观察每个Activity在其生命周期中的状态及几个回调函数的使用

------

## 实验目的

掌握活动的生命周期；每种生命周期中包含的不同的事件回调函数，以及它们的作用和调用顺序，深入理解活动的生命周期过程

------

## 实验内容

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/1.png)

由AndroidMainfest.xml可知，Hello1按钮所处界面是主界面

运行程序后，Hello1的生存期如下：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/2.png)

Hello1的运行界面结果：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/3.png)

点击Hello2，Hello1和Hello2的生存期如下：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/4.png)

可以看到，Hello1的onPause()方法得到了执行，之后 Hello2活动运行完全遮挡住Hello1活动，此时Hello1进入了停止状态。

Hello2的运行界面结果：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/5.png)

点击Hello3，Hello2和Hello3的生存期如下：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/6.png)

可以看到，Hello2的onPause()方法得到了执行，之后 Hello3活动运行完全遮挡住Hello2活动，此时Hello2进入了停止状态。

Hello3的运行界面结果：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/7.png)

此时若是按Home键，日志结果如下：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/8.png)

再次进入应用后，日志结果如下：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/9.png)

此时，可以看到，Hello3活动并未调用onCreate函数，即还是原来的实例.

再次点击Hello1按钮,Hello1、Hello2和Hello3的生存期如下：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/10.png)

可以看到Hello2和Hello3依次执行onDestroy()方法，最终被销毁。Hello1活动并未调用onCreate()，即还是原来的实例,Hello1使用onStart()由不可见变为可见的状态。

 

最后在Hello1界面按下Back键退出程序，Hello1的生存期如下：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ActivityTestOne/%E4%BD%9C%E4%B8%9A2%E6%88%AA%E5%9B%BE/11.png)

------

## 实验总结

通过这次实验，初步掌握了活动的生命周期及几个回调函数的使用。

每一个活动最多会有下面四种状态：

   一：运行状态  当一个活动处于返回栈的最顶端的时候，就处于运行状态。

   二：暂停状态  当一个活动不处于返回栈的最顶端，但又是可见的时候，就处于暂停状态。

   三：停止状态  当一个活动不处于返回栈的最顶端同时又是不可见的视乎，就处于停止状态。

   四：销毁状态  但一个活动从返回栈移除之后就处于销毁状态。

在Activity类中定义了七个方法包含了这一个活动的生命周期:

   一：onCreate() 这个方法会在活动第一次被创建的时候调用。

   二：onStart()  这个方法在活动即将要出现的时候调用。

   三：onResume() 这个方法在活动准备好和用户交互的时候调用。

   四：onPause()  这个方法在系统准备去启动或者回复另一个活动的时候调用。

   五：onStop()  这个方法在活动完全不可见的时候调用。

   六：onDestroy()这个方法在活动被销毁的时候调用。

   七：onRestart()这个方法在活动由停止状态变为运行状态之前调用，也就是活动被重新启动了。



