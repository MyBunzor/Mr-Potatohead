package com.example.wvand.mrpotatohead;

import android.support.v4.app.BundleCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);            // always call super
        CheckBox cb0 = findViewById(R.id.checkhat);
        outState.putBoolean("hat", cb0.isChecked());
        CheckBox cb1 = findViewById(R.id.checkeyes);
        outState.putBoolean("eyes", cb1.isChecked());
        CheckBox cb2 = findViewById(R.id.checkeyebrows);
        outState.putBoolean("eyebrows", cb2.isChecked());
        CheckBox cb3 = findViewById(R.id.checkglasses);
        outState.putBoolean("glasses", cb3.isChecked());
        CheckBox cb4 = findViewById(R.id.checknose);
        outState.putBoolean("nose", cb4.isChecked());
        CheckBox cb5 = findViewById(R.id.checkmouth);
        outState.putBoolean("mouth", cb5.isChecked());
        CheckBox cb6 = findViewById(R.id.checkmustache);
        outState.putBoolean("mustache", cb6.isChecked());
        CheckBox cb7 = findViewById(R.id.checkears);
        outState.putBoolean("ears", cb7.isChecked());
        CheckBox cb8 = findViewById(R.id.checkarms);
        outState.putBoolean("arms", cb8.isChecked());
        CheckBox cb9 = findViewById(R.id.checkshoes);
        outState.putBoolean("shoes", cb9.isChecked());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            boolean saveHat = savedInstanceState.getBoolean("hat");
            ImageView imageHat = (ImageView) findViewById(R.id.hat);
            imageHat.setVisibility(saveHat ? View.VISIBLE : View.INVISIBLE);

            boolean saveEyes = savedInstanceState.getBoolean("eyes");
            ImageView imageEyes = (ImageView) findViewById(R.id.eyes);
            imageEyes.setVisibility(saveEyes ? View.VISIBLE : View.INVISIBLE);

            boolean saveEyebrows = savedInstanceState.getBoolean("eyebrows");
            ImageView imageEyebrows = (ImageView) findViewById(R.id.eyebrows);
            imageEyebrows.setVisibility(saveEyebrows ? View.VISIBLE : View.INVISIBLE);

            boolean saveGlasses = savedInstanceState.getBoolean("glasses");
            ImageView imageGlasses = (ImageView) findViewById(R.id.glasses);
            imageGlasses.setVisibility(saveGlasses ? View.VISIBLE : View.INVISIBLE);

            boolean saveNose = savedInstanceState.getBoolean("nose");
            ImageView imageNose = (ImageView) findViewById(R.id.nose);
            imageNose.setVisibility(saveNose ? View.VISIBLE : View.INVISIBLE);

            boolean saveMouth = savedInstanceState.getBoolean("mouth");
            ImageView imageMouth = (ImageView) findViewById(R.id.mouth);
            imageMouth.setVisibility(saveMouth ? View.VISIBLE : View.INVISIBLE);

            boolean saveMustache = savedInstanceState.getBoolean("mustache");
            ImageView imageMustache = (ImageView) findViewById(R.id.mustache);
            imageMustache.setVisibility(saveMustache ? View.VISIBLE : View.INVISIBLE);

            boolean saveEars = savedInstanceState.getBoolean("ears");
            ImageView imageEars = (ImageView) findViewById(R.id.ears);
            imageEars.setVisibility(saveEars ? View.VISIBLE : View.INVISIBLE);

            boolean saveArms = savedInstanceState.getBoolean("arms");
            ImageView imageArms = (ImageView) findViewById(R.id.arms);
            imageArms.setVisibility(saveArms ? View.VISIBLE : View.INVISIBLE);

            boolean saveShoes = savedInstanceState.getBoolean("shoes");
            ImageView imageShoes = (ImageView) findViewById(R.id.shoes);
            imageShoes.setVisibility(saveShoes ? View.VISIBLE : View.INVISIBLE);
        }

    }
    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;
        checkbox.getText().toString();
        switch (checkbox.getId()) {
            case (R.id.checkhat):
                if (checkbox.isChecked()) {
                    ImageView hat = (ImageView) findViewById(R.id.hat);
                    hat.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView hat = (ImageView) findViewById(R.id.hat);
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case (R.id.checkeyes):
                if (checkbox.isChecked()) {
                    ImageView eyes = (ImageView) findViewById(R.id.eyes);
                    eyes.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView eyes = (ImageView) findViewById(R.id.eyes);
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case (R.id.checkeyebrows):
                if (checkbox.isChecked()) {
                    ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView eyebrows = (ImageView) findViewById(R.id.eyebrows);
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case (R.id.checkglasses):
                if (checkbox.isChecked()) {
                    ImageView glasses = (ImageView) findViewById(R.id.glasses);
                    glasses.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView glasses = (ImageView) findViewById(R.id.glasses);
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case (R.id.checknose):
                if (checkbox.isChecked()) {
                    ImageView nose = (ImageView) findViewById(R.id.nose);
                    nose.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView nose = (ImageView) findViewById(R.id.nose);
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
            case (R.id.checkmouth):
                if (checkbox.isChecked()) {
                    ImageView mouth = (ImageView) findViewById(R.id.mouth);
                    mouth.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView mouth = (ImageView) findViewById(R.id.mouth);
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case (R.id.checkmustache):
                if (checkbox.isChecked()) {
                    ImageView mustache = (ImageView) findViewById(R.id.mustache);
                    mustache.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView mustache = (ImageView) findViewById(R.id.mustache);
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case (R.id.checkears):
                if (checkbox.isChecked()) {
                    ImageView ears = (ImageView) findViewById(R.id.ears);
                    ears.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView ears = (ImageView) findViewById(R.id.ears);
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case (R.id.checkarms):
                if (checkbox.isChecked()) {
                    ImageView arms = (ImageView) findViewById(R.id.arms);
                    arms.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView arms = (ImageView) findViewById(R.id.arms);
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case (R.id.checkshoes):
                if (checkbox.isChecked()) {
                    ImageView shoes = (ImageView) findViewById(R.id.shoes);
                    shoes.setVisibility(View.VISIBLE);
                }
                else {
                    ImageView shoes = (ImageView) findViewById(R.id.shoes);
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}
