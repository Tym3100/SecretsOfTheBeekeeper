package com.aitymkiv.secretsofthebeekeeper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Topic> topics;
    private RecyclerView recyclerView;
    private TopicRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        init();
        adapter = new TopicRecyclerViewAdapter(this, topics);
        recyclerView = findViewById(R.id.recyclerViewTopics);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
    private void init(){
        topics = new ArrayList<>();
        List<Subtopic> subtopics1 = new ArrayList<>();
        subtopics1.add(new Subtopic(getResources().getString(R.string.topic_1_1),
                getResources().getString(R.string.description_topic_1_1), R.drawable.im_1_1));
        subtopics1.add(new Subtopic(getResources().getString(R.string.topic_1_2),
                getResources().getString(R.string.description_topic_1_2), R.drawable.im_1_2));
        subtopics1.add(new Subtopic(getResources().getString(R.string.topic_1_3),
                getResources().getString(R.string.description_topic_1_3), R.drawable.im_1_3));
        Topic topic1 = new Topic(subtopics1, "Пчеловодство - основы");

        List<Subtopic> subtopics2 = new ArrayList<>();
        subtopics2.add(new Subtopic(getResources().getString(R.string.topic_2_1),
                getResources().getString(R.string.description_topic_2_1), R.drawable.im_2_1));
        subtopics2.add(new Subtopic(getResources().getString(R.string.topic_2_2),
                getResources().getString(R.string.description_topic_2_2), R.drawable.im_2_2));
        subtopics2.add(new Subtopic(getResources().getString(R.string.topic_2_3),
                getResources().getString(R.string.description_topic_2_3), R.drawable.im_2_3));
        subtopics2.add(new Subtopic(getResources().getString(R.string.topic_2_4),
                getResources().getString(R.string.description_topic_2_4), R.drawable.im_2_4));
        Topic topic2 = new Topic(subtopics2, "Пасека");

        List<Subtopic> subtopics3 = new ArrayList<>();
        subtopics3.add(new Subtopic(getResources().getString(R.string.topic_3_1),
                getResources().getString(R.string.description_topic_3_1), R.drawable.im_3_1));
        subtopics3.add(new Subtopic(getResources().getString(R.string.topic_3_2),
                getResources().getString(R.string.description_topic_3_2), R.drawable.im_3_2));
        subtopics3.add(new Subtopic(getResources().getString(R.string.topic_3_3),
                getResources().getString(R.string.description_topic_3_3), R.drawable.im_3_3));
        Topic topic3 = new Topic(subtopics3, "Важные моменты");

        List<Subtopic> subtopics4 = new ArrayList<>();
        subtopics4.add(new Subtopic(getResources().getString(R.string.topic_4_1),
                getResources().getString(R.string.description_topic_4_1), R.drawable.im_4_1));
        subtopics4.add(new Subtopic(getResources().getString(R.string.topic_4_2),
                getResources().getString(R.string.description_topic_4_2), R.drawable.im_4_2));
        subtopics4.add(new Subtopic(getResources().getString(R.string.topic_4_3),
                getResources().getString(R.string.description_topic_4_3), R.drawable.im_4_3));
        Topic topic4 = new Topic(subtopics4, "Залог успешного пчеловодства");
        topics.add(topic1);
        topics.add(topic2);
        topics.add(topic3);
        topics.add(topic4);
    }
}