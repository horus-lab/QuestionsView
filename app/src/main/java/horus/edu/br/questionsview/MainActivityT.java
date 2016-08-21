package horus.edu.br.questionsview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import horus.edu.br.library.checkboxes.CheckBoxView;
import horus.edu.br.library.components.L;
import horus.edu.br.library.components.ThreeMap;
import horus.edu.br.library.radiochoices.RadioChoiceView;

public class MainActivityT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_t);
    }

    public void checkViewClick(View view) {
        Intent act = new Intent(this, CheckBoxSample.class);
        startActivity(act);
    }

    public void radioViewClick(View view) {
        Intent act = new Intent(this, RadioChoiceSample.class);
        startActivity(act);
    }
}
