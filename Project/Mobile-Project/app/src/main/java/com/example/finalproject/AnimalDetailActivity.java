package com.example.finalproject;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.widget.ImageView;
import android.widget.TextView;

public class AnimalDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_detail);

        Intent in = getIntent();
        int index = in.getIntExtra("com.example.finalproject.ITEM_INDEX", -1);

        if (index > -1) {
            int pic = getImg(index);
            ImageView img = (ImageView) findViewById(R.id.animalImageView);
            scaleImg(img, pic);
        }

    }

    private int getImg(int index) {

        TextView nameTextView = (TextView) findViewById(R.id.nameTextView);

        switch (index) {
            case 0:
                nameTextView.setText("Dog");
                return R.drawable.dog;

            case 1:
                nameTextView.setText("Gorilla");
                return R.drawable.gorilla;

            case 2:
                nameTextView.setText("Cat");
                return R.drawable.cat;

            case 3:
                nameTextView.setText("Lion");
                return R.drawable.lion;

            case 4:
                nameTextView.setText("Tiger");
                return R.drawable.tiger;


            default: return -1;
        }
    }

    private void scaleImg(ImageView img, int pic) {

        Display screen = getWindowManager().getDefaultDisplay();
        BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(getResources(), pic, options);

        int imgWidth = options.outWidth;
        int screenWidth = screen.getWidth();

        if (imgWidth > screenWidth) {
            int ratio = Math.round( (float)imgWidth / (float)screenWidth);
            options.inSampleSize = ratio;
        }

        options.inJustDecodeBounds = false;
        Bitmap scaledImg = BitmapFactory.decodeResource(getResources(), pic, options);
        img.setImageBitmap(scaledImg);

    }


}