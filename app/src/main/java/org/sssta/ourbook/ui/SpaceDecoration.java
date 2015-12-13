package org.sssta.ourbook.ui;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Heaven on 2015/12/12.
 */
public class SpaceDecoration extends RecyclerView.ItemDecoration{
    private int space;
    public SpaceDecoration(int space) {
        super();
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.top = space;
    }
}
