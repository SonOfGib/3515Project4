package edu.temple.Project4_3515;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        //colors
        String colors[] = {"White","Red", "Blue", "Green", "Yellow", "Purple", "Darkgrey", "Navy",
                "Aqua", "Lime", "Maroon", "Olive", "Silver", "Cyan"};

        GridView gridView = (GridView) findViewById(R.id.paletteGrid);
        gridView.setAdapter(new PaletteAdapter(this, colors));
    }
}
