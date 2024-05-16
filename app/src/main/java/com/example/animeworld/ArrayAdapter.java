package com.example.animeworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ArrayAdapter extends RecyclerView.Adapter<ArrayAdapter.MyViewHolder> {
    Context context;
    ArrayList<Model> arrayList;
    private final RecyclerViewInterface recyclerViewInterface;

    public ArrayAdapter(Context context, ArrayList<Model> arrayList, RecyclerViewInterface recyclerViewInterface1) {
        this.context = context;
        this.arrayList = arrayList;
        this.recyclerViewInterface = recyclerViewInterface1;
    }

    @NonNull
    @Override
    public ArrayAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.series_list_view, parent, false);
        return new ArrayAdapter.MyViewHolder(view, recyclerViewInterface);
    }

    @Override
    public void onBindViewHolder(@NonNull ArrayAdapter.MyViewHolder holder, int position) {
        holder.episode.setText(arrayList.get(position).getEposide());
        holder.titleeposide.setText(arrayList.get(position).getTitleeposide());
        Picasso.get().load(arrayList.get(position).getImageUrl()).into(holder.imageseries);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView episode;
        TextView titleeposide;
        ImageView imageseries;
        public MyViewHolder(@NonNull View itemView, RecyclerViewInterface recycleViewInterface) {
            super(itemView);
            episode = itemView.findViewById(R.id.episode);
            titleeposide = itemView.findViewById(R.id.titleepoide);
            imageseries = itemView.findViewById(R.id.imageseries);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (recycleViewInterface != null) {
                        int pos = getAdapterPosition();

                        if (pos != RecyclerView.NO_POSITION) {
                            recycleViewInterface.onItemClick(pos);
                        }
                    }
                }
            });
        }
    }
}
