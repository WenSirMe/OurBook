package org.sssta.ourbook.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import org.sssta.ourbook.R;

import org.sssta.ourbook.databinding.ItemBookBinding;
import org.sssta.ourbook.model.Book;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heaven on 2015/12/6.
 */
public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.BindingViewHolder> {

    private ArrayList<Book> mBookData = new ArrayList<>();
    @Override
    public BookListAdapter.BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemBookBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_book,
                parent,
                false);
        BindingViewHolder holder = new BindingViewHolder(binding.getRoot());
        holder.setBinding(binding);
        return holder;
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {

        holder.getBinding().setBook(mBookData.get(position));
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

