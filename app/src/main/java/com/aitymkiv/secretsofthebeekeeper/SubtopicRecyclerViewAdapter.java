package com.aitymkiv.secretsofthebeekeeper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubtopicRecyclerViewAdapter extends RecyclerView.Adapter<SubtopicRecyclerViewAdapter.ViewHolder> {
    private Context context;
    private List<Subtopic> subtopicList;

    public SubtopicRecyclerViewAdapter(Context context, List<Subtopic> subtopicList) {
        this.context = context;
        this.subtopicList = subtopicList;
    }

    @NonNull
    @Override
    public SubtopicRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_topic, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubtopicRecyclerViewAdapter.ViewHolder holder, int position) {
        Subtopic subtopic = subtopicList.get(position);
        holder.imageView.setImageResource(subtopic.getResId());
        holder.textView.setText(subtopic.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ContentActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("KEY", subtopic);
                intent.putExtra("KEY", bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return subtopicList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView textView;
        private final ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.topicName);
            imageView = itemView.findViewById(R.id.imageTopic);
        }
    }
}
