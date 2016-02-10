package stollenwerk.customuitest;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Markus on 10.02.2016.
 */
public class ImageManager {

    private static ImageManager imageManager;
    private Map<Integer, Drawable> imageMap = new HashMap<>();

    private ImageManager() {
        //prevent instantiation
    }
    public static ImageManager getInstance() {
        if(imageManager == null) {
            imageManager = new ImageManager();
        }
        return imageManager;
    }

    public void loadImages(Resources res) {
        imageMap.put(R.drawable.flowers, res.getDrawable(R.drawable.flowers));
    }

    public Drawable getImage(int key) {
        return imageMap.get(key);
    }
}
