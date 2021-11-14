package com.aitymkiv.secretsofthebeekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {
    private TextView textViewName;
    private TextView textViewContent;
    private ImageView imageView;
    private Subtopic subtopic;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("KEY");
        subtopic = (Subtopic) bundle.getSerializable("KEY");

        imageView = findViewById(R.id.imageTopic);
        textViewName = findViewById(R.id.textViewName);
        textViewContent = findViewById(R.id.textViewContent);

        imageView.setImageResource(subtopic.getResId());
        textViewName.setText(subtopic.getName());
        textViewContent.setText(subtopic.getContent());
    }
}