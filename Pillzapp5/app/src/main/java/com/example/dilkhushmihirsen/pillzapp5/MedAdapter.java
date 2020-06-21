package com.example.dilkhushmihirsen.pillzapp5;

/**
 * Created by dilkhushmihirsen on 17/05/19.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.widget.TextView;
import android.graphics.*;

import java.lang.*;
import java.util.*;

public class MedAdapter extends RecyclerView.Adapter<MedAdapter.MyViewHolder>
{




    private List<MedSched> medSchedList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public EditText sno,mednam,desc,create,start,end,status;
        public TextView textView8,textView9, textView10, textView19, textView20,textView21,textView22,textView26,textView27,textView23,textView24,textView28,textView30;

        public MyViewHolder(View view) {
            super(view);
            textView8 = (TextView) view.findViewById(R.id.textView8);
            textView9 = (TextView) view.findViewById(R.id.textView9);
            textView10 = (TextView) view.findViewById(R.id.textView10);
            textView19 = (TextView) view.findViewById(R.id.textView19);
            textView20 = (TextView) view.findViewById(R.id.textView20);
            textView21 = (TextView) view.findViewById(R.id.textView21);
            textView22 = (TextView) view.findViewById(R.id.textView22);
            textView26 = (TextView) view.findViewById(R.id.textView26);
            textView27 = (TextView) view.findViewById(R.id.textView27);
            textView23 = (TextView) view.findViewById(R.id.textView23);
            textView24 = (TextView) view.findViewById(R.id.textView24);
            textView28 = (TextView) view.findViewById(R.id.textView28);
            textView30 = (TextView) view.findViewById(R.id.textView30);

            sno = (EditText) view.findViewById(R.id.sno);
            mednam = (EditText) view.findViewById(R.id.mednam);
            desc = (EditText) view.findViewById(R.id.desc);
            create = (EditText) view.findViewById(R.id.create);
            start = (EditText) view.findViewById(R.id.start);
            end = (EditText) view.findViewById(R.id.end);
            status = (EditText) view.findViewById(R.id.status);

        }
    }


    public MedAdapter(List<MedSched> medSchedList) {
        this.medSchedList = medSchedList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.display_det, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        MedSched med = medSchedList.get(position);
        holder.sno.setId(med.getId());
        holder.mednam.setText(med.getMed());
        holder.desc.setText(med.getDesc());
        holder.create.setText(med.getCreate());
        holder.start.setText(med.getStart());
        holder.end.setText(med.getEnd());
        holder.status.setText(med.getStatus());
    }

    @Override
    public int getItemCount() {
        return medSchedList.size();
    }
}
