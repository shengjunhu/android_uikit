package com.hsj.sample.transition;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hsj.sample.R;
import com.hsj.widget.transition.TransitionParam;
import com.hsj.widget.transition.TransitionUtils;

/**
 * @Author:hsj
 * @Date:2020-08-28
 * @Class:Transition1Activity
 * @Desc:如图片列表、视频列表
 */
public final class Transition1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_list);
        RecyclerView rv = findViewById(R.id.rv);
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        rv.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(@NonNull Rect outRect,
                                       @NonNull View view,
                                       @NonNull RecyclerView parent,
                                       @NonNull RecyclerView.State state) {
                super.getItemOffsets(outRect, view, parent, state);
                outRect.bottom = 2;
                if (parent.indexOfChild(view) % 2 == 0) {
                    outRect.right = 2;
                } else {
                    outRect.right = 0;
                }
            }
        });
        rv.setAdapter(new VideoListAdapter());
    }

    static class VideoListAdapter extends RecyclerView.Adapter<VideoListAdapter.ViewHolder> {

        @Override
        public int getItemCount() {
            return 10;
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_video_list, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.itemView.setOnClickListener(view -> {
                TransitionParam param = TransitionUtils.getSourceViewParam(view);
                Transition2Activity.intentStart(view.getContext(), param);
            });
        }

        static class ViewHolder extends RecyclerView.ViewHolder {
            public ViewHolder(View itemView) {
                super(itemView);
            }
        }
    }

}
