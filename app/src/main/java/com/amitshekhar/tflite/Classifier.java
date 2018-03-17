package com.amitshekhar.tflite;

import android.graphics.Bitmap;

/**
 * Created by amitshekhar on 17/03/18.
 */

public interface Classifier {

    String classifyBitmap(Bitmap bitmap);

    void close();
}
