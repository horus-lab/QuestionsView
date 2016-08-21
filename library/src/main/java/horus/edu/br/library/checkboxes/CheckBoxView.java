package horus.edu.br.library.checkboxes;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

import horus.edu.br.library.components.L;
import horus.edu.br.library.components.ThreeMap;

/**
 * Auto
 * Created by Rodrigo on 21/08/2016.
 */
public class CheckBoxView extends LinearLayout {
    ThreeMap<Integer, String, Boolean> questions = new ThreeMap<>();
    private String title;

    public CheckBoxView(Context context) {
        super(context);
        _init_(context, null);
    }

    public CheckBoxView(Context context, AttributeSet attrs) {
        super(context, attrs);
        _init_(context, attrs);
    }

    public CheckBoxView(Context context, AttributeSet attrs, int defStyleAttr) {
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


        for (final ThreeMap<Integer, String, Boolean>.EntrySet q : questions.entrySet()) {
            CheckBox checkBox = new CheckBox(getContext());
            checkBox.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View view) {
                    q.setResponse(((CheckBox) view).isChecked());
                    L.d("Checkbox : " + q.getTitle() + " alterado para " + q.getResponse());
                }
            });
            checkBox.setText(q.getTitle());
            this.addView(checkBox);
        }
    }


    public ThreeMap<Integer, String, Boolean> getQuestions() {
        return questions;
    }

    @SuppressLint("NewApi")
    public CheckBoxView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


}
