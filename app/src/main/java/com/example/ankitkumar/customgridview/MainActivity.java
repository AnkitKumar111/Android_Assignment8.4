package com.example.ankitkumar.customgridview;

        import android.graphics.drawable.Drawable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.BaseAdapter;
        import android.widget.GridView;
        import android.widget.ListView;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView listview = (GridView) findViewById(R.id.listView);
        String[] name = {"Cupcake", "Donut", "Eclair", "Froyo", "GingerBread", "Honeycomb", "Ice Cream Sandwich", "Jelly Bean", "KitKat"};
        BaseAdaptorLearn learnadaptor = new BaseAdaptorLearn(this, name);

        listview.setAdapter(learnadaptor);
    }
}