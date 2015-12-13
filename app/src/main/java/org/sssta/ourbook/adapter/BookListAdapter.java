package org.sssta.ourbook.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.bumptech.glide.Glide;

import org.sssta.ourbook.R;

import org.sssta.ourbook.databinding.ItemBookBinding;
import org.sssta.ourbook.model.Book;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heaven on 2015/12/6.
 */
public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BindingViewHolder> {
    private Context context;
    private ArrayList<Book> mBookData = new ArrayList<>();
    public BookListAdapter(Context context){
        this.context = context;
    }
    @Override
    public BookListAdapter.BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemBookBinding binding = ItemBookBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        BindingViewHolder holder = new BindingViewHolder(binding.getRoot());
        holder.setBinding(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        Glide.with(context)
                .load(mBookData.get(position).img)
                .centerCrop()
                .crossFade()
                .into(holder.getBinding().bookImage);
        holder.getBinding().setBook(mBookData.get(position));
        holder.getBinding().getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do some thing when card view be clicked

            }
        });
    }

    @Override
    public int getItemCount() {
        return mBookData.size();
    }
    public void updateData(List<Book> data){
        mBookData.clear();
        mBookData.addAll(data);
        notifyDataSetChanged();
    }
    public static class BindingViewHolder extends RecyclerView.ViewHolder{
        private ItemBookBinding mBinding;
        public BindingViewHolder(View itemView)
        {
            super(itemView);
        }

        public ItemBookBinding getBinding() {
            return mBinding;
        }

        public void setBinding(ItemBookBinding mBinding) {
            this.mBinding = mBinding;
        }
    }
}

