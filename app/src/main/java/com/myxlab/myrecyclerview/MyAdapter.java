package com.myxlab.myrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by haslina on 9/23/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ItemData[] itemDatas;
    private Context context;

    public MyAdapter(ItemData[] itemDatas, Context context) {
        this.itemDatas = itemDatas;
        this.context = context;
    }

    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //create a new view of each item of the recycler view
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, null);
        ViewHolder viewHolder = new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyAdapter.ViewHolder holder, int position) {

        // gets data from your itemdata class at this position
        // replaces the contents of the view with that itemdata

        holder.title.setText(itemDatas[position].getTitle());
        holder.imageView.setImageResource(itemDatas[position].getImageURL());
    }

    @Override
    public int getItemCount() {
        return itemDatas.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView title;


        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageViewChemicals);
            title = (TextView) itemView.findViewById(R.id.textViewTitle);
        }
    }


}
