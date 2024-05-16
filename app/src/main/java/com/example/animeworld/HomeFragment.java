package com.example.animeworld;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class HomeFragment extends Fragment {
    ImageView imageView1, slide1, slide2, slide3, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        imageView1 = view.findViewById(R.id.IMAGE1);
        slide1 = view.findViewById(R.id.slide1);
        slide2 = view.findViewById(R.id.slide2);
        slide3 = view.findViewById(R.id.slide3);
        imageView2 = view.findViewById(R.id.image2);
        imageView3 = view.findViewById(R.id.imageView3);
        imageView4 = view.findViewById(R.id.imageView4);
        imageView5 = view.findViewById(R.id.imageView5);
        imageView6 = view.findViewById(R.id.imageView6);
        imageView7 = view.findViewById(R.id.imageView77);
        imageView8 = view.findViewById(R.id.imageView88);
        Picasso.get().load("https://images.immediate.co.uk/production/volatile/sites/3/2022/10/MV5BOGZmYjkxMDItNmQ3ZC00YzdlLThjMDktYWJkOGZiOWU1NmY0XkEyXkFqcGdeQXVyMTA3MzQ4MTcw.V1-f69daeb.jpg?quality=90&resize=980,654").into(slide1);
        Picasso.get().load("https://www.denofgeek.com/wp-content/uploads/2022/03/Attack-On-Titan-Season-4-Episode-25-Rebellion-Meeting.jpg?resize=768%2C432").into(slide2);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS05zX4R9PO3KC9Etx_f9ctvxhNSrOuhnzyKQ&usqp=CAU").into(slide3);


        Picasso.get().load("https://www.animeinformer.com/wp-content/uploads/2022/09/naruto-wallpapers-1068x601.jpg").into(imageView1);
        Picasso.get().load("https://lh3.googleusercontent.com/fEJ_qMlw3gVssSOW3gZtqQoMDPqN97viw1h92g8hsj8I6cu4jjbJWPAMkb0vB_YTzCEqyidOILASuOMeQk-tsJ6Sog=w640-h400-e365-rj-sc0x00ffffff").into(imageView2);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS05zX4R9PO3KC9Etx_f9ctvxhNSrOuhnzyKQ&usqp=CAU").into(imageView3);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS2zvzV5ECF0Gu2swCLKYB3JHhYYnHTlO0aDg&usqp=CAU").into(imageView4);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcReBprHtlKk_5ag-agYtSORtRSu-iA47qN5Ew&usqp=CAU").into(imageView5);
        Picasso.get().load("https://w0.peakpx.com/wallpaper/10/306/HD-wallpaper-anime-fullmetal-alchemist-edward-elric-alphonse-elric-fullmetal-alchemist-brotherhood.jpg").into(imageView6);
        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPp_bHJ7Bqi5-LdkGeJSmv7CuhAls81ePMhg&usqp=CAU").into(imageView7);
        Picasso.get().load("https://sportshub.cbsistatic.com/i/2021/09/07/def6efef-5ce2-44ff-82c0-ebb367fd547f/boruto-naruto-kawaki-rogue-status-tease-manga-spoilers-1280406.jpg").into(imageView8);



        slide1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SlideVideoPlayer.class);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b");
                intent.setData(uri);
                intent.putExtra("slide1", uri.toString());
                startActivity(intent);
            }
        });



        slide2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SlideVideoPlayer.class);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b");
                intent.setData(uri);
                intent.putExtra("slide2", uri.toString());
                startActivity(intent);
            }
        });

        slide3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SlideVideoPlayer.class);
                Uri uri = Uri.parse("https://firebasestorage.googleapis.com/v0/b/audiodemo-2e60e.appspot.com/o/Pathaan%20Official%20Teaser_HD_720p-(Hd9video).mp4?alt=media&token=6f948d00-2776-434f-b587-640d691a287b");
                intent.setData(uri);
                intent.putExtra("slide3", uri.toString());
                startActivity(intent);
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Series1.class);
                startActivity(intent);
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Series1.class);
                startActivity(intent);
            }
        });







        //last return
        return view;

    }
}