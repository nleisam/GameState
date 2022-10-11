package com.example.gamestate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText = findViewById(R.id.EditText);
                editText.setText("");
                GameState firstInstance = new GameState();
                GameState secondInstance = (GameState) firstInstance.clone();

                firstInstance.Deal();
                editText.setText(editText.getText()+ "\n" + firstInstance.toString());
                firstInstance.testPlay();
                editText.setText(editText.getText()+ "\n" + firstInstance.toString());

                secondInstance.Deal();
                editText.setText(editText.getText()+ "\n" + secondInstance.toString());
                secondInstance.testPlay();
                editText.setText(editText.getText()+ "\n" + secondInstance.toString());

                GameState thirdInstance = new GameState();
                thirdInstance.Deal();
                editText.setText(editText.getText()+ "\n" + thirdInstance.toString());
                thirdInstance.testPlay();
                editText.setText(editText.getText()+ "\n" + thirdInstance.toString());
            }
        });
    }
}