package com.example.chandan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.chandan.Ni_Use.BranchAdapter;
import com.example.chandan.Ni_Use.Myclass;
import com.example.chandan.aktu_sample.R;

import java.util.ArrayList;

public class Branch3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_branch);
        ArrayList<Myclass> words = new ArrayList<Myclass>();
        words.add(new Myclass("Computer Science",""));
        words.add(new Myclass("Information and Technology",""));
        words.add(new Myclass("Mechanical ",""));
        words.add(new Myclass("Civil",""));
        words.add(new Myclass("Electrical",""));


        BranchAdapter<Myclass> branchAdapter = new BranchAdapter<Myclass>(this,R.layout.content,words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(branchAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i==0){
                    Intent intent = new Intent(Branch3.this,cs3.class);
                    startActivity(intent);
                }

                else if (i==1){
                    Intent intent = new Intent(Branch3.this,it3.class);
                    startActivity(intent);
                }

                else if (i==2){
                    Intent intent = new Intent(Branch3.this,me3.class);
                    startActivity(intent);
                }
                else if (i==3){
                    Intent intent = new Intent(Branch3.this,cv3.class);
                    startActivity(intent);
                }
                else if (i==4){
                    Intent intent = new Intent(Branch3.this,el3.class);
                    startActivity(intent);
                }
            }
        });
    }
}