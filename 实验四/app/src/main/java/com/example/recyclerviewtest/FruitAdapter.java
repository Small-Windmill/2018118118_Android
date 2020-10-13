package com.example.recyclerviewtest;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter <FruitAdapter.ViewHolder>{
   private List<Fruit> mFruitList;


   static class ViewHolder extends RecyclerView.ViewHolder {
       View fruitView;
       ImageView fruitImage;
       TextView fruitName;

       public ViewHolder(View view) {
           super(view);
           fruitView = view;
           fruitImage = (ImageView) view.findViewById(R.id.fruit_image);
           fruitName = (TextView) view.findViewById(R.id.fruit_name);
       }
   }
   public FruitAdapter(List<Fruit>fruitList){
       mFruitList=fruitList;
   }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext())
               .inflate(R.layout.fruit_item,parent,false);
       final ViewHolder holder = new ViewHolder(view);
        holder.fruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final int position = holder.getAdapterPosition();
                final Fruit fruit = mFruitList.get(position);
                Toast.makeText(v.getContext(), "you clicked view " + fruit.getName(),
                        Toast.LENGTH_SHORT).show();
                final EditText et = new EditText(v.getContext());
                new AlertDialog.Builder(v.getContext()).setTitle("可以修改水果名称")
                        .setView(et)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Fruit f = mFruitList.get(mFruitList.indexOf(fruit));
                                f.setName(et.getText().toString());
                                mFruitList.set(mFruitList.indexOf(fruit),f);
                                Toast.makeText(v.getContext(),"成功修改为:"+et.getText().toString(),
                                        Toast.LENGTH_SHORT).show();
                               notifyItemChanged(position);
                            }
                        }).setNegativeButton("取消",null).show();
            }
        });
        holder.fruitImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Fruit fruit = mFruitList.get(position);
                Toast.makeText(v.getContext(), "you clicked image " + fruit.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
       return holder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        final Fruit fruit = mFruitList.get(position);
        holder.fruitImage.setImageResource(fruit.getImageId());
        holder.fruitName.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return mFruitList.size();
    }
}
