package com.example.chandan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.chandan.aktu_sample.R;
import com.journaldev.expandablelistview.CustomExpandableListAdapter;
import com.journaldev.expandablelistview.El_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class el2 extends AppCompatActivity {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    HashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cs_sem3s);
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);
        expandableListDetail = El_2.getData();
        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);


    }

}