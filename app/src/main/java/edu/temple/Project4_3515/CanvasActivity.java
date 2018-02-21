package edu.temple.Project4_3515;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent intent = getIntent();
        int color = intent.getIntExtra(PaletteAdapter.SELECTED_COLOR, Color.WHITE);

        getWindow().getDecorView().setBackgroundColor(color);
    }
}
