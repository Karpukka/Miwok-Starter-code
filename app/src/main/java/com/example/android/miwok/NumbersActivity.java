package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_numbers);
    // Create an array of words
//            String[] words = new String[10];
//            words[0] = "one";
//            words[1] = "two";
//            words[2] = "three";
//            words[3] = "four";
//            words[4] = "five";
//            words[5] = "six";
//            words[6] = "seven";
//            words[7] = "eight";
//            words[8] = "nine";
//            words[9] = "ten";
//    // Verify the contents of the array by printing out each array element to the logs
//            Log.v("NumbersActivity", "Word at index 0: " + words[0]);
//            Log.v("NumbersActivity", "Word at index 1: " + words[1]);
//            Log.v("NumbersActivity", "Word at index 2: " + words[2]);
//            Log.v("NumbersActivity", "Word at index 3: " + words[3]);
//            Log.v("NumbersActivity", "Word at index 4: " + words[4]);
//            Log.v("NumbersActivity", "Word at index 5: " + words[5]);
//            Log.v("NumbersActivity", "Word at index 6: " + words[6]);
//            Log.v("NumbersActivity", "Word at index 7: " + words[7]);
//            Log.v("NumbersActivity", "Word at index 8: " + words[8]);
//            Log.v("NumbersActivity", "Word at index 9: " + words[9]);
    // Create a list of words
    ArrayList<Word> words = new ArrayList<Word>();
    words.add(new Word("one","один",R.drawable.number_one));
    words.add(new Word("two","два",R.drawable.number_two));
    words.add(new Word("three","три",R.drawable.number_three));
    words.add(new Word("four","четыре",R.drawable.number_four));
    words.add(new Word("five","пять",R.drawable.number_five));
    words.add(new Word("six","шесть",R.drawable.number_six));
    words.add(new Word("seven","семь",R.drawable.number_seven));
    words.add(new Word("eight","восемь",R.drawable.number_eight));
    words.add(new Word("nine","девять",R.drawable.number_nine));
    words.add(new Word("ten","десять",R.drawable.number_ten));

//    int index=0;
//
//    while (index<words.size()){
//      LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
//      TextView wordView = new TextView(this);
//      wordView.setText(words.get(index));
//      assert rootView != null;
//      rootView.addView(wordView);
//      index++;
    //   }
    WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);

    ListView listView = (ListView) findViewById(R.id.listNumbers);

    assert listView != null;
    listView.setAdapter(adapter);
  }
}
