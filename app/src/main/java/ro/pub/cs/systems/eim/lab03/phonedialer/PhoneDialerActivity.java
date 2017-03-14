package ro.pub.cs.systems.eim.lab03.phonedialer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class PhoneDialerActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);

        Button mClickButton0 = (Button)findViewById(R.id.button0);
        mClickButton0.setOnClickListener(this);
        Button mClickButton1 = (Button)findViewById(R.id.button1);
        mClickButton1.setOnClickListener(this);
        Button mClickButton2 = (Button)findViewById(R.id.button2);
        mClickButton2.setOnClickListener(this);
        Button mClickButton3 = (Button)findViewById(R.id.button3);
        mClickButton3.setOnClickListener(this);
        Button mClickButton4 = (Button)findViewById(R.id.button4);
        mClickButton4.setOnClickListener(this);
        Button mClickButton5 = (Button)findViewById(R.id.button5);
        mClickButton5.setOnClickListener(this);
        Button mClickButton6 = (Button)findViewById(R.id.button6);
        mClickButton6.setOnClickListener(this);
        Button mClickButton7 = (Button)findViewById(R.id.button7);
        mClickButton7.setOnClickListener(this);
        Button mClickButton8 = (Button)findViewById(R.id.button8);
        mClickButton8.setOnClickListener(this);
        Button mClickButton9 = (Button)findViewById(R.id.button9);
        mClickButton9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText str = (EditText) findViewById(R.id.editText2);
        switch (v.getId()) {
            case  R.id.button0: {
                str.setText(str.getText().append("0"));
                break;
            }

            case R.id.button1: {
                str.setText(str.getText().append("1"));
                break;
            }

            //.... etc
        }
    }
}
