package com.example.root.myapplication.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.root.myapplication.ModelClass.Hospital;
import com.example.root.myapplication.R;
import com.example.root.myapplication.fragment.HospitalList;

import java.util.ArrayList;

public class HospNameAdap extends ArrayAdapter<Hospital> {
    ArrayList<Hospital> arrayList = new ArrayList<>();
    View row;
    Context context;
    HospitalList hospitalList = new HospitalList();
    public HospNameAdap(Context context, ArrayList<Hospital> playlistArray) {
        super(context, R.layout.fragment_hospital_list, android.R.id.text1, playlistArray);
        this.arrayList = playlistArray;
        this.context = context;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater)
                    getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            row = inflater.inflate(R.layout.name_list, parent, false);
        } else
            row = convertView;

        Hospital hospital = arrayList.get(position);
        TextView textView = (TextView) row.findViewById(R.id.itemOnList);
        TextView specialization = (TextView) row.findViewById(R.id.itemSpecialization);
        textView.setSingleLine(true);
        textView.setText(hospital.getHospitalName());
        textView.setTextColor(Color.BLACK);
        specialization.setSingleLine(true);
        specialization.setText(hospital.getSpecializations());
        specialization.setTextColor(Color.GRAY);
        ImageView imageView = (ImageView) row.findViewById(R.id.playlist_image);
        imageView.setImageResource(R.drawable.rsz_hossp);


       /* row.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hospitalList.onClick(position);
            }
        });*/
        return row;
    }

}

