package stollenwerk.customuitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageManager.getInstance().loadImages(getResources());
        setContentView(R.layout.activity_main);
    }
}
