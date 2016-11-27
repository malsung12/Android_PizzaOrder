package com.example.home.android_pizza1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText5, editText6, editText7;
    CheckBox checkBox2;
    RadioGroup rg;
    ImageView imageView5;
    Button button6;
    TextView textView13, textView14, textView15;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("주문받기");

        editText5 = (EditText) findViewById(R.id.editText5);
        editText6 = (EditText) findViewById(R.id.editText6);
        editText7 = (EditText) findViewById(R.id.editText7);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        rg = (RadioGroup) findViewById(R.id.rg);
        imageView5 = (ImageView) findViewById(R.id.imageView5);
        button6 = (Button) findViewById(R.id.button6);
        textView13 = (TextView) findViewById(R.id.textView13);
        textView14 = (TextView) findViewById(R.id.textView14);
        textView15 = (TextView) findViewById(R.id.textView15);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton14) {
                    imageView5.setVisibility(View.VISIBLE);
                    imageView5.setImageResource(R.drawable.picle);
                }
                else {
                    imageView5.setVisibility(View.VISIBLE);
                    imageView5.setImageResource(R.drawable.hot);
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(editText5.getText().toString());
                int num2 = Integer.parseInt(editText6.getText().toString());
                int num3 = Integer.parseInt(editText7.getText().toString());
                String sub = "피클";
                double sum = num1*16000+num2*11000+num3*4000;

                textView13.setText("주문 개수: "+(num1+num2+num3));
                if(checkBox2.isChecked()) {
                    sum = sum * 0.7*10/10;
                }
                    textView14.setText("주문 금액: "+sum);
                if(rg.getCheckedRadioButtonId() == R.id.radioButton15)
                    sub = "소스";
                textView15.setVisibility(View.VISIBLE);
                textView15.setText(sub+"를 선택하셧습니다.");
            }
        });
    }
}
