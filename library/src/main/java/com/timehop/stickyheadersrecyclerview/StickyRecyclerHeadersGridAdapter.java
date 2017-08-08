package com.timehop.stickyheadersrecyclerview;

import android.support.v7.widget.RecyclerView;

/**
 * Copyright ©2017 by Teambition
 */
public interface StickyRecyclerHeadersGridAdapter<VH extends RecyclerView.ViewHolder> extends StickyRecyclerHeadersAdapter<VH> {

    int getNumColumns();
}
