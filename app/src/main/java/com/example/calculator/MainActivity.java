package com.example.calculator;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void additionClick(View view){
        EditText firstInt = (EditText) findViewById(R.id.firstInteger);
        EditText secondInt = (EditText) findViewById(R.id.secondInteger);
        int firstNum = Integer.parseInt(firstInt.getText().toString());
        int secondNum = Integer.parseInt(secondInt.getText().toString());
        int sum = firstNum + secondNum;

        //Toast.makeText(MainActivity.this,String.valueOf(sum),Toast.LENGTH_LONG).show();
        goToResult(String.valueOf(sum));
    }

    public void subtractionClick(View view){
        EditText firstInt = (EditText) findViewById(R.id.firstInteger);
        EditText secondInt = (EditText) findViewById(R.id.secondInteger);
        int firstNum = Integer.parseInt(firstInt.getText().toString());
        int secondNum = Integer.parseInt(secondInt.getText().toString());
        int difference = firstNum - secondNum;

        //Toast.makeText(MainActivity.this,String.valueOf(difference),Toast.LENGTH_LONG).show();
        goToResult(String.valueOf(difference));
    }

    public void multiplicationClick(View view){
        EditText firstInt = (EditText) findViewById(R.id.firstInteger);
        EditText secondInt = (EditText) findViewById(R.id.secondInteger);
        int firstNum = Integer.parseInt(firstInt.getText().toString());
        int secondNum = Integer.parseInt(secondInt.getText().toString());
        int product = firstNum * secondNum;

        //Toast.makeText(MainActivity.this,String.valueOf(product),Toast.LENGTH_LONG).show();
        goToResult(String.valueOf(product));
    }

    public void divisionClick(View view){
        EditText firstInt = (EditText) findViewById(R.id.firstInteger);
        EditText secondInt = (EditText) findViewById(R.id.secondInteger);
        int firstNum = Integer.parseInt(firstInt.getText().toString());
        int secondNum = Integer.parseInt(secondInt.getText().toString());
        int quotient = firstNum / secondNum;

        //Toast.makeText(MainActivity.this,String.valueOf(quotient),Toast.LENGTH_LONG).show();
        goToResult(String.valueOf(quotient));
    }

    public void goToResult(String s){
        Intent intent = new Intent(this,Result.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}