package com.codeb1ooded.digifest;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by megha on 03/12/17.
 */

public class RecordsAdapter extends ArrayAdapter<String> {

    Context context;
    ArrayList<String> myItems;

    public RecordsAdapter(Context context, ArrayList<String> objects) {
        super(context, 0, objects);
        myItems = objects;
        this.context = context;
    }

    static class ViewHolder{

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        /*
        if(convertView == null){
            convertView = View.inflate(context, R.layout.stock_single_item_layout, null);
            ViewHolder vh = new ViewHolder();
            vh.companyNameTextView = (TextView) convertView.findViewById(R.id.companyNameFromListFragment);
            vh.percentageChangeTextView = (TextView) convertView.findViewById(R.id.percentageChangeFromListFragment);
            vh.priceTextView = (TextView) convertView.findViewById(R.id.currentPriceFromListFragment);
            convertView.setTag(vh);
        }
        Stocks currentStock = myStocks.get(position);
        ViewHolder vh = (ViewHolder) convertView.getTag();
        vh.companyNameTextView.setText(currentStock.getCompanyName());
        vh.priceTextView.setText(currentStock.getCurrentPrice()+"");
        vh.percentageChangeTextView.setText((currentStock.getPercentChange()+""));
        return convertView;
         */
        return null;
    }
}
