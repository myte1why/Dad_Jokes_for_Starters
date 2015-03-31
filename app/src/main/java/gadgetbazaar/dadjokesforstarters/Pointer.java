package gadgetbazaar.dadjokesforstarters;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;


public class Pointer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pointer);
        final TextView jokeText = (TextView)findViewById(R.id.jokeText);
        final LinearLayout back =(LinearLayout)findViewById(R.id.back);
        View.OnClickListener listener = new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String[] jokeArray = getResources().getStringArray(R.array.jokes);
                String joke;
                Random randomGenerator = new Random();
                int randomNumber = randomGenerator.nextInt(jokeArray.length);
                //joke = randomNumber + "";

                joke = jokeArray[randomNumber];
                jokeText.setText(joke);
            }
        };
        back.setOnClickListener(listener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();

    }

}