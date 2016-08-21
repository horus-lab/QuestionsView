package horus.edu.br.library.radiochoices;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import horus.edu.br.library.components.L;
import horus.edu.br.library.components.ThreeMap;

/**
 * RadioChoice view
 * Created by Rodrigo on 21/08/2016.
 */
public class RadioChoiceView extends LinearLayout {
    ThreeMap<Integer, String, Boolean> questions = new ThreeMap<>();
    private Integer selectedIndex = 0;
    private String title;

    public RadioChoiceView(Context context) {
        super(context);
        _init_(context, null);
    }

    public RadioChoiceView(Context context, AttributeSet attrs) {
        super(context, attrs);
        _init_(context, attrs);
    }

    public RadioChoiceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        _init_(context, attrs);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuestions(ThreeMap<Integer, String, Boolean> questions) {
        this.questions = questions;
    }

    private void _init_(Context context, AttributeSet attrs) {
        this.setOrientation(VERTICAL);
    }

    public void build() {
        this.removeAllViews();
        TextView titleView = new TextView(getContext());
        titleView.setText(title);
        addView(titleView);
        LinearLayout.LayoutParams layoutParams = (LayoutParams) titleView.getLayoutParams();
        layoutParams.setMargins(3, 2, 3, 10);
        RadioGroup rg = new RadioGroup(getContext());
        addView(rg);

        for (final ThreeMap<Integer, String, Boolean>.EntrySet q : questions.entrySet()) {
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    selectedIndex = questions.getIndex(q);
                    L.d("Index selecionado: " + selectedIndex);
                }
            });
            radioButton.setText(q.getTitle());
            rg.addView(radioButton);
        }
    }

    public Integer getCheckedIndex() {
        return selectedIndex;
    }


    public ThreeMap<Integer, String, Boolean> getQuestions() {
        return questions;
    }

    @SuppressLint("NewApi")
    public RadioChoiceView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


}
