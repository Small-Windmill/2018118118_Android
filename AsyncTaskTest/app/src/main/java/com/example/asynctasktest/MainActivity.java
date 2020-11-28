package com.example.asynctasktest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private Button download;
    private TextView textContent;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        textContent = (TextView)findViewById(R.id.text_info);

        download = (Button)findViewById(R.id.download);
        download.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                DownloadTast dTask = new DownloadTast();
                dTask.execute(100);
            }
        });
    }

    class DownloadTast extends AsyncTask<Integer,Integer,String> {
        //后面尖括号内分别是参数(线程休息时间，进度，返回值类型)
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(Integer... params) {
            for (int i = 0; i <= 100; i++) {
                progressBar.setProgress(i);
                publishProgress(i);
                try {
                    Thread.sleep(params[0]);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return "执行完毕";
        }

        @Override
        protected void onProgressUpdate(Integer... progress) {
            //这个函数在doInBackground调用publishProgress时触发，虽然调用时只有一个参数
            //但是这里取到的是一个数组,所以要用progesss[0]来取值
            //第n个参数就用progress[n]来取值
            textContent.setText(progress[0]+"%");
            super.onProgressUpdate(progress);
        }

        @Override
        protected void onPostExecute(String result) {
            //doInBackground返回时触发，换句话说，就是doInBackground执行完后触发
            //这里的result就是上面doInBackground执行后的返回值，所以这里是"执行完毕"
            setTitle(result);
            super.onPostExecute(result);
        }

    }

}
