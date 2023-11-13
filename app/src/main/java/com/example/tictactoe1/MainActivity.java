package com.example.tictactoe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    String cross, zero;
    TextView textView, humanPoints, psPoints;

    ImageView image_back;
    int humanPointsFinish, psPointsFinish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        textView = findViewById(R.id.textView);

        humanPoints = findViewById(R.id.humanPoints);
        psPoints = findViewById(R.id.psPoints);

        image_back = findViewById(R.id.image_back);

        cross = "X";
        zero = "O";
        textView.setText("");
    }

    public void back(View view){
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void clkBtn1(View view) {
        if (button1.getText() == "" && textView.getText() == "") {
            button1.setText(cross);
            isPlayerWinner();
            if(textView.getText() == ""){
                movePs();
            }
        }
    }

    public void clkBtn2(View view) {
        if (button2.getText() == "" && textView.getText() == "") {
            button2.setText(cross);
            isPlayerWinner();
            if(textView.getText() == ""){
                movePs();
            }
        }
    }
    public void clkBtn3(View view) {
        if (button3.getText() == "" && textView.getText() == "") {
            button3.setText(cross);
            isPlayerWinner();
            if(textView.getText() == ""){
                movePs();
            }
        }
    }
    public void clkBtn4(View view) {
        if (button4.getText() == "" && textView.getText() == "") {
            button4.setText(cross);
            isPlayerWinner();
            if(textView.getText() == ""){
                movePs();
            }
        }
    }
    public void clkBtn5(View view) {
        if (button5.getText() == "" && textView.getText() == "") {
            button5.setText(cross);
            isPlayerWinner();
            if(textView.getText() == ""){
                movePs();
            }
        }
    }
    public void clkBtn6(View view) {
        if (button6.getText() == "" && textView.getText() == "") {
            button6.setText(cross);
            isPlayerWinner();
            if(textView.getText() == ""){
                movePs();
            }
        }
    }
    public void clkBtn7(View view) {
        if (button7.getText() == "" && textView.getText() == "") {
            button7.setText(cross);
            isPlayerWinner();
            if(textView.getText() == ""){
                movePs();
            }
        }
    }
    public void clkBtn8(View view) {
        if (button8.getText() == "" && textView.getText() == "") {
            button8.setText(cross);
            isPlayerWinner();
            if(textView.getText() == ""){
                movePs();
            }
        }
    }
    public void clkBtn9(View view) {
        if (button9.getText() == "" && textView.getText() == "") {
            button9.setText(cross);
            isPlayerWinner();
            if(textView.getText() == ""){
                movePs();
            }
        }
    }
    public void isPlayerWinner(){
        if(button1.getText() == cross && button2.getText() == cross && button3.getText() == cross){
            button1.setBackgroundColor(Color.GREEN);
            button2.setBackgroundColor(Color.GREEN);
            button3.setBackgroundColor(Color.GREEN);
            textView.setText("Вы выиграли");
            humanPointsFinish++;
            humanPoints.setText(""+humanPointsFinish);
        } else if (button1.getText() == cross && button5.getText() == cross && button9.getText() == cross){
            button1.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText("Вы выиграли");
            humanPointsFinish++;
            humanPoints.setText(""+humanPointsFinish);
        } else if (button3.getText() == cross && button5.getText() == cross && button7.getText() == cross){
            button3.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText("Вы выиграли");
            humanPointsFinish++;
            humanPoints.setText(""+humanPointsFinish);
        } else if (button4.getText() == cross && button5.getText() == cross && button6.getText() == cross) {
            button4.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            textView.setText("Вы выиграли");
            humanPointsFinish++;
            humanPoints.setText(""+humanPointsFinish);
        } else if (button7.getText() == cross && button8.getText() == cross && button9.getText() == cross) {
            button7.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText("Вы выиграли");
            humanPointsFinish++;
            humanPoints.setText(""+humanPointsFinish);
        } else if(button1.getText() == cross && button4.getText() == cross && button7.getText() == cross){
            button1.setBackgroundColor(Color.GREEN);
            button4.setBackgroundColor(Color.GREEN);
            button7.setBackgroundColor(Color.GREEN);
            textView.setText("Вы выиграли");
            humanPointsFinish++;
            humanPoints.setText(""+humanPointsFinish);
        } else if (button2.getText() == cross && button5.getText() == cross && button8.getText() == cross) {
            button2.setBackgroundColor(Color.GREEN);
            button5.setBackgroundColor(Color.GREEN);
            button8.setBackgroundColor(Color.GREEN);
            textView.setText("Вы выиграли");
            humanPointsFinish++;
            humanPoints.setText(""+humanPointsFinish);
        } else if (button3.getText() == cross && button6.getText() == cross && button9.getText() == cross) {
            button3.setBackgroundColor(Color.GREEN);
            button6.setBackgroundColor(Color.GREEN);
            button9.setBackgroundColor(Color.GREEN);
            textView.setText("Вы выиграли");
            humanPointsFinish++;
            humanPoints.setText(""+humanPointsFinish);
        }else if (button1.getText() != "" && button2.getText() != "" && button3.getText() != "" &&
                button4.getText() != "" && button5.getText() != "" && button6.getText() != "" &&
                button7.getText() != "" && button8.getText() != "" && button9.getText() != ""){
            button1.setBackgroundColor(Color.YELLOW);
            button2.setBackgroundColor(Color.YELLOW);
            button3.setBackgroundColor(Color.YELLOW);
            button4.setBackgroundColor(Color.YELLOW);
            button5.setBackgroundColor(Color.YELLOW);
            button6.setBackgroundColor(Color.YELLOW);
            button7.setBackgroundColor(Color.YELLOW);
            button8.setBackgroundColor(Color.YELLOW);
            button9.setBackgroundColor(Color.YELLOW);
            textView.setText("Ничья");
        }
    }
    public void psWinner(){
        if(button1.getText() == zero && button2.getText() == zero && button3.getText() == zero){
            button1.setBackgroundColor(Color.RED);
            button2.setBackgroundColor(Color.RED);
            button3.setBackgroundColor(Color.RED);
            textView.setText("Вы проиграли");
            psPointsFinish++;
            psPoints.setText(""+psPointsFinish);
        } else if (button1.getText() == zero && button5.getText() == zero && button9.getText() == zero){
            button1.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button9.setBackgroundColor(Color.RED);
            textView.setText("Вы проиграли");
            psPointsFinish++;
            psPoints.setText(""+psPointsFinish);
        } else if (button3.getText() == zero && button5.getText() == zero && button7.getText() == zero){
            button3.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button7.setBackgroundColor(Color.RED);
            textView.setText("Вы проиграли");
            psPointsFinish++;
            psPoints.setText(""+psPointsFinish);
        } else if (button4.getText() == zero && button5.getText() == zero && button6.getText() == zero) {
            button4.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button6.setBackgroundColor(Color.RED);
            textView.setText("Вы проиграли");
            psPointsFinish++;
            psPoints.setText(""+psPointsFinish);
        } else if (button7.getText() == zero && button8.getText() == zero && button9.getText() == zero) {
            button7.setBackgroundColor(Color.RED);
            button8.setBackgroundColor(Color.RED);
            button9.setBackgroundColor(Color.RED);
            textView.setText("Вы проиграли");
            psPointsFinish++;
            psPoints.setText(""+psPointsFinish);
        } else if(button1.getText() == zero && button4.getText() == zero && button7.getText() == zero){
            button1.setBackgroundColor(Color.RED);
            button4.setBackgroundColor(Color.RED);
            button7.setBackgroundColor(Color.RED);
            textView.setText("Вы проиграли");
            psPointsFinish++;
            psPoints.setText(""+psPointsFinish);
        } else if (button2.getText() == zero && button5.getText() == zero && button8.getText() == zero) {
            button2.setBackgroundColor(Color.RED);
            button5.setBackgroundColor(Color.RED);
            button8.setBackgroundColor(Color.RED);
            textView.setText("Вы проиграли");
            psPointsFinish++;
            psPoints.setText(""+psPointsFinish);
        } else if (button3.getText() == zero && button6.getText() == zero && button9.getText() == zero) {
            button3.setBackgroundColor(Color.RED);
            button6.setBackgroundColor(Color.RED);
            button9.setBackgroundColor(Color.RED);
            textView.setText("Вы проиграли");
            psPointsFinish++;
            psPoints.setText(""+psPointsFinish);
        }
    }
    private void movePs() {
        Random random = new Random();
        int buttonPsClick = 1 + random.nextInt(9);
        switch (buttonPsClick) {
            case 1:
                if (button1.getText() == ""){
                    button1.setText(zero);
                    psWinner();
                }else {
                    movePs();
                }
                break;
            case 2:
                if (button2.getText() == ""){
                    button2.setText(zero);
                    psWinner();
                }else {
                    movePs();
                }
                break;
            case 3:
                if (button3.getText() == ""){
                    button3.setText(zero);
                    psWinner();
                }else {
                    movePs();
                }
                break;
            case 4:
                if (button4.getText() == ""){
                    button4.setText(zero);
                    psWinner();
                }else {
                    movePs();
                }
                break;
            case 5:
                if (button5.getText() == ""){
                    button5.setText(zero);
                    psWinner();
                }else {
                    movePs();
                }
                break;
            case 6:
                if (button6.getText() == ""){
                    button6.setText(zero);
                    psWinner();
                }else {
                    movePs();
                }
                break;
            case 7:
                if (button7.getText() == ""){
                    button7.setText(zero);
                    psWinner();
                }else {
                    movePs();
                }
                break;
            case 8:
                if (button8.getText() == ""){
                    button8.setText(zero);
                    psWinner();
                }else {
                    movePs();
                }
                break;
            case 9:
                if (button9.getText() == ""){
                    button9.setText(zero);
                    psWinner();
                }else {
                    movePs();
                }
                break;
        }
    }

    public void start(View view) {
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");

        button1.setBackgroundColor(button1.getContext().getResources().getColor(R.color.violet));
        button2.setBackgroundColor(button1.getContext().getResources().getColor(R.color.violet));
        button3.setBackgroundColor(button1.getContext().getResources().getColor(R.color.violet));
        button4.setBackgroundColor(button1.getContext().getResources().getColor(R.color.violet));
        button5.setBackgroundColor(button1.getContext().getResources().getColor(R.color.violet));
        button6.setBackgroundColor(button1.getContext().getResources().getColor(R.color.violet));
        button7.setBackgroundColor(button1.getContext().getResources().getColor(R.color.violet));
        button8.setBackgroundColor(button1.getContext().getResources().getColor(R.color.violet));
        button9.setBackgroundColor(button1.getContext().getResources().getColor(R.color.violet));

        textView.setText("");
    }
}