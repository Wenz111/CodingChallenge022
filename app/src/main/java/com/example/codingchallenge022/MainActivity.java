package com.example.codingchallenge022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtitem1;
    private TextView txtitem2;
    private TextView txtitem3;
    private TextView txtitem4;
    private TextView txtitem5;
    private TextView txtitem6;
    private TextView txtitem7;
    private TextView txtitem8;
    private TextView txtitem9;
    private TextView txtitem10;

    private TextView shoppingListFull;

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;

    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtitem1 = findViewById(R.id.txtitem1);
        txtitem2 = findViewById(R.id.txtitem2);
        txtitem3 = findViewById(R.id.txtitem3);
        txtitem4 = findViewById(R.id.txtitem4);
        txtitem5 = findViewById(R.id.txtitem5);
        txtitem6 = findViewById(R.id.txtitem6);
        txtitem7 = findViewById(R.id.txtitem7);
        txtitem8 = findViewById(R.id.txtitem8);
        txtitem9 = findViewById(R.id.txtitem9);
        txtitem10 = findViewById(R.id.txtitem10);

        shoppingListFull = findViewById(R.id.textViewFull);

        btn1 = findViewById(R.id.addbtn1);
        btn2 = findViewById(R.id.addbtn2);
        btn3 = findViewById(R.id.addbtn3);
        btn4 = findViewById(R.id.addbtn4);
        btn5 = findViewById(R.id.addbtn5);

        btn6 = findViewById(R.id.addbtn6);
        btn7 = findViewById(R.id.addbtn7);
        btn8 = findViewById(R.id.addbtn8);
        btn9 = findViewById(R.id.addbtn9);
        btn10 = findViewById(R.id.addbtn10);
    }

    public void addButton1(View view) {
        Intent intent = new Intent(this, ShoppingItems.class);
        startActivityForResult(intent, 1);
    }

    public void addButton2(View view) {
        Intent intent = new Intent(this, ShoppingItems.class);
        startActivityForResult(intent, 2);
    }

    public void addButton3(View view) {
        Intent intent = new Intent(this, ShoppingItems.class);
        startActivityForResult(intent, 3);
    }

    public void addButton4(View view) {
        Intent intent = new Intent(this, ShoppingItems.class);
        startActivityForResult(intent, 4);
    }

    public void addButton5(View view) {
        Intent intent = new Intent(this, ShoppingItems.class);
        startActivityForResult(intent, 5);
    }

    public void addButton6(View view) {
        Intent intent = new Intent(this, ShoppingItems.class);
        startActivityForResult(intent, 6);
    }

    public void addButton7(View view) {
        Intent intent = new Intent(this, ShoppingItems.class);
        startActivityForResult(intent, 7);
    }

    public void addButton8(View view) {
        Intent intent = new Intent(this, ShoppingItems.class);
        startActivityForResult(intent, 8);
    }

    public void addButton9(View view) {
        Intent intent = new Intent(this, ShoppingItems.class);
        startActivityForResult(intent, 9);
    }

    public void addButton10(View view) {
        Intent intent = new Intent(this, ShoppingItems.class);
        startActivityForResult(intent, 10);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
            if(resultCode == RESULT_OK) {

                switch (requestCode){
                    case 1:
                        String item1 = data.getStringExtra(ShoppingItems.Item1);
                        txtitem1.setText(item1);
                        txtitem1.setVisibility(View.VISIBLE);
                        btn1.setVisibility(View.GONE);
                        btn2.setVisibility(View.VISIBLE);
                        break;
                    case 2:
                        String item2 = data.getStringExtra(ShoppingItems.Item2);
                        txtitem2.setText(item2);
                        txtitem2.setVisibility(View.VISIBLE);
                        btn2.setVisibility(View.GONE);
                        btn3.setVisibility(View.VISIBLE);
                        break;
                    case 3:
                        String item3 = data.getStringExtra(ShoppingItems.Item3);
                        txtitem3.setText(item3);
                        txtitem3.setVisibility(View.VISIBLE);
                        btn3.setVisibility(View.GONE);
                        btn4.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        String item4 = data.getStringExtra(ShoppingItems.Item4);
                        txtitem4.setText(item4);
                        txtitem4.setVisibility(View.VISIBLE);
                        btn4.setVisibility(View.GONE);
                        btn5.setVisibility(View.VISIBLE);
                        break;
                    case 5:
                        String item5 = data.getStringExtra(ShoppingItems.Item5);
                        txtitem5.setText(item5);
                        txtitem5.setVisibility(View.VISIBLE);
                        btn5.setVisibility(View.GONE);
                        btn6.setVisibility(View.VISIBLE);
                        break;

                    case 6:
                        String item6 = data.getStringExtra(ShoppingItems.Item6);
                        txtitem6.setText(item6);
                        txtitem6.setVisibility(View.VISIBLE);
                        btn6.setVisibility(View.GONE);
                        btn7.setVisibility(View.VISIBLE);
                        break;
                    case 7:
                        String item7 = data.getStringExtra(ShoppingItems.Item7);
                        txtitem7.setText(item7);
                        txtitem7.setVisibility(View.VISIBLE);
                        btn7.setVisibility(View.GONE);
                        btn8.setVisibility(View.VISIBLE);
                        break;
                    case 8:
                        String item8 = data.getStringExtra(ShoppingItems.Item8);
                        txtitem8.setText(item8);
                        txtitem8.setVisibility(View.VISIBLE);
                        btn8.setVisibility(View.GONE);
                        btn9.setVisibility(View.VISIBLE);
                        break;
                    case 9:
                        String item9 = data.getStringExtra(ShoppingItems.Item9);
                        txtitem9.setText(item9);
                        txtitem9.setVisibility(View.VISIBLE);
                        btn9.setVisibility(View.GONE);
                        btn10.setVisibility(View.VISIBLE);
                        break;
                    default:
                        String item10 = data.getStringExtra(ShoppingItems.Item10);
                        txtitem10.setText(item10);
                        txtitem10.setVisibility(View.VISIBLE);
                        btn10.setVisibility(View.GONE);
                        shoppingListFull.setVisibility(View.VISIBLE);
                        break;
                }

            }
    }
}
