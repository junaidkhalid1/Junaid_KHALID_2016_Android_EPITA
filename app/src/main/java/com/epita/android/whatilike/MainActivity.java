package com.epita.android.whatilike;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<MyLikes> data = new ArrayList<>();

        data.add(new MyLikes("Football", true));
        data.add(new MyLikes("Tennis", true));
        data.add(new MyLikes("Cricket", false));
        data.add(new MyLikes("Swimming", true));
        data.add(new MyLikes("Shopping", false));
        data.add(new MyLikes("Accrobranche", true));
        data.add(new MyLikes("Swimming", true));

        ListView characterListView = (ListView) findViewById(R.id.listView);
        View emptyListView = findViewById(R.id.Emptylv);
        characterListView.setEmptyView(emptyListView);
        characterListView.setAdapter(new LikesAdapter(data, MainActivity.this));

        characterListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (data.get(position).getsMovie() == "Cricket" || data.get(position).getsMovie() == "Shopping")
                {
                    Toast.makeText(
                            MainActivity.this,
                            "I hate " + data.get(position).getsMovie(),
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(
                            MainActivity.this,
                            "I like " + data.get(position).getsMovie(),
                            Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
