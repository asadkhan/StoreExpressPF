package com.example.irfan.storeexpressagas.Adapters;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.irfan.storeexpressagas.R;
import com.example.irfan.storeexpressagas.baseclasses.BaseActivity;
import com.example.irfan.storeexpressagas.models.Cart;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CheckOutCartItemAdapter extends RecyclerView.Adapter<CheckOutCartItemAdapter.ListViewHolder> {

    private List<Cart> itemList;
    Context c;

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView txtItemName,txtItemPrice,txt_qty;
        public LinearLayout layout_color;

        private String mItem;
        private TextView mTextView;
        public ListViewHolder(View view) {
            super(view);
            view.setOnClickListener(this);

            layout_color =(LinearLayout) view.findViewById(R.id.layout_color);
            txtItemName = (TextView) view.findViewById(R.id.txt_item_name);

            txtItemPrice = (TextView) view.findViewById(R.id.txt_item_price);

            txt_qty = (TextView) view.findViewById(R.id.txt_qty);


        }



        @Override
        public void onClick(View view) {
            // Log.d("APITEST:", "onClick " + getPosition() + " " + mItem);


        }
    }





    public CheckOutCartItemAdapter(List<Cart> itemlist,Context C) {
        this.itemList = itemlist;
        c=C;
    }



    @Override
    public CheckOutCartItemAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.checkout_cart_item, parent, false);

        return new CheckOutCartItemAdapter.ListViewHolder(itemView);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(CheckOutCartItemAdapter.ListViewHolder holder, int position) {
        Cart cartitem = itemList.get(position);


            String name=cartitem.ItemName+ " X "+ String.valueOf(cartitem.ItemQty);
        holder.txtItemName.setText(cartitem.ItemName);
        holder.txt_qty.setText(String.valueOf(cartitem.ItemQty)+" x ");
        holder.txtItemPrice.setText(String.valueOf(cartitem.ItemPrice));

        if(BaseActivity.isOdd(position)) {
            Log.d("test","ODD");
            Log.d("test",String.valueOf(position));
            holder.layout_color.setBackgroundColor(c.getResources().getColor(R.color.grey_bg));
        }
        else{

            holder.layout_color.setBackgroundColor(c.getResources().getColor(R.color.colorAccent));

        }

        // formatting the date appropriately.


    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }



}
