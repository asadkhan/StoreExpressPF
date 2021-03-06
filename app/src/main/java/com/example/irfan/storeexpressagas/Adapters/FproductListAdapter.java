package com.example.irfan.storeexpressagas.Adapters;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.irfan.storeexpressagas.R;
import com.example.irfan.storeexpressagas.activities.MainActivity;
import com.example.irfan.storeexpressagas.activities.ProductActivity;
import com.example.irfan.storeexpressagas.activities.ProductsListActivity;
import com.example.irfan.storeexpressagas.baseclasses.BaseActivity;
import com.example.irfan.storeexpressagas.extras.ActivityManager;
import com.example.irfan.storeexpressagas.extras.UpdateCart;
import com.example.irfan.storeexpressagas.models.Cart;
import com.example.irfan.storeexpressagas.models.CategoryResponse;
import com.example.irfan.storeexpressagas.models.FproductResponse;
import com.example.irfan.storeexpressagas.models.FproductTwoCol;
import com.example.irfan.storeexpressagas.models.Product;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FproductListAdapter  extends RecyclerView.Adapter<FproductListAdapter.ListViewHolder>{
    private UpdateCart listener;
    private List<FproductTwoCol> productsList;
    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView img1,img2;
        public TextView TxtPrice1,TxtPrice2,TxtName1,TxtName2,TxtAddToCart,TxtAddToCartTwo;
       public LinearLayout Ladd ,Ladd1, LproductTwo, LproductOne ;

        private String mItem;

        public ListViewHolder(View view) {
            super(view);
           // view.setOnClickListener(this);

            img1 = (ImageView) view.findViewById(R.id.Img_Product1);
            img2 = (ImageView) view.findViewById(R.id.ImgProduct2);

            TxtPrice1 = (TextView) view.findViewById(R.id.txt_price3);
            TxtPrice2 = (TextView) view.findViewById(R.id.txt_price);
            TxtName1 = (TextView) view.findViewById(R.id.txt_name1);
            TxtName2 = (TextView) view.findViewById(R.id.txt_name2);
            TxtAddToCart=(TextView) view.findViewById(R.id.txt_add);
            TxtAddToCartTwo=(TextView) view.findViewById(R.id.txt_AddTwo);
             Ladd = (LinearLayout )view.findViewById(R.id.ladd);
            Ladd1 = (LinearLayout )view.findViewById(R.id.ladd);
            LproductOne = (LinearLayout )view.findViewById(R.id.LproductOne);

            LproductTwo = (LinearLayout )view.findViewById(R.id.LproductTwo);

            Ladd.setOnClickListener(this);
            Ladd1.setOnClickListener(this);
            img1.setOnClickListener(this);
            TxtName1.setOnClickListener(this);
            img2.setOnClickListener(this);
            TxtAddToCart.setOnClickListener(this);
            TxtAddToCartTwo.setOnClickListener(this);
        }



        @Override
        public void onClick(View view) {
            Log.d("test:", "click");

            if(view.getId()==R.id.Img_Product1  ) {
              FproductTwoCol   mobj = productsList.get(getPosition());

                Product obj =new Product();
                obj.img=mobj.ProductoneImg;
                obj.name=mobj.ProductoneName;
                obj.price=mobj.ProductonePrice;
                obj.itemID=mobj.ProductoneID;
                obj.desc=mobj.ProductoneDesc;

                Log.d("test", mobj.ProductoneDesc);
                ProductActivity.obj=null;
                ProductActivity.obj=obj;
                ActivityManager.startActivity(view.getContext(),ProductActivity.class);


            }

            if(view.getId()==R.id.ImgProduct2  ) {
                //   obj = trackableOrderList.get(getPosition());
                FproductTwoCol   mobj = productsList.get(getPosition());
                Product obj =new Product();
                obj.itemID=mobj.ProducttwoID;
                obj.img=mobj.ProducttwoImg;

                obj.name=mobj.ProducttwoName;
                obj.price=mobj.ProducttwoPrice;
                obj.desc=mobj.ProducttwoDesc;
                Log.d("test:", mobj.ProducttwoDesc);
                ProductActivity.obj=null;
                ProductActivity.obj=obj;
                ActivityManager.startActivity(view.getContext(),ProductActivity.class);


                Log.d("test:", "image view click");
            }



            if(view.getId()==R.id.txt_name1) {
                Log.d("test:", "name click");
            }


            if(view.getId()==R.id.txt_add) {
                Log.d("test:", "add cart");
                FproductTwoCol   mobj = productsList.get(getPosition());
                Cart item = new Cart();

                if(mobj.ProductoneID !=0){
                    item.ItemID=mobj.ProductoneID;
                    item.ItemName=mobj.ProductoneName;
                    item.ItemImg=mobj.ProductoneImg;
                    item.ItemPrice=Integer.valueOf(BaseActivity.RemoveSpecialChar(mobj.ProductonePrice));
                    item.ItemQty=1;


                }


                item.addToCart(item.ItemID,item.ItemName,item.ItemPrice,item.ItemQty,view.getContext(),item.ItemImg);
                //showMessageToast(view.getResources().getString(R.string.msg_add_to_car));
                Toast.makeText(view.getContext(),view.getResources().getString(R.string.msg_add_to_car) ,
                        Toast.LENGTH_LONG).show();

                if(view.getContext() instanceof MainActivity){
    ((MainActivity) view.getContext()).UpdateCardCount();
                }

                if(view.getContext() instanceof ProductsListActivity){
                    ((ProductsListActivity) view.getContext()).UpdateCardCount();
                }


            }

            if(view.getId()==R.id.txt_AddTwo){
                Log.d("test:", "add cart");
                FproductTwoCol   mobj = productsList.get(getPosition());
                Cart item = new Cart();


                if(mobj.ProducttwoID !=0){
                    item.ItemID=mobj.ProducttwoID;
                    item.ItemName=mobj.ProducttwoName;
                    item.ItemImg=mobj.ProducttwoImg;
                    item.ItemPrice=Integer.valueOf(BaseActivity.RemoveSpecialChar(mobj.ProducttwoPrice));
                    item.ItemQty=1;


                }

                item.addToCart(item.ItemID,item.ItemName,item.ItemPrice,item.ItemQty,view.getContext(),item.ItemImg);
                //showMessageToast(view.getResources().getString(R.string.msg_add_to_car));
                Toast.makeText(view.getContext(),view.getResources().getString(R.string.msg_add_to_car) ,
                        Toast.LENGTH_LONG).show();
                if(view.getContext() instanceof MainActivity){
                    ((MainActivity) view.getContext()).UpdateCardCount();


                }


                if(view.getContext() instanceof ProductsListActivity){
                    ((ProductsListActivity) view.getContext()).UpdateCardCount();
                }
            }






        }


    }


    public FproductListAdapter(List<FproductTwoCol> fProductsList) {
        this.productsList = fProductsList;

    }



    @Override
    public FproductListAdapter.ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cate_pro_list, parent, false);

        return new FproductListAdapter.ListViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FproductListAdapter.ListViewHolder holder, int position) {
        FproductTwoCol Obj = productsList.get(position);

        String imgURL1=Obj.ProductoneImg;
        String imgURL2=Obj.ProducttwoImg;

        holder.TxtName1.setText(Obj.ProductoneName);
        holder.TxtName2.setText(Obj.ProducttwoName);

        holder.TxtPrice1.setText(Obj.ProductonePrice);
        holder.TxtPrice2.setText(Obj.ProducttwoPrice);


        Picasso.with(holder.img1.getContext()).load(imgURL1).resize(800, 800).centerCrop().into(holder.img1);
        Picasso.with(holder.img2.getContext()).load(imgURL2).resize(800, 800).centerCrop().into(holder.img2);

        // formatting the date appropriately.

        if(Obj.ProductoneName  == null){

           // holder.LproductOne.setVisibility(View.INVISIBLE);

        }

        if(Obj.ProducttwoName == null ){

          //  holder.LproductTwo.setVisibility(View.INVISIBLE);

        }



    }

    @Override
    public int getItemCount() {
        return productsList.size();
    }




}
