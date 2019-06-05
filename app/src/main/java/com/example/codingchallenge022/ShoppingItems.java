package com.example.codingchallenge022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShoppingItems extends AppCompatActivity {

    public static final String Item1 = "Item1";
    public static final String Item2 = "Item2";
    public static final String Item3 = "Item3";
    public static final String Item4 = "Item4";
    public static final String Item5 = "Item5";

    public static final String Item6 = "Item6";
    public static final String Item7 = "Item7";
    public static final String Item8 = "Item8";
    public static final String Item9 = "Item9";
    public static final String Item10 = "Item10";

    private Button mItem1;
    private Button mItem2;
    private Button mItem3;
    private Button mItem4;
    private Button mItem5;

    private Button mItem6;
    private Button mItem7;
    private Button mItem8;
    private Button mItem9;
    private Button mItem10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_items);

        mItem1 = findViewById(R.id.itembtn1);
        mItem2 = findViewById(R.id.itembtn2);
        mItem3 = findViewById(R.id.itembtn3);
        mItem4 = findViewById(R.id.itembtn4);
        mItem5 = findViewById(R.id.itembtn5);

        mItem6 = findViewById(R.id.itembtn6);
        mItem7 = findViewById(R.id.itembtn7);
        mItem8 = findViewById(R.id.itembtn8);
        mItem9 = findViewById(R.id.itembtn9);
        mItem10 = findViewById(R.id.itembtn10);
    }


    public void returnItem1(View view) {
        Intent returnItem1Intent = new Intent();
        returnItem1Intent.putExtra(Item1, mItem1.getText().toString());
        setResult(RESULT_OK, returnItem1Intent);
        finish();
    }

    public void returnItem2(View view) {
        Intent returnItem2Intent = new Intent();
        returnItem2Intent.putExtra(Item2, mItem2.getText().toString());
        setResult(RESULT_OK, returnItem2Intent);
        finish();
    }

    public void returnItem3(View view) {
        Intent returnItem3Intent = new Intent();
        returnItem3Intent.putExtra(Item3, mItem3.getText().toString());
        setResult(RESULT_OK, returnItem3Intent);
        finish();
    }

    public void returnItem4(View view) {
        Intent returnItem4Intent = new Intent();
        returnItem4Intent.putExtra(Item4, mItem4.getText().toString());
        setResult(RESULT_OK, returnItem4Intent);
        finish();
    }

    public void returnItem5(View view) {
        Intent returnItem5Intent = new Intent();
        returnItem5Intent.putExtra(Item5, mItem5.getText().toString());
        setResult(RESULT_OK, returnItem5Intent);
        finish();
    }

    public void returnItem6(View view) {
        Intent returnItem6Intent = new Intent();
        returnItem6Intent.putExtra(Item6, mItem6.getText().toString());
        setResult(RESULT_OK, returnItem6Intent);
        finish();
    }

    public void returnItem7(View view) {
        Intent returnItem7Intent = new Intent();
        returnItem7Intent.putExtra(Item7, mItem7.getText().toString());
        setResult(RESULT_OK, returnItem7Intent);
        finish();
    }

    public void returnItem8(View view) {
        Intent returnItem8Intent = new Intent();
        returnItem8Intent.putExtra(Item8, mItem8.getText().toString());
        setResult(RESULT_OK, returnItem8Intent);
        finish();
    }

    public void returnItem9(View view) {
        Intent returnItem9Intent = new Intent();
        returnItem9Intent.putExtra(Item9, mItem9.getText().toString());
        setResult(RESULT_OK, returnItem9Intent);
        finish();
    }

    public void returnItem10(View view) {
        Intent returnItem10Intent = new Intent();
        returnItem10Intent.putExtra(Item10, mItem10.getText().toString());
        setResult(RESULT_OK, returnItem10Intent);
        finish();
    }
}
