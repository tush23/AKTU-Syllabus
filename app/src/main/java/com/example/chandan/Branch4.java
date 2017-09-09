package com.example.chandan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.chandan.Ni_Use.BranchAdapter;
import com.example.chandan.Ni_Use.Myclass;
import com.example.chandan.aktu_sample.R;

import java.util.ArrayList;

public class Branch4 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        ArrayList<Myclass> words = new ArrayList<Myclass>();
        words.add(new Myclass(" *****It will Update soon*****",""));
       /* words.add(new Myclass("Information and Technology",""));
        words.add(new Myclass("Mechanical ",""));
        words.add(new Myclass("Civil",""));
        words.add(new Myclass("Electrical",""));
        words.add(new Myclass("Chemical",""));
        words.add(new Myclass("Electronics & Instrumentation",""));
        words.add(new Myclass("Agriculture Engineering",""));*/


        BranchAdapter<Myclass> branchAdapter = new BranchAdapter<Myclass>(this,R.layout.content,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(branchAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

             /*   else if (i==2){
                    Intent intent = new Intent(Branch4.this,sem_select_me3.class);
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(Branch4.this,sem_select_cv3.class);
                    startActivity(intent);
                }*/
            }
        });
    }
}