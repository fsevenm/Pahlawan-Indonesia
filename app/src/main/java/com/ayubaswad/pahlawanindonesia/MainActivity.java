package com.ayubaswad.pahlawanindonesia;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String userName = "";
    int chances = 3;
    int correctAnswer = 0;
    int lastScore = 0;
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setUserName(View v){
        EditText userNameInput = (EditText) findViewById(R.id.name_et);
        userName = userNameInput.getText().toString();
        if (userName.isEmpty()){
            Toast toast = Toast.makeText(this, "Anda harus memasukkan nama!", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            TextView welcome = (TextView) findViewById(R.id.welcome_tv);
            welcome.setText("Selamat datang, " + getUserName() + "!");

            RelativeLayout infoLayout = (RelativeLayout) findViewById(R.id.info_layout);
            infoLayout.setVisibility(View.VISIBLE);

            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.input_name_layout);
            linearLayout.setVisibility(View.GONE);
        }
    }

    public String getUserName() {
        return userName;
    }

    public int getChances(){
        return chances;
    }

    public void displayUserStatus(){
        TextView userName = (TextView) findViewById(R.id.name_tv);
        userName.setText(getUserName());

        TextView userChances = (TextView) findViewById(R.id.chances_tv);
        userChances.setText("Kesempatan: " + getChances());

        RelativeLayout statusLayout = (RelativeLayout) findViewById(R.id.status_layout);
        statusLayout.setVisibility(View.VISIBLE);
    }

    public void displaySorryLayout(){

        RelativeLayout statusLayout = (RelativeLayout) findViewById(R.id.status_layout);
        statusLayout.setVisibility(View.GONE);

        LinearLayout soal1Layout = (LinearLayout) findViewById(R.id.soal1_layout);
        soal1Layout.setVisibility(View.GONE);

        LinearLayout soal2Layout = (LinearLayout) findViewById(R.id.soal2_layout);
        soal2Layout.setVisibility(View.GONE);

        LinearLayout soal3Layout = (LinearLayout) findViewById(R.id.soal3_layout);
        soal3Layout.setVisibility(View.GONE);

        LinearLayout soal4Layout = (LinearLayout) findViewById(R.id.soal4_layout);
        soal4Layout.setVisibility(View.GONE);

        LinearLayout soal5Layout = (LinearLayout) findViewById(R.id.soal5_layout);
        soal5Layout.setVisibility(View.GONE);

        LinearLayout soal6Layout = (LinearLayout) findViewById(R.id.soal6_layout);
        soal6Layout.setVisibility(View.GONE);

        LinearLayout soal7Layout = (LinearLayout) findViewById(R.id.soal7_layout);
        soal7Layout.setVisibility(View.GONE);

        TextView sorryTv = (TextView) findViewById(R.id.sorry_tv);
        sorryTv.setText("Jangan menyerah, " + userName + "!");

        RelativeLayout sorryLayout = (RelativeLayout) findViewById(R.id.sorry_layout);
        sorryLayout.setVisibility(View.VISIBLE);

    }

    public void displayQuestion1(View v){

        RelativeLayout infoLayout = (RelativeLayout) findViewById(R.id.info_layout);
        infoLayout.setVisibility(View.GONE);

        displayUserStatus();

        LinearLayout soal1Layout = (LinearLayout) findViewById(R.id.soal1_layout);
        soal1Layout.setVisibility(View.VISIBLE);
    }

    public void checkQues1OptTrue(View v){
        correctAnswer++;

        LinearLayout soal1Layout = (LinearLayout) findViewById(R.id.soal1_layout);
        soal1Layout.setVisibility(View.GONE);

        displayUserStatus();

        LinearLayout soal2Layout = (LinearLayout) findViewById(R.id.soal2_layout);
        soal2Layout.setVisibility(View.VISIBLE);
    }

    public void checkQues2OptTrue(View v){
        correctAnswer++;

        LinearLayout soal2Layout = (LinearLayout) findViewById(R.id.soal2_layout);
        soal2Layout.setVisibility(View.GONE);

        LinearLayout soal3Layout = (LinearLayout) findViewById(R.id.soal3_layout);
        soal3Layout.setVisibility(View.VISIBLE);
    }

    public void checkQues3OptTrue(View v){
        correctAnswer++;

        LinearLayout soal3Layout = (LinearLayout) findViewById(R.id.soal3_layout);
        soal3Layout.setVisibility(View.GONE);

        LinearLayout soal4Layout = (LinearLayout) findViewById(R.id.soal4_layout);
        soal4Layout.setVisibility(View.VISIBLE);
    }

    public void checkQues4OptTrue(View v){
        correctAnswer++;

        LinearLayout soal4Layout = (LinearLayout) findViewById(R.id.soal4_layout);
        soal4Layout.setVisibility(View.GONE);

        LinearLayout soal5Layout = (LinearLayout) findViewById(R.id.soal5_layout);
        soal5Layout.setVisibility(View.VISIBLE);
    }

    public void checkQues5OptTrue(View v){
        correctAnswer++;

        LinearLayout soal5Layout = (LinearLayout) findViewById(R.id.soal5_layout);
        soal5Layout.setVisibility(View.GONE);

        LinearLayout soal6Layout = (LinearLayout) findViewById(R.id.soal6_layout);
        soal6Layout.setVisibility(View.VISIBLE);
    }

    public void checkQues6OptTrue(View v){
        correctAnswer++;

        LinearLayout soal6Layout = (LinearLayout) findViewById(R.id.soal6_layout);
        soal6Layout.setVisibility(View.GONE);

        LinearLayout soal7Layout = (LinearLayout) findViewById(R.id.soal7_layout);
        soal7Layout.setVisibility(View.VISIBLE);
    }

    public void checkQues7OptTrue(View v){

        correctAnswer++;

        lastScore = (correctAnswer*100)/7;

        if (lastScore <= 70) {
            result = "Cukup";
        } else if ((lastScore > 70) && (lastScore <= 85)) {
            result = "Baik";
        } else if (lastScore > 85) {
            result = "Sangat Baik";
        }

        RelativeLayout statusLayout = (RelativeLayout) findViewById(R.id.status_layout);
        statusLayout.setVisibility(View.GONE);

        LinearLayout soal7Layout = (LinearLayout) findViewById(R.id.soal7_layout);
        soal7Layout.setVisibility(View.GONE);

        RelativeLayout summaryLayout = (RelativeLayout) findViewById(R.id.summary_layout);
        summaryLayout.setVisibility(View.VISIBLE);

        TextView congratsTv = (TextView) findViewById(R.id.congrats_tv);
        congratsTv.setText("Selamat, " + getUserName() + "!");

        TextView scoreTv = (TextView) findViewById(R.id.score_tv);
        scoreTv.setText("" + lastScore);

        TextView resultTv = (TextView) findViewById(R.id.result_tv);
        resultTv.setText("" + result);

    }

    public void contactDeveloper(View v){
        openWebPage("https://plus.google.com/113326917047122145913");
    }

    public void checkQuesOptWrong(View v){
        if (chances > 2) {

            Toast toast = Toast.makeText(this, "Maaf, jawaban Anda salah", Toast.LENGTH_SHORT);
            toast.show();

            chances--;

            correctAnswer--;

            displayUserStatus();

        } else if (chances == 2){

            Toast toast = Toast.makeText(this, "Maaf, jawaban Anda salah. Ini adalah kesempatan terakhir Anda", Toast.LENGTH_SHORT);
            toast.show();

            chances--;

            correctAnswer--;

            displayUserStatus();

        } else {

            displaySorryLayout();

        }

    }


    /**
     * Open a web page of a specified URL
     *
     * @param url URL to open
     */
    public void openWebPage(String url) {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);
    }

    
}
