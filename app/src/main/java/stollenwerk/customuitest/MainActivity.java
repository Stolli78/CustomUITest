package stollenwerk.customuitest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageManager.getInstance().loadImages(getResources());
        setContentView(R.layout.activity_main);
        Button defaultButton = (Button)findViewById(R.id.defaultButton);
        defaultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OneUi.addBottomButtonToLayout((RelativeLayout)findViewById(R.id.layout), R.id.layout);
            }
        });
    }
}
