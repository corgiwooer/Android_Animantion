package com.fidu.androidp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld;
    private TextView txtHeyWorld;
    private TextView txtAndroid;
    private Button btnUIComponent;
    private boolean firstTime=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHelloWorld=findViewById(R.id.txtHelloWorld);
        txtHeyWorld=findViewById(R.id.txtHeyWorld);
        txtAndroid=findViewById(R.id.txtAndroid);

        txtHeyWorld.setX(2000);
        txtHelloWorld.setX(3000);
        txtAndroid.setY(2000);

        Button btnUIComponent=findViewById(R.id.btnBringUIComponent);

           txtHelloWorld.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {

                       if (firstTime){
                           txtHelloWorld.animate().alpha(0.0f).setDuration(3000);
                           txtHeyWorld.animate().alpha(1).setDuration(3000);
                           firstTime=false;
                       }
                       else {
                           txtHeyWorld.animate().alpha(0).setDuration(3000);
                           txtHelloWorld.animate().alpha(1.0f).setDuration(3000);
                           firstTime=true;
                       }
               }
           });

           btnUIComponent.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   txtHeyWorld.animate().translationX(-2000).setDuration(2000);
                   txtHelloWorld.animate().translationX(-3000).setDuration(3000);
                   txtAndroid.animate().rotation(2000).setDuration(1000);
               }
           });

    }
}
