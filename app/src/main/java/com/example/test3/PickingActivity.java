package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PickingActivity extends AppCompatActivity {

    private ListView lv1,lv2;
    private FriendAdapter fAdapter;
    private FriendNewAdapter f2Adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picking);

        lv1 = (ListView) findViewById(R.id.listViewFbFriends);
        lv2 = (ListView) findViewById(R.id.listViewNewFriends);

        ArrayList<FriendFb> friendFbList = new ArrayList<>();

        friendFbList.add(new FriendFb(R.drawable.ic_launcher_background, "Luis Carranza" , "+1"));
        friendFbList.add(new FriendFb(R.drawable.ic_launcher_background, "Martin Ramirez" , "+3"));
        friendFbList.add(new FriendFb(R.drawable.ic_launcher_background, "Alan" , "+3"));

        ArrayList<FriendFb> friendNewList = new ArrayList<>();

        friendNewList.add(new FriendFb(R.drawable.ic_launcher_background, "Bruno Diaz" , "+1"));
        friendNewList.add(new FriendFb(R.drawable.ic_launcher_background, "Arian Gallardo" , "+2"));

        fAdapter = new FriendAdapter(this,friendFbList);
        lv1.setAdapter(fAdapter);

        f2Adapter = new FriendNewAdapter(this,friendNewList);
        lv2.setAdapter(f2Adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("baia","vaya");
            }
        });

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.e("baia2","vaya2");
            }
        });
    }
}
