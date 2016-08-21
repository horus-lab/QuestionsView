package horus.edu.br.questionsview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import horus.edu.br.library.checkboxes.CheckBoxView;
import horus.edu.br.library.components.ThreeMap;

public class CheckBoxSample extends AppCompatActivity {
    ThreeMap<Integer, String, Boolean> map = new ThreeMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_sample);
        @SuppressLint("WrongViewCast") CheckBoxView viewById =
                (CheckBoxView) findViewById(R.id.checkBoxViewSample);
        viewById.setTitle("Teste Rodrigo:");
        map.put(1, "Teste1", Boolean.FALSE);
        map.put(2, "Teste2", Boolean.FALSE);
        map.put(3, "Teste3", Boolean.FALSE);
        map.put(4, "Teste4", Boolean.FALSE);
        map.put(5, "Teste5", Boolean.FALSE);
        viewById.setQuestions(map);
        viewById.build();
    }
}
