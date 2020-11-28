## 实验要求

创建子线程的程序框架，消息处理机制和多线程之间的数据交换

------

## 实验内容

**1.**在布局文件中定义两个控件：TextView用于在屏幕的正中央显示一个Hello World字符串，Button用于改变TextView中显示的内容。

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AndroidThreadTest/Image/1.png)

**2.**注册Change Text按钮的监听器

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AndroidThreadTest/Image/2.png)

**3.**由于Android不允许在子线程中进行UI操作，需要使用异步消息处理的使用方法。

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AndroidThreadTest/Image/3.png)

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AndroidThreadTest/Image/4.png)

可以看到，程序没有在子线程里直接进行UI操作，而是创建了Message对象，并将它的what字段的值指定为UPDATE_TEXT，然后调用Handler的sendMessage()方法将这条Message发送出去。Handler就会收到这条Message，并在handleMessage()方法中对它进行处理。接下来对Message携带的what字段的值进行判断，如果等于UPDATE_TEXT，就将TextView显示的内容改成Nice to meet you.

**4.**运行程序，可以看到屏幕的正中央显示着Hello world:

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AndroidThreadTest/Image/5.png)

然后点击一下Change Text按钮，显示的内容就被替换成Nice to meet you:

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AndroidThreadTest/Image/6.png)

## 实验总结

通过这个实验掌握了线程的基本用法，了解了Android多线程编程。学会使用Android异步消息处理的基本用法，使用这种机制就可以解决掉在子线程中更新UI的问题。