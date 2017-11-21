package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_phrases);
    ArrayList<Word> words = new ArrayList<Word>();
    words.add(new Word("Where are you going?","Куда ты идешь?"));
    words.add(new Word("What is your name?","Как вас зовут?"));
    words.add(new Word("My name is...","Меня зовут..."));
    words.add(new Word("How are you feeling?","Как ты себя чувствуешь?"));
    words.add(new Word("I’m feeling good.","Мне хорошо."));
    words.add(new Word("Are you coming?","Ты идешь?"));
    words.add(new Word("Yes, I’m coming.","Да,я иду."));
    words.add(new Word("I’m coming.","Я иду."));
    words.add(new Word("Let’s go.","Пойдем."));
    words.add(new Word("Come here.","Иди сюда."));

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
    WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);

    ListView listView = (ListView) findViewById(R.id.listPhrases);

    assert listView != null;
    listView.setAdapter(adapter);
  }
}
