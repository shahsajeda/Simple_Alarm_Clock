package com.unique.simplealarmclock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class VocabularyActivity extends AppCompatActivity {

    private TextView wordTextView;
    private TextView meaningTextView;
    private TextView exampleTextView;
    private Button exampleButton;
    private Button thankYouButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

        wordTextView = findViewById(R.id.wordTextView);
        meaningTextView = findViewById(R.id.meaningTextView);
        exampleTextView = findViewById(R.id.exampleTextView);
        exampleButton = findViewById(R.id.exampleButton);
        thankYouButton = findViewById(R.id.thankYouButton);

        // Fetch and display a random word and its meaning
        fetchRandomWord();

        // Set up the example button
        exampleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the example when the button is clicked
                exampleTextView.setVisibility(View.VISIBLE);
                exampleButton.setVisibility(View.GONE); // Hide the button after showing the example
            }
        });

        // Set up the thank you button
        thankYouButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(VocabularyActivity.this,"thank you",Toast.LENGTH_SHORT).show();
                finishAffinity();  // Close the activity and terminate the app
            }
        });
    }

    private void fetchRandomWord() {
        // Define arrays of words, meanings, and examples
        String[] words = {"example", "android", "vocabulary", "application", "programming"};
        String[] meanings = {
                "A representative form or pattern.",
                "A software platform for mobile devices.",
                "The set of words used by a language.",
                "A program designed to perform specific tasks.",
                "The process of creating computer programs."
        };
        String[] examples = {
                "This is an example of how to use the word.",
                "Android is widely used in smartphones.",
                "A rich vocabulary enhances communication skills.",
                "This application is user-friendly.",
                "Programming is essential in today's tech world."
        };

        // Create a Random object
        Random random = new Random();
        int index = random.nextInt(words.length); // Get a random index

        // Retrieve the random word, meaning, and example
        String randomWord = words[index];
        String meaning = meanings[index];
        String example = examples[index];

        // Set the text in TextViews
        wordTextView.setText(randomWord);
        meaningTextView.setText(meaning);
        exampleTextView.setText(example);
        exampleTextView.setVisibility(View.GONE); // Initially hide the example TextView
    }

}

