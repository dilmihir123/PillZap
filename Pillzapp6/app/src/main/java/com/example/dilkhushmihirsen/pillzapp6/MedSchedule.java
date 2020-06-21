package com.example.dilkhushmihirsen.pillzapp6;

/**
 * Created by dilkhushmihirsen on 17/05/19.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.graphics.*;


import java.util.List;

public class MedAdapter extends RecyclerView.Adapter<MedAdapter.MyViewHolder> {

    private List<MedSched> medSchedList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textView2,textView3, textView4, textView5, textView6,textView7,textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18;
        public EditText sno,mednam,desc,create,start,end,status;

        public MyViewHolder(View view) {
            super(view);
            textView2 = (TextView) view.findViewById(R.id.textView2);
            textView3 = (TextView) view.findViewById(R.id.textView3);
            textView4 = (TextView) view.findViewById(R.id.textView4);
            textView5 = (TextView) view.findViewById(R.id.textView5);
            textView6 = (TextView) view.findViewById(R.id.textView6);
            textView7 = (TextView) view.findViewById(R.id.textView7);
            textView11 = (TextView) view.findViewById(R.id.textView11);
            textView12 = (TextView) view.findViewById(R.id.textView12);
            textView13 = (TextView) view.findViewById(R.id.textView13);
            textView14 = (TextView) view.findViewById(R.id.textView14);
            textView15 = (TextView) view.findViewById(R.id.textView15);
            textView16 = (TextView) view.findViewById(R.id.textView16);
            textView17 = (TextView) view.findViewById(R.id.textView17);
            textView18 = (TextView) view.findViewById(R.id.textView18);

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
        MedSched medSched = medSchedList.get(position);
        holder.sno.setId(medSched.getId());
        holder.mednam.setText(medSched.getMed());
        holder.desc.setText(medSched.getDesc());
        holder.create.setText(medSched.getCreate());
        holder.start.setText(medSched.getStart());
        holder.end.setText(medSched.getEnd());
        holder.status.setText(medSched.getStatus());
    }

    @Override
    public int getItemCount() {
        return medSchedList.size();
    }
}
