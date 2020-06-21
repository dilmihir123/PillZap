package com.example.dilkhushmihirsen.pillzapp7;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.MyViewHolder> {

    private List<Med> medList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public EditText sno,medname,desc,create,start,end,status;

        public MyViewHolder(View view) {
            super(view);
            sno = (EditText) view.findViewById(R.id.sno);
            medname = (EditText) view.findViewById(R.id.medname);
            desc = (EditText) view.findViewById(R.id.desc);
            create = (EditText) view.findViewById(R.id.create);
            start = (EditText) view.findViewById(R.id.start);
            end = (EditText) view.findViewById(R.id.end);
            status = (EditText) view.findViewById(R.id.status);
        }
    }


    public RecycleAdapter(List<Med> moviesList) {
        this.medList = medList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_display_det, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Med movie = medList.get(position);
        holder.sno.setText(movie.getId());
        holder.medname.setText(movie.getMed());
        holder.desc.setText(movie.getDesc());
        holder.create.setText(movie.getCreate());
        holder.start.setText(movie.getStart());
        holder.status.setText(movie.getStatus());
        holder.end.setText(movie.getEnd());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    //@Override
    /*public int getItemCount() {
        return medList.size();
    }*/
}
