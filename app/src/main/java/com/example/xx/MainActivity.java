package com.example.xx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button clear_button, parantez_button, Tparantez_button, divide_button;
    Button numara_1, numara_2, numara_3, multiple_button;
    Button numara_4, numara_5, numara_6, minus_button;
    Button numara_7, numara_8, numara_9, plus_button;
    Button allclear_button, numara_0, dot_button, equal_button;

    TextView result, question;

    boolean plus,minus,divide,multiple;
    float deger1, deger2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        question = (TextView) findViewById(R.id.question);


        clear_button=(Button) findViewById(R.id.clear_button);
        parantez_button=(Button) findViewById(R.id.parantez_button);
        Tparantez_button=(Button) findViewById(R.id.Tparantez_button);
        divide_button=(Button) findViewById(R.id.divide_button);
        numara_1=(Button) findViewById(R.id.numara_1);
        numara_2=(Button) findViewById(R.id.numara_2);
        numara_3=(Button) findViewById(R.id.numara_3);
        multiple_button=(Button) findViewById(R.id.multiple_button);
        numara_4=(Button) findViewById(R.id.numara_4);
        numara_5=(Button) findViewById(R.id.numara_5);
        numara_6=(Button) findViewById(R.id.numara_6);
        minus_button=(Button) findViewById(R.id.minus_button);
        numara_7=(Button) findViewById(R.id.numara_7);
        numara_8=(Button) findViewById(R.id.numara_8);
        numara_9=(Button) findViewById(R.id.numara_9);
        plus_button=(Button) findViewById(R.id.plus_button);
        allclear_button=(Button) findViewById(R.id.allclear_button);
        numara_0=(Button) findViewById(R.id.numara_0);
        dot_button=(Button) findViewById(R.id.dot_button);
        equal_button=(Button) findViewById(R.id.equal_button);

        numara_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"1");
                question.setText(result.getText());
            }
        });
        numara_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"2");
                question.setText(result.getText());
            }
        });
        numara_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"3");
                question.setText(result.getText());
            }
        });
        numara_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"4");
                question.setText(result.getText());
            }
        });
        numara_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"5");
                question.setText(result.getText());
            }
        });
        numara_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"6");
                question.setText(result.getText());
            }
        });
        numara_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"7");
                question.setText(result.getText());
            }
        });
        numara_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"8");
                question.setText(result.getText());
            }
        });
        numara_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"9");
                question.setText(result.getText());
            }
        });
        numara_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"0");
                question.setText(result.getText());
            }
        });
        parantez_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"(");
                question.setText(result.getText());
            }
        });
        Tparantez_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+")");
                question.setText(result.getText());
            }
        });
        dot_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+".");
                question.setText(result.getText());
            }
        });
        allclear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(result.getText()+"");
            }
        });
        plus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (result == null) {
                    result.setText("");
                }
                else {
                    deger1=Float.parseFloat(result.getText()+"");
                    plus=true;
                    result.setText(null);
                }
            }
        });
        minus_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1=Float.parseFloat(result.getText()+"");
                minus=true;
                result.setText(null);
            }
        });
        divide_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1=Float.parseFloat(result.getText()+"");
                divide=true;
                result.setText(null);
            }
        });
        multiple_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deger1=Float.parseFloat(result.getText()+"");
                multiple=true;
                result.setText(null);
            }
        });
        allclear_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               result.setText("");
            }
        });
        equal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               deger2=Float.parseFloat(result.getText()+"");
               if(plus==true){
                   result.setText(deger1+deger2+"");
                   question.setText(deger1+"+"+deger2);
                   plus=false;
               }
               if(minus==true){
                   result.setText(deger1-deger2+"");
                   question.setText(deger1+"-"+deger2);
                   minus=false;
               }
                if(divide==true){
                    result.setText(deger1/deger2+"");
                    question.setText(deger1+"/"+deger2);
                    divide=false;
                }
                if(multiple==true){
                    result.setText(deger1*deger2+"");
                    question.setText(deger1+"*"+deger2);
                    multiple=false;
                }

            }
        });



    }
}