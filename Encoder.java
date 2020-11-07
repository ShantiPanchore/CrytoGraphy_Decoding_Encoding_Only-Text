package com.example.cryptograpgy_encrypting_and_decrypting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Encoder extends AppCompatActivity {
    EditText etenc;
    TextView enctv;
    ClipboardManager cpb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encoder);
        etenc=findViewById(R.id.encodes);
        enctv=findViewById(R.id.encty);
       // cpb=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
    }

    public void encoding(View v){
        byte[] base64Data=etenc.getText().toString().getBytes();
        String  base64Str="";
        try{
            base64Str=base64.encryptBase64(base64Data);

        }
        catch (Exception e){
            e.printStackTrace();

        }
        enctv.setText(base64Str);
    }
    /*
    public void enc(View view)
    {
        String temp=etenc.getText().toString();
        String rv=encode.enc(temp);
        enctv.setText(rv);
    }

    * public void cp1(View view){
        String data=dectv.getText().toString().trim();
        if(data.isEmpty())
        {
            ClipData temp=ClipData.newPlainText("text",data);
            Toast.makeText(this, "Copied1", Toast.LENGTH_SHORT).show();
        }
    }
    public void cp2(View view)
    {
        String data=enctv.getText().toString().trim();
        if(data.isEmpty()){
            ClipData temp=ClipData.newPlainText("text",data);
            Toast.makeText(this, "Copied text", Toast.LENGTH_SHORT).show();
        }
    }
    */
}