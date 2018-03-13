package edu.temple.Project4_3515;

import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class PaletteActivity extends AppCompatActivity implements PaletteFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);



    }

    @Override
    public void onColorSelected(int color) {
        CanvasFragment paletteFragment = (CanvasFragment) getSupportFragmentManager()
                .findFragmentById(R.id.canvasFragment);
        paletteFragment.updateBackgroundColor(color);
    }
}
