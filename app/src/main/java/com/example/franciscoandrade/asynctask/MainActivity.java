package com.example.franciscoandrade.asynctask;

import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    LinearLayout container;
    LinearLayout container2;
    TextView text;
    EditText textEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar= (ProgressBar)findViewById(R.id.progressBar);
        container= (LinearLayout)findViewById(R.id.container);
        container2= (LinearLayout)findViewById(R.id.container2);

        text= (TextView)findViewById(R.id.textView);
        textEdit= (EditText) findViewById(R.id.editText);

        SubCargar subCargar= new SubCargar();
        subCargar.execute();


    }


    private class SubCargar extends AsyncTask<Void, Integer, Void>{


        private int x=0;



        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressBar.setVisibility(View.VISIBLE);
        }

        @Override
        protected Void doInBackground(Void... voids) {

            try {
               // Thread.sleep(6000);

                while(x<200){
                    Thread.sleep(100);
                    publishProgress(x);
                    x++;

                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return null;
        }


        @Override
        protected void onProgressUpdate(Integer... values) {


            int red= generateRandom();
            int green = generateRandom();
            int blue= generateRandom();

            text.setText(String.valueOf(values[0]));

            container.setBackgroundColor(Color.rgb(red, green, blue));



        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            progressBar.setVisibility(View.INVISIBLE);

        }


        private int generateRandom(){
            return new Random().nextInt(256);
        }

    }
}
