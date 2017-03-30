package com.example.tlsdu.favoritegamer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {
    CheckBox checkSelect;
    TextView textQuest;
    RadioGroup rg;//멤버필드로 선언
    RadioButton radioinjae,radioryu,radiowhoru,radiomiro,radiozunba,radiotobi,radiolunatic;
    Button butok;
    ImageView imggamer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkSelect=((CheckBox)findViewById(R.id.Check_select)); //CheckBox는 View의 자식
        rg=((RadioGroup) findViewById(R.id.rg));
        textQuest=((TextView)findViewById(R.id.text_quest));
        radioinjae=((RadioButton) findViewById(R.id.radio_injae));
        radioryu=((RadioButton) findViewById(R.id.radio_ryu));
        radiowhoru=((RadioButton) findViewById(R.id.radio_whoru));
        radiomiro=((RadioButton) findViewById(R.id.radio_miro));
        radiozunba=((RadioButton) findViewById(R.id.radio_zunba));
        radiotobi=((RadioButton) findViewById(R.id.radio_tobi));
        radiolunatic=((RadioButton) findViewById(R.id.radio_lunatic));
        butok=((Button)findViewById(R.id.but_ok));
        imggamer=((ImageView)findViewById(R.id.imgv_gamer));
        //체크박스에 이벤트 감시자
        checkSelect.setOnCheckedChangeListener(this);//MainActicity를 핸들러로 만드는 방법
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()){
            textQuest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butok.setVisibility(View.VISIBLE);
            imggamer.setVisibility(View.VISIBLE);
        }
        else{
            textQuest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butok.setVisibility(View.INVISIBLE);
            imggamer.setVisibility(View.INVISIBLE);
        }
    }
}
