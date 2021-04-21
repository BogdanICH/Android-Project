package com.example.studentatfmiunibuc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    private List<CourseModel> dataSet;
    public static OnItemClickListener itemClickListener;
    public CourseAdapter(List<CourseModel> data, OnItemClickListener listener)
    {
        itemClickListener = listener;
        dataSet = data;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_course, parent, false);
        return new CourseViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {

        holder.bind(dataSet.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public static class CourseViewHolder extends RecyclerView.ViewHolder {

        private final TextView title;
        private final TextView duration;
        private final ImageView movieImage;
        private final ConstraintLayout container;


        public CourseViewHolder(View view) {
            super(view);

            title = view.findViewById(R.id.title);
            duration = view.findViewById(R.id.tv_duration);
            movieImage = view.findViewById(R.id.iv_picture);
            container = view.findViewById(R.id.container);
        }

        public void bind(final CourseModel item) {
            title.setText(item.getTitle());
            duration.setText(item.getDuration());
            movieImage.setImageDrawable(ContextCompat.getDrawable(movieImage.getContext(), item.getImageId()));

            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    itemClickListener.onItemClick(item);
                }
            });

        }
    }


}
