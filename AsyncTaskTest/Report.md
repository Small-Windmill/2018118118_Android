## 实验要求

异步任务的隐含子线程程序框架

------

## 实验内容

1.在布局文件中定义三个控件：Download按钮，一个文本框和一个显示下载进度的进度条

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AsyncTaskTest/Image/1.png)

2.实例化控件并注册Download按钮的监听器

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AsyncTaskTest/Image/2.png)

3.创建类DownloadTask继承AsyncTask，实现异步消息处理

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AsyncTaskTest/Image/3.png)

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AsyncTaskTest/Image/4.png)

4.运行程序，点击Download按钮后，进度条会根据设置好的移动速度（设置的线程休息时间）不断更新自己的进度信息:

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AsyncTaskTest/Image/5.png)

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AsyncTaskTest/Image/6.png)

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/AsyncTaskTest/Image/7.png)

## 实验总结

通过本次实验，我学会了使用AsyncTask。AsyncTask是一个线程框架，借助AsyncTask可以十分简单地从子线程切换到主线程，实现异步消息处理。