package cn.edu.gdmec.android.csdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ipportActivity extends AppCompatActivity implements View.OnClickListener{

    public static String sendip,sendport;
    private EditText et_ip,et_port;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipport);

        Button btn_link = findViewById(R.id.btn_link);
        et_ip = findViewById(R.id.et_ip);
        et_port = findViewById(R.id.et_port);
        btn_link.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btn_link) {
            if (et_ip.length() != 0 & et_port.length() != 0){
                sendip = et_ip.getText().toString().trim();
                sendport = et_port.getText().toString().trim();
                Intent i = new Intent(ipportActivity.this,MainActivity.class);
                startActivity(i);
            }else if (et_ip.length() == 0 && et_port.length() != 0) {
                Toast.makeText(getApplicationContext(), "请输入座位号！", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getApplicationContext(), "请输入人数！", Toast.LENGTH_SHORT).show();
            }
        }
    }

}