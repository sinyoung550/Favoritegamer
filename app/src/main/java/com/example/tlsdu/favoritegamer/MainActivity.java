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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
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
        checkSelect.setOnCheckedChangeListener(this);//MainActicity를 핸들러로 만드는 방법으로 구현
        butok.setOnClickListener(this);

    }//end onCreate

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

    @Override
    public void onClick(View v) {
        switch (rg.getCheckedRadioButtonId()){//getCheckedRadioButtonId()<<체크된 라디오버튼의 아이디를 반환해주는 메소드
            case R.id.radio_injae:
                imggamer.setImageResource(R.drawable.injae); //제일 간단한 방법
                break;
            case R.id.radio_ryu:
                imggamer.setImageResource(R.drawable.ryu);
                break;
            case R.id.radio_whoru:
                imggamer.setImageResource(R.drawable.whoru);
                break;case R.id.radio_miro:
                imggamer.setImageResource(R.drawable.miro);
                break;case R.id.radio_zunba:
                imggamer.setImageResource(R.drawable.zunba);
                break;
            case R.id.radio_tobi:
                imggamer.setImageResource(R.drawable.tobib);
                break;
            case R.id.radio_lunatic:
                imggamer.setImageResource(R.drawable.lunatic);
                break;
            default:
                Toast.makeText(this,"아무것도 선택되지 않았습니다.",Toast.LENGTH_SHORT).show();
        }
    }
}
