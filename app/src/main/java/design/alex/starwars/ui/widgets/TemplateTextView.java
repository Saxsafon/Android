package design.alex.starwars.ui.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import design.alex.starwars.R;


public class TemplateTextView extends TextView {
    private int mTextTemplate;
    public TemplateTextView(Context context) {
        super(context);
    }
    public TemplateTextView(Context context,@Nullable AttributeSet attrs){
        super(context,attrs);
        initAttrs(attrs);
    }
    public TemplateTextView(Context context,@Nullable AttributeSet attrs, int defStyleAttrs){
        super(context,attrs,defStyleAttrs);
        initAttrs(attrs);
    }

    private void initAttrs(AttributeSet attrs) {
        TypedArray attributes = getContext()
                .obtainStyledAttributes(attrs, R.styleable.TemplateTextView);
        mTextTemplate = attributes.getResourceId(R.styleable.TemplateTextView_template,0);
        attributes.recycle();
    }
    public void setTemplatedText(String text) {
        if (mTextTemplate !=0) {
            setText(getContext().getResources().getString(mTextTemplate,text));
        }
    }
}
