package in.co.theceo.an_layout;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        findViewById(R.id.DEFAULT_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.DEFAULT_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.FROM_LEFT_TO_LEFT_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.FROM_LEFT_TO_LEFT_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.FROM_RIGHT_TO_RIGHT_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.FROM_RIGHT_TO_RIGHT_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.ROTATION_IN_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.ROTATION_IN_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.ROTATION_IN_OUT_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.ROTATION_IN_OUT_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.FADE_IN_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.FADE_IN_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.FADE_IN_OUT_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.FADE_IN_OUT_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.ENTER_EXIT_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.ENTER_EXIT_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.ENTER_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.ENTER_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.UP_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.UP_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.UP_DOWN_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.UP_DOWN_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.FROM_TOP_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.FROM_TOP_ANIMATION);
                mDialog.show();
            }
        });
        findViewById(R.id.FROM_TOP_TO_TOP_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.FROM_TOP_TO_TOP_ANIMATION);
                mDialog.show();
            }
        });findViewById(R.id.FROM_TOP_TO_BOTTOM_ANIMATION).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog = Dialog_Createor.Create_Custom_Popup(MainActivity.this, R.layout.temp, Dialog_Createor.FROM_TOP_TO_BOTTOM_ANIMATION);
                mDialog.show();
            }
        });
    }
}