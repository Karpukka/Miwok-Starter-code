package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_family);
    ArrayList<Word> words = new ArrayList<Word>();
    words.add(new Word("father","отец",R.drawable.family_father));
    words.add(new Word("mother","мать",R.drawable.family_mother));
    words.add(new Word("son","сын",R.drawable.family_son));
    words.add(new Word("daughter","дочь",R.drawable.family_daughter));
    words.add(new Word("older brother","старший брат",R.drawable.family_older_brother));
    words.add(new Word("younger brother","младший брат",R.drawable.family_younger_brother));
    words.add(new Word("older sister","старшая сестра",R.drawable.family_older_sister));
    words.add(new Word("younger sister","младшая сестра",R.drawable.family_younger_sister));
    words.add(new Word("grandmother","бабушка",R.drawable.family_grandmother));
    words.add(new Word("grandfather","дедушка",R.drawable.family_grandfather));

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
    WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);

    ListView listView = (ListView) findViewById(R.id.listFamily);

    assert listView != null;
    listView.setAdapter(adapter);
  }
}
