package com.aitymkiv.secretsofthebeekeeper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class TopicRecyclerViewAdapter extends RecyclerView.Adapter<TopicRecyclerViewAdapter.ViewHolder> {
    private Context context;
    private List<Topic> topicList;

    public TopicRecyclerViewAdapter(Context context, List<Topic> topicList) {
        this.context = context;
        this.topicList = topicList;
    }

    @NonNull
    @Override
    public TopicRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_topic, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicRecyclerViewAdapter.ViewHolder holder, int position) {
        Topic topic = topicList.get(position);
        holder.textViewTopicName.setText(topic.getName());
        holder.imageViewTopic.setImageResource(topic.getResId());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SubTopicsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("KEY", topic);
                intent.putExtra("KEY", bundle);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return topicList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textViewTopicName;
        private final ImageView imageViewTopic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTopicName = itemView.findViewById(R.id.topicName);
            imageViewTopic = itemView.findViewById(R.id.imageTopic);
        }
    }
}
