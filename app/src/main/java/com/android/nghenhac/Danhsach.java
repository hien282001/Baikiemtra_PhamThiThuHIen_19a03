package com.android.nghenhac;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Danhsach extends AppCompatActivity implements View.OnClickListener {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    private Button btn5;
    private Button btn6;

    private Button btnChon1;
    private TextView txtChon;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.danhsach);
        btnChon1 =(Button) findViewById(R.id.btnChon);
        btn1 =(Button) findViewById(R.id.btn1);
        btn2 =(Button) findViewById(R.id.btn2);
        btn3 =(Button) findViewById(R.id.btn3);
        btn4 =(Button) findViewById(R.id.btn4);
        btn5 =(Button) findViewById(R.id.btn5);
        btn6 =(Button) findViewById(R.id.btn6);

        txtChon = (TextView) findViewById((R.id.txtChon));

        btnChon1.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Danhsach.this,MainActivity.class);
                int position;
                if(btn1.callOnClick()==true)
                {
                    position=R.raw.bai1;
                    Bundle bundle = new Bundle();
                    bundle.putInt("position",position);
                    bundle.putString("Key_1", "1:Bài 1"); // Truyền một String
                    bundle.putString("Key_2","3m 32sec");
                    intent.putExtras(bundle);
                }
                if(btn2.callOnClick()==true)
                {
                    position=R.raw.cuoi_thoi;

                    Bundle bundle = new Bundle();
                    bundle.putInt("position",position);
                    bundle.putString("Key_1", "2:Cưới Thôi"); // Truyền một String
                    bundle.putString("Key_2","3m 02sec");
                    intent.putExtras(bundle);
                }
                if(btn3.callOnClick()==true)
                {
                    position=R.raw.em_bo_thuoc_chua;

                    Bundle bundle = new Bundle();
                    bundle.putInt("position",position);
                    bundle.putString("Key_1", "3:Em bỏ thuốc chưa"); // Truyền một String
                    bundle.putString("Key_2","3m 50sec");
                    intent.putExtras(bundle);
                }
                if(btn4.callOnClick()==true)
                {

                    position=R.raw.lac_thoi;

                    Bundle bundle = new Bundle();
                    bundle.putInt("position",position);
                    bundle.putString("Key_1", "Lạc thời"); // Truyền một String
                    bundle.putString("Key_2","4m 28sec");

                    intent.putExtras(bundle);
                }
                if(btn5.callOnClick()==true)
                {

                    position=R.raw.em_bo_thuoc_chua;

                    Bundle bundle = new Bundle();
                    bundle.putInt("position",position);
                    bundle.putString("Key_1", "Radio"); // Truyền một String
                    bundle.putString("Key_2","3m 25sec");
                    intent.putExtras(bundle);
                }
                if(btn6.callOnClick()==true)
                {

                    position=R.raw.tu_choi_nhe_nhang_thoi;
                    intent.putExtra("position",position);
                    Bundle bundle = new Bundle();
                    bundle.putString("Key_1", "Từ chối em nhẹ nhàng thôi"); // Truyền một String
                    bundle.putString("Key_2","3m 46sec");
                    intent.putExtras(bundle);
                }
                startActivity(intent);

            }
        }));

    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn1:
                btn1.callOnClick();
                txtChon.setText("1");
                break;
            case R.id.btn2:
                btn2.callOnClick();
                txtChon.setText("2");
                break;
            case R.id.btn3:
                btn3.callOnClick();
                txtChon.setText("3");
                break;
            case R.id.btn4:
                btn4.callOnClick();
                txtChon.setText("4");
                break;
            case R.id.btn5:
                btn5.callOnClick();
                txtChon.setText("5");
                break;
            case R.id.btn6:
                btn6.callOnClick();
                txtChon.setText("6");
                break;

        }
    }
}