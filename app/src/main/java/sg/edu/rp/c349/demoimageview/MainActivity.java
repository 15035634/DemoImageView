package sg.edu.rp.c349.demoimageview;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView day2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        day2 = (ImageView)findViewById(R.id.imageView2);

        day2.setImageResource(R.drawable.day2);
    }
}
