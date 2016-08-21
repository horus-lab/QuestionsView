package horus.edu.br.library.descriptive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import horus.edu.br.library.components.L;
import horus.edu.br.library.components.ThreeMap;

/**
 *
 * Created by Rodrigo on 21/08/2016.
 */

//TODO Implementar view
public class MultiDescriptiveView extends LinearLayout {
    ThreeMap<Integer, String, String> questions = new ThreeMap<>();

    public MultiDescriptiveView(Context context) {
        super(context);
        _init_(context, null);
    }

    public MultiDescriptiveView(Context context, AttributeSet attrs) {
        super(context, attrs);
        _init_(context, attrs);
    }

    public MultiDescriptiveView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        _init_(context, attrs);
    }

    public void setQuestions(ThreeMap<Integer, String, String> questions) {
        this.questions = questions;
    }

    private void _init_(Context context, AttributeSet attrs) {
        this.setOrientation(VERTICAL);
    }


    public void build() {
        this.removeAllViews();
        for (final ThreeMap<Integer, String, String>.EntrySet q : questions.entrySet()) {
            EditText text = new EditText(getContext());
            text.setHint(q.getTitle());
            addView(text);
            LinearLayout.LayoutParams layoutParams = (LayoutParams) text.getLayoutParams();
            text.setOnKeyListener(new OnKeyListener() {
                @Override
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    L.i(((EditText) view).getText().toString());
                    return true;
                }
            });
            layoutParams.setMargins(3, 2, 3, 10);
        }
    }


}
