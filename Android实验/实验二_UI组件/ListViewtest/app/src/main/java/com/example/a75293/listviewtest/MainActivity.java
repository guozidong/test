package com.example.a75293.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listView1);//获取列表视图
        int[] imageId=new int[]{R.drawable.cat,R.drawable.dog,
        R.drawable.elephant,R.drawable.lion,R.drawable.monkey,
        R.drawable.tiger};//定义并初始化保存图片ID的数组

        String[] title=new String[]{"cat","dog","elephant","lion","monkey","tiger"};//定义并初始化保存列表项文字的数组

        final List<Map<String,Object>>listItems=new ArrayList<Map<String,Object>>();

        for(int i=0;i<imageId.length;i++){
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("image",imageId[i]);
            map.put("title",title[i]);
            listItems.add(map);
        }

        //参数一context：上下文
        //参数二data：数据源 ，一个Map组成的List集合
        //参数三resource:列表项的布局文件
        //参数四from:Map的键名
        //参数五to:绑定数据视图中的id,与from成对应关系

        final SimpleAdapter adapter=new SimpleAdapter(this,listItems,R.layout.items,new String[]{"title","image",
        },new int[]{R.id.title,R.id.image});
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,listItems.get(position).get("title").toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

}
