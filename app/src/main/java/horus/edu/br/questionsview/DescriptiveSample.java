package horus.edu.br.questionsview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import horus.edu.br.library.checkboxes.CheckBoxView;
import horus.edu.br.library.components.ThreeMap;
import horus.edu.br.library.descriptive.MultiDescriptiveView;

public class DescriptiveSample extends AppCompatActivity {
    ThreeMap<Integer, String, String> map = new ThreeMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descriptive_sample);
        @SuppressLint("WrongViewCast") MultiDescriptiveView viewById =
                (MultiDescriptiveView) findViewById(R.id.descriptiveSample);
        map.put(1, "Teste1", "");
        map.put(2, "Teste2", "");
        map.put(3, "Teste3", "");
        map.put(4, "Teste4", "");
        map.put(5, "Teste5", "");
        viewById.setQuestions(map);
        viewById.build();

    }
}
