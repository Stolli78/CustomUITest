package stollenwerk.customuitest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Markus on 10.02.2016.
 */
public class MyButton extends View {
    private static final String LOG_TAG = MyButton.class.getSimpleName();
    Bitmap bmp;

    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        //bad practice, for evaluation only; use an image store

        //canvas.drawARGB(0, 0, 100, 100);
        Paint myPaint = new Paint();
        myPaint.setColor(Color.rgb(200, 100, 0));
        myPaint.setStrokeWidth(10);
        myPaint.setStyle(Paint.Style.STROKE);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.flowers);
        canvas.drawBitmap(bitmap, 0,0, null);
        Rect imageRect = new Rect(0,0, canvas.getWidth(), canvas.getHeight());
        canvas.drawRect(imageRect, myPaint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int parentWidth = MeasureSpec.getSize(widthMeasureSpec);
        int parentHeight = MeasureSpec.getSize(heightMeasureSpec);
        this.setMeasuredDimension(parentWidth, 200);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Toast.makeText(getContext(), "Awesome!", Toast.LENGTH_SHORT).show();
        return true;
    }
}
