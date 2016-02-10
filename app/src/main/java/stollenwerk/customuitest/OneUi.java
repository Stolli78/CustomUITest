package stollenwerk.customuitest;

import android.widget.RelativeLayout;

/**
 * Created by Markus on 10.02.2016.
 */
public class OneUi {

    public static void addBottomButtonToLayout(RelativeLayout layout, int layoutId) {
        MyHippieButton myHippieButton = new MyHippieButton(layout.getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM, 1);
        myHippieButton.setLayoutParams(layoutParams);
        layout.addView(myHippieButton);
    }
}
