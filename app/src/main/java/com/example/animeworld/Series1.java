package com.example.animeworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Series1 extends AppCompatActivity implements RecyclerViewInterface {

    ArrayList<Model> arrayList = new ArrayList<>();
    RecyclerView recyclerView;

    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_series1);
        Window window = this.getWindow();
        window.setStatusBarColor(this.getResources().getColor(R.color.noti));
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#25252E"));
        actionBar.setBackgroundDrawable(colorDrawable);
        recyclerView = findViewById(R.id.recycle_view);


        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), arrayList, this);
        recyclerView.setAdapter(arrayAdapter);

        reference = FirebaseDatabase.getInstance("https://animeworld-666ff-default-rtdb.asia-southeast1.firebasedatabase.app/").getReference();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


//        arrayList.add(new Model("https://www.animeinformer.com/wp-content/uploads/2022/09/naruto-wallpapers-1068x601.jpg", "Episode 1", "Begining", "https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b"));
//        arrayList.add(new Model("https://www.animeinformer.com/wp-content/uploads/2022/09/naruto-wallpapers-1068x601.jpg", "Episode 1", "Begining", "https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b"));
//        arrayList.add(new Model("https://www.animeinformer.com/wp-content/uploads/2022/09/naruto-wallpapers-1068x601.jpg", "Episode 1", "Begining", "https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b"));
//        arrayList.add(new Model("https://www.animeinformer.com/wp-content/uploads/2022/09/naruto-wallpapers-1068x601.jpg", "Episode 1", "Begining", "https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b"));
//        arrayList.add(new Model("https://www.animeinformer.com/wp-content/uploads/2022/09/naruto-wallpapers-1068x601.jpg", "Episode 1", "Begining", "https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b"));
//        arrayList.add(new Model("https://www.animeinformer.com/wp-content/uploads/2022/09/naruto-wallpapers-1068x601.jpg", "Episode 1", "Begining", "https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b"));
//        arrayList.add(new Model("https://www.animeinformer.com/wp-content/uploads/2022/09/naruto-wallpapers-1068x601.jpg", "Episode 1", "Begining", "https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b"));
//        arrayList.add(new Model("https://www.animeinformer.com/wp-content/uploads/2022/09/naruto-wallpapers-1068x601.jpg", "Episode 1", "Begining", "https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b"));
//        arrayList.add(new Model("https://www.animeinformer.com/wp-content/uploads/2022/09/naruto-wallpapers-1068x601.jpg", "Episode 1", "Begining", "https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b"));


        reference.child("Anime").child("series").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if(snapshot.exists()){
                    for(DataSnapshot snap : snapshot.getChildren() ){
                        Model model1 = snap.getValue(Model.class);
                        arrayList.add(new Model(model1.getImageUrl(), model1.getEposide(), model1.getTitleeposide(), model1.getPlayUrl()));
                    }
                    arrayAdapter.notifyDataSetChanged();
                }else{
                    Toast.makeText(Series1.this, "ERROR", Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    @Override
    public void onItemClick(int position) {

        Intent intent = new Intent(Series1.this, Videoplayer.class);
        Uri uri = Uri.parse(arrayList.get(position).getPlayUrl());
        intent.setData(uri);
        intent.putExtra("play", uri.toString());
        startActivity(intent);


    }
}