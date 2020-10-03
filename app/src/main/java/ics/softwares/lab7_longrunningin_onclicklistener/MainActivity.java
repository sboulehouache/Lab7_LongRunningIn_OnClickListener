package ics.softwares.lab7_longrunningin_onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button start;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     start=(Button)findViewById(R.id.button);
     textView=(TextView)findViewById(R.id.textView);
     start.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             textView.setText("Long Running in OnClickListener");
             for(int i=0;i<100;i++){
                 try {
                     Thread.sleep(100);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         }
     });
    }
}
