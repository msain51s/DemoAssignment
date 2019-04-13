package com.demoassignment.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.demoassignment.R;
import com.demoassignment.model.Result;
import com.demoassignment.utility.ItemClick;

import java.util.List;

public class ArticalListAdapter extends RecyclerView.Adapter<ArticalListAdapter.MyViewHolder> {
    private List<Result> articleList;
    private ItemClick itemClick;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView byline;
        private TextView publishedDate;
        public MyViewHolder(View v) {
            super(v);
            title = v.findViewById(R.id.title);
            byline=v.findViewById(R.id.byline);
            publishedDate =v.findViewById(R.id.published_date);
        }
    }

    public ArticalListAdapter(ItemClick itemClick,List<Result> articleList) {
        this.articleList = articleList;
        this.itemClick=itemClick;
    }

    /* Create new views (invoked by the layout manager)*/

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        /* create a new view*/

        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        final MyViewHolder vh = new MyViewHolder(v);

        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClick.onClick(articleList.get(vh.getAdapterPosition()));
            }
        });

        return vh;
    }

    /* Replace the contents of a view (invoked by the layout manager)*/

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        /* get element from your dataset at this position*/
        /* replace the contents of the view with that element*/

        holder.title.setText(articleList.get(position).getTitle());
        holder.byline.setText(articleList.get(position).getByline());
        holder.publishedDate.setText(articleList.get(position).getPublishedDate());

    }

    /* Return the size of your dataset (invoked by the layout manager)*/

    @Override
    public int getItemCount() {
        return articleList.size();

    }
}
