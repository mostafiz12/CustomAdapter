package myappsapps.com.customlistviewadapter;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<LearnLanguages> ll = new ArrayList<LearnLanguages>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll.add(new LearnLanguages("Java", R.mipmap.icce, 87));
        ll.add(new LearnLanguages("Python", R.mipmap.ic_launcher, 88));
        ll.add(new LearnLanguages("Ajax", R.mipmap.ic_launcher, 45));
        ll.add(new LearnLanguages("C Sharp", R.mipmap.ic_launcher, 55));
        ll.add(new LearnLanguages("Cobol", R.mipmap.ic_launcher, 99));
        ll.add(new LearnLanguages("Fortran", R.mipmap.ic_launcher, 66));
        ll.add(new LearnLanguages("Basic", R.mipmap.ic_launcher, 67));
        ll.add(new LearnLanguages("Cobol", R.mipmap.ic_launcher, 99));
        ll.add(new LearnLanguages("Fortran", R.mipmap.ic_launcher, 66));
        ll.add(new LearnLanguages("Basic", R.mipmap.ic_launcher, 67));

        ArrayAdapter<LearnLanguages> arrayAdapter = new CustomAdapter();
        ListView lvv=(ListView)findViewById(R.id.li);
        lvv.setAdapter(arrayAdapter);

    }

    public class CustomAdapter extends ArrayAdapter<LearnLanguages> {

        public CustomAdapter() {
            super(MainActivity.this,R.layout.my_layout, ll);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.my_layout, parent,false);
            }

            LearnLanguages lrnL=ll.get(position);
            ImageView ima=(ImageView)convertView.findViewById(R.id.imageView);
            TextView textView=(TextView)convertView.findViewById(R.id.textView);
            TextView textView1=(TextView)convertView.findViewById(R.id.textView1);

            ima.setImageResource(lrnL.getImageID());
            textView.setText(lrnL.getNameOfLang());
            textView1.setText(String.valueOf(lrnL.getNumberOfTutorials()));

            return convertView;
        }


    }
}