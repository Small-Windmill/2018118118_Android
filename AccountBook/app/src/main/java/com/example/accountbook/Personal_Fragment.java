package com.example.accountbook;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Personal_Fragment extends Fragment {
    String username=null;
    TextView tv_username=null;
    Button btn_img=null;
    TextView tv_psw=null;
    TextView tv_exit=null;
    ImageView img=null;
    UserOperator muserOperator;
    View view=null;
    Bundle bundle=null;
    static int image = R.drawable.one;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        username=bundle.getString("username");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.personal_fragment,null);
        tv_username=(TextView)view.findViewById(R.id.tv_username);
        tv_username.setText(username);
        img=(ImageView)view.findViewById(R.id.img);
        btn_img=(Button)view.findViewById(R.id.btn_img);
        tv_psw=(TextView)view.findViewById(R.id.tv_updatepsw);
        tv_exit=(TextView)view.findViewById(R.id.tv_exit);
        muserOperator=new UserOperator(view.getContext());
        img.setImageResource(image);
        btn_img.setOnClickListener(l);
        tv_psw.setOnClickListener(l);
        tv_exit.setOnClickListener(l);
        return view;
    }

    View.OnClickListener l=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btn_img:
                    Intent intent=new Intent(view.getContext(),HeadActivity.class);
                    startActivityForResult(intent,0x11);
                    break;
                case R.id.tv_exit:
                    Intent intent1=new Intent(view.getContext(),loginActivity.class);
                    startActivity(intent1);
                    break;
                case R.id.tv_updatepsw:
                    Intent intent2=new Intent(view.getContext(),ModifypswActivity.class);
                    intent2.putExtras(bundle);
                    startActivity(intent2);
            }
        }
    };



    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==0x11&&resultCode==0x11){
            Bundle bundle=data.getExtras();
            image=bundle.getInt("imageId");
            img.setImageResource(image);
        }
    }
}
