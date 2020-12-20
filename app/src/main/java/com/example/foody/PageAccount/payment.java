package com.example.foody.PageAccount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;


import com.example.foody.R;

import java.util.ArrayList;

public class payment extends AppCompatActivity {

    private ImageButton imageButton;

    ListView lv_payment;
    AdapterAc adapter;
    ArrayList<ListAc> arr_bean_payment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        lv_payment = (ListView) findViewById(R.id.list_payment);

        imageButton = (ImageButton) findViewById(R.id.bt_payment);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        arr_bean_payment = new ArrayList<ListAc>();
        arr_bean_payment.add(new ListAc(R.drawable.pay,"Ví AirPay"));
        arr_bean_payment.add(new ListAc(R.drawable.money,"Tiền mặt"));
        arr_bean_payment.add(new ListAc(R.drawable.credit,"Thẻ tín dụng/ Ghi nợ"));
        arr_bean_payment.add(new ListAc(R.drawable.nowcredits,"Now Credits"));
        arr_bean_payment.add(new ListAc(R.drawable.atm,"ATM/ Internet Banking"));
        adapter = new AdapterAc(arr_bean_payment, this);
        lv_payment.setAdapter(adapter);

    }
    public void openMainActivity(){
        Intent intent = new Intent(payment.this, AccountFragment.class); intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); finish();

    }

}