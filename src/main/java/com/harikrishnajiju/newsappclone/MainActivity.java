package com.harikrishnajiju.newsappclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] pictures = {R.drawable.news1,R.drawable.news2,R.drawable.news3,R.drawable.news4,R.drawable.news5,R.drawable.news6,R.drawable.news7,R.drawable.news8};
    String[] headline = {"Queen 'delighted' after Harry and Meghan announce birth of baby girl","My foggy glasses solution helped me through Covid","Phil Foden: Manchester City midfielder Europe's most valuable player, says CIES Football Observatory","Amazon-dwellers lived sustainably for 5,000 years","Dan Evans, Katie Boulter & Harriet Dart win in Nottingham","Euro 2020: How Gareth Southgate restored faith in England’s national team","Donald Trump calls Bitcoin 'a scam against the dollar","iOS15: Apple continues privacy war with app tracker reports"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView l = findViewById(R.id.LV);
        l.setAdapter(new MyAdapter(this));
    }

    public class MyAdapter extends BaseAdapter {
        Context context;
        public MyAdapter(MainActivity mainActivity) {
            context = mainActivity;
        }
        @Override
        public int getCount() {
            return pictures.length;
        }
        @Override
        public Object getItem(int position) {
            return null;
        }
        @Override
        public long getItemId(int position) {
            return 0;
        }
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = LayoutInflater.from(context).inflate(R.layout.newsdisplay,parent,false);
            ImageView imageView = view.findViewById(R.id.imageView);
            TextView tv = view.findViewById(R.id.textView);
            imageView.setBackgroundResource(pictures[position]);
            view.setPadding(5,5,5,5);
            tv.setText(headline[position]);

            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    i.putExtra("position", headline[position]);
                    startActivity(i);
                }
            });
            return view;
        }
    }
}