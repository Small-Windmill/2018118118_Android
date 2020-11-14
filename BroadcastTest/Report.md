## 实验要求

自定义广播的使用

------

## 实验目的

了解广播，学会自定义广播的使用

------

## 实验内容

广播主要分为两种类型：标准广播和有序广播

运行MyBroadcastTest项目，点击“Send Broadcast”按钮，可以接收到一条消息。

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/BroadcastTest/Image/1.png)

此时发出去的广播就是一条标准广播。

在模拟器上同时运行MyBroadcastTest和MyBroadcastTest2这两个项目程序，然后在BroadcastTest项目的主界面上，点击一下“Send Broadcast”按钮，就会分别弹出两次提示消息

<img src="https://github.com/Small-Windmill/2018118118_Android/raw/master/BroadcastTest/Image/1.png" alt="Image" style="zoom:50%;" /><img src="https://github.com/Small-Windmill/2018118118_Android/raw/master/BroadcastTest/Image/2.png" alt="Image" style="zoom: 50%;" />

此时程序里发出的都还是标准广播，接下来尝试发送有序广播。重新回到MyBroadcastTest项目，并依次修改MainActivity、AndroidManifest.xml和MyBroadcastReceiver中的代码

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/BroadcastTest/Image/3.png)

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/BroadcastTest/Image/4.png)

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/BroadcastTest/Image/5.png)

通过"android:priority"属性给广播接收器设置了优先级，优先级比较高的广播接收器就可以先收到广播。这里将MyBroadcastReceiver的优先级设成了100，以保证它一定会在AnotherBroadcastReceiver之前收到广播。

在onReceive()方法中调用了abortBroadcast()方法，就表示将这条广播截断，后面的广播接收器将无法接收到这条广播。现在重新运行程序，并点击一下“Send Broadcast”按钮，运行结果如下：

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/BroadcastTest/Image/1.png)

只有MyBroadcastReceiver中的Toast信息能够弹出，说明这条广播经过MyBroadcastReceiver之后确实是终止传递了。

通过这次实验，我了解了广播，学会了发送自定义广播。广播主要分为两种类型：标准广播和有序广播。广播是一种可以跨进程的通信方式，实验通过运行两个项目程序可以验证这一点：在应用程序内发出的广播，其他的应用程序也是可以收到的。

