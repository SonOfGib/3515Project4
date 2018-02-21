package edu.temple.Project4_3515;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Custom adapter that changes the TextView background to the color of the text it contains.
 * Created by Sean Gibson on 2/13/2018.
 */
public class PaletteAdapter extends BaseAdapter{

    public static final String SELECTED_COLOR = "SELECTED_COLOR";

    private String[] colors;
    private Context context;

    PaletteAdapter(@NonNull Context context, @NonNull String[] colors) {
        this.context = context;
        this.colors = colors;
    }

    @Override
    public int getCount(){
        return colors.length;
    }

    @Override
    public Object getItem(int position) {
        return colors[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = new TextView(context);
        }
        final int color = Color.parseColor(colors[i]);
        TextView textView = (TextView) view;
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 24f);
        textView.setText(colors[i]);
        textView.setBackgroundColor(color);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CanvasActivity.class);
                intent.putExtra(SELECTED_COLOR, color);
                context.startActivity(intent);
            }
        });
        return textView;
    }
}
