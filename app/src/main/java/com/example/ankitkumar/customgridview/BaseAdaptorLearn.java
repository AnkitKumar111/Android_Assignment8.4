package com.example.ankitkumar.customgridview;

        import android.content.Context;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.ImageView;
        import android.widget.TextView;

        import org.w3c.dom.Text;

/**
 * Created by Ankit Kumar on 7/2/2017.
 */

public class BaseAdaptorLearn extends BaseAdapter {
    private Context context;
    private String[] versions;


    public BaseAdaptorLearn(Context a, String[] versions){
        this.context=a;
        this.versions=versions;
    }

    @Override
    public int getCount() {

        return versions.length;

    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i("inside ","getvEW");

        if (convertView==null){
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.listitem,parent,false);
        }
        ImageView nam=(ImageView)convertView.findViewById(R.id.textview1);
        TextView vers=(TextView)convertView.findViewById(R.id.ver);

        vers.setText(versions[position]);

        String ver_value=versions[position];
        Log.i("Position: ", String.valueOf(position));
        switch (ver_value){
            case "Cupcake": nam.setImageResource(R.drawable.and1);break;
            case "Donut": nam.setImageResource(R.drawable.and2);break;
            case "Eclair": nam.setImageResource(R.drawable.and3);break;
            case "Froyo": nam.setImageResource(R.drawable.and4);break;
            case "GingerBread": nam.setImageResource(R.drawable.and5);break;
            case "Honeycomb": nam.setImageResource(R.drawable.and6);break;
            case "Ice Cream Sandwich": nam.setImageResource(R.drawable.and7);break;
            case "Jelly Bean": nam.setImageResource(R.drawable.and8);break;
            case "KitKat": nam.setImageResource(R.drawable.and9);break;
        }
        return convertView;
    }
}

