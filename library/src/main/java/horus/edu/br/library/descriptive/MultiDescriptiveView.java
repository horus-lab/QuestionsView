package horus.edu.br.library.descriptive;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import horus.edu.br.library.components.ThreeMap;

/**
 * .
 * Created by Rodrigo on 21/08/2016.
 */
public class MultiDescriptiveView extends LinearLayout {
    ThreeMap<Integer, String, Boolean> questions = new ThreeMap<>();
    private String title;

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

    public void setTitle(String title) {
        this.title = title;
    }
    public void setQuestions(ThreeMap<Integer, String, Boolean> questions) {
        this.questions = questions;
    }

    private void _init_(Context context, AttributeSet attrs) {
        this.setOrientation(VERTICAL);
    }

}
