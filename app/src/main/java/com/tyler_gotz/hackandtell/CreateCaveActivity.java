package com.tyler_gotz.hackandtell;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tyler Gotz on 4/23/2016.
 */
public class CreateCaveActivity extends Activity
{
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_cave_activity);
        spinner = (Spinner) findViewById(R.id.spinner);
        List<String> list = new ArrayList<>();
        for(int i = 4; i <= 10; i++)
        {
            list.add(String.valueOf(i));
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        spinner.setAdapter(adapter);
    }
}
