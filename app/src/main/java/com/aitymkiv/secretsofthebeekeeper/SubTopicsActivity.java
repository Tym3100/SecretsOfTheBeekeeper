package com.aitymkiv.secretsofthebeekeeper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.List;

public class SubTopicsActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private SubtopicRecyclerViewAdapter adapter;
    private Topic topic;
    private List<Subtopic> subtopicList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_topics);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("KEY");
        topic = (Topic) bundle.getSerializable("KEY");
        recyclerView = findViewById(R.id.recyclerViewSubtopics);
        subtopicList = topic.getSubtopicList();
        adapter = new SubtopicRecyclerViewAdapter(this, subtopicList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
}