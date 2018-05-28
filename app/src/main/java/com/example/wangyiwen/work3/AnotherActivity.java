package com.example.wangyiwen.work3;
/**
 * Created by WangYiWen on 2018/4/18.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);



        Button button=(Button)findViewById(R.id.buttonReturn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=getIntent();
                String str=intent.getStringExtra("String");
                Integer in=intent.getIntExtra("int", 20);
                intent.putExtra("result","String:"+str+" int:"+in);
                setResult(0,intent);
                finish();
            }
        });
        Intent intent = getIntent();
        String str = intent.getStringExtra("String");
        Integer in = intent.getIntExtra("int", 20);
        Toast.makeText(this, str + in, Toast.LENGTH_LONG).show();

    }
 }
