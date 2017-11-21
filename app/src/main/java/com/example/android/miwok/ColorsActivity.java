package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_colors);
    ArrayList<Word> words = new ArrayList<Word>();
    words.add(new Word("red","красный",R.drawable.color_red));
    words.add(new Word("green","зеленый",R.drawable.color_green));
    words.add(new Word("brown","коричневый",R.drawable.color_brown));
    words.add(new Word("gray","серый",R.drawable.color_gray));
    words.add(new Word("black","черный",R.drawable.color_black));
    words.add(new Word("white","белый",R.drawable.color_white));
    words.add(new Word("dusty yellow","пыльный желтый",R.drawable.color_dusty_yellow));
    words.add(new Word("mustard yellow","желтый горчичный",R.drawable.color_mustard_yellow));


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
    WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);

    ListView listView = (ListView) findViewById(R.id.listColors);

    assert listView != null;
    listView.setAdapter(adapter);
  }
}
