package com.example.junyang1.menudisplayapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class menudisplayActivity extends AppCompatActivity {

    private ListView listView;//set listview to display menu item

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_menudisplay);
        //setting to display listview

       // listView = new ListView(this);
        listView = (ListView) findViewById(R.id.menu_list);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, getData()));




        //setContentView(listView);

    }

    /**
     * this method create data to test listview
     * @return
     */

    private List<String> getData(){

        List<String> data = new ArrayList<String>();
        data.add("menu1");
        data.add("menu2");
        data.add("menu3");
        data.add("menu4");

        return data;
    }

}
