## 实验要求

子服务的绑定，子服务代码运行在异步任务

------

## 实验内容

1.运行程序，程序一启动立刻就会申请访问SD卡的权限，点击ALLOW

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ServiceBestPractice/Image/1.png)

2.点击Start Download按钮就可以开始下载了。下载过程中可以下拉系统状态栏查看实时的下载进度

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ServiceBestPractice/Image/2.png)

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ServiceBestPractice/Image/3.png)

3.点击Pause Download或Cancel Download会显示提示

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ServiceBestPractice/Image/4.png)

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ServiceBestPractice/Image/5.png)

4.最终下载完成后会弹出一个Download Success的通知，查看SD卡的Download目录可以看到，文件已经成功下载下来了。

![Image](https://github.com/Small-Windmill/2018118118_Android/raw/master/ServiceBestPractice/Image/6.png)

## 实验总结

通过本次实验，初步了解了子服务的绑定以及子服务代码运行在异步任务。当一个活动和服务绑定了之后，活动和服务的关系更紧密了。通过程序里的启动服务可以保证DownloadService一直在后台运行，绑定服务则可以让MainActivity和DownloadService进行通信。