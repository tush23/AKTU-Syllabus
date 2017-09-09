package com.example.chandan.Ni_Use;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.chandan.aktu_sample.R;

import java.util.ArrayList;

public class BranchAdapter<M> extends ArrayAdapter<Myclass> {

    public BranchAdapter(Context context, int content, ArrayList<Myclass> resource) {
        super(context,0, resource);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView =convertView;
        if (listView==null){
            listView= LayoutInflater.from(getContext()).inflate(R.layout.content,parent,false);
        }

        Myclass myclass =getItem(position);

        TextView selectBranch = (TextView) listView.findViewById(R.id.sub);
        selectBranch.setText(myclass.getMbranch());

        TextView unit = (TextView)listView.findViewById(R.id.units);
        unit.setText(myclass.getMunits());

        return listView;
    }
}
