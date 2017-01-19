package com.example.deepakrattan.navigationdrawer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Deepak Rattan on 31-Dec-16.
 */

public class DrawerListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<NavItem> navItemArrayList;
    private LayoutInflater inflater;

    public DrawerListAdapter(Context context, ArrayList<NavItem> navItemArrayList) {
        this.context = context;
        this.navItemArrayList = navItemArrayList;
    }

    @Override
    public int getCount() {
        return navItemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return navItemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(R.layout.drawer_item, parent, false);

        //Getting views
        ImageView img = (ImageView) convertView.findViewById(R.id.icon1);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.title1);
        TextView txtDesc = (TextView) convertView.findViewById(R.id.desc1);

        NavItem navItem = navItemArrayList.get(position);

        img.setImageResource(navItem.getImage());
        txtTitle.setText(navItem.getName());
        txtDesc.setText(navItem.getDesc());


        return convertView;
    }
}
