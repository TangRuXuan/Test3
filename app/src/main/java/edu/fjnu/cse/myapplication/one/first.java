package edu.fjnu.cse.myapplication.one;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import edu.fjnu.cse.myapplication.R;


public class first extends AppCompatActivity {

    private String[] names = new String[]
            {"lion", "tiger", "monkey", "dog", "cat", "elephant"};
    private int[] imageIds = new int[]
            {R.drawable.lion, R.drawable.tiger, R.drawable.monkey, R.drawable.dog,
                    R.drawable.cat, R.drawable.elephant};
    private ListView listView;


    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();

        map.put("img", R.drawable.lion);
        map.put("title", "lion");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.tiger);
        map.put("title", "tiger");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.monkey);
        map.put("title", "monkey");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.dog);
        map.put("title", "dog");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.cat);
        map.put("title", "cat");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("img", R.drawable.elephant);
        map.put("title", "elephant");
        list.add(map);
        return list;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        listView = (ListView) findViewById(R.id.listview);
        SimpleAdapter adapter = new SimpleAdapter(this, getData(),
                R.layout.main, new String[]{"img", "title"},
                new int[]{R.id.text1, R.id.text2});

        listView.setAdapter(adapter);
    }
}


