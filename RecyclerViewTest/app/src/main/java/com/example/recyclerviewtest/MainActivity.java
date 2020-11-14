package com.example.recyclerviewtest;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();//初始化水果数据
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new
                StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);


    }

    private void initFruits() {
        for (int i=0;i<2;i++){
            Fruit apple = new Fruit(getRandomLengthName("苹果"), R.drawable.apple_pic);
            fruitList.add(apple);
            Fruit banana = new Fruit(getRandomLengthName("香蕉"), R.drawable.banana_pic);
            fruitList.add(banana);
            Fruit orange = new Fruit(getRandomLengthName("橙子"), R.drawable.orange_pic);
            fruitList.add(orange);
            Fruit watermelon = new Fruit(getRandomLengthName("西瓜"), R.drawable.watermelon_pic);
            fruitList.add(watermelon);
            Fruit pear = new Fruit(getRandomLengthName("梨"), R.drawable.pear_pic);
            fruitList.add(pear);
            Fruit grape = new Fruit(getRandomLengthName("葡萄"), R.drawable.grape_pic);
            fruitList.add(grape);
            Fruit pineapple = new Fruit(getRandomLengthName("菠萝"), R.drawable.pineapple_pic);
            fruitList.add(pineapple);
            Fruit strawberry = new Fruit(getRandomLengthName("草莓"), R.drawable.strawberry_pic);
            fruitList.add(strawberry);
            Fruit cherry = new Fruit(getRandomLengthName("樱桃"), R.drawable.cherry_pic);
            fruitList.add(cherry);
            Fruit mango = new Fruit(getRandomLengthName("芒果"), R.drawable.mango_pic);
            fruitList.add(mango);
            Fruit durian = new Fruit(getRandomLengthName("榴莲"),R.drawable.durian_pic);
            fruitList.add(durian);
            Fruit cantaloupe = new Fruit(getRandomLengthName("哈密瓜"),R.drawable.cantaloupe_pic);
            fruitList.add(cantaloupe);
        }
    }

    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20) + 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }

}
