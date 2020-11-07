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

public class Decoder extends AppCompatActivity {
    EditText etdec;
    TextView dectv;
    ClipboardManager cplboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decoder);
        etdec=findViewById(R.id.etdec);
        dectv=findViewById(R.id.dectv);
        //cplboard=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
    }

    public void decoding(View v){
        String base64Str=etdec.getText().toString();
        byte[] base64Byte = null;
        try {
            base64Byte=base64.decryptBase64(base64Str);
        }catch(Exception e){
            e.printStackTrace();

        }

        String output= new String(base64Byte);
        dectv.setText(output);
        //base64.encryptBase64()
    }
    /*
    public void dec(View view)
    {
        String temp=etdec.getText().toString().trim();
        String rv=decode.dec(temp);
        dectv.setText(rv);
    }
    public void cp1(View view){
        String data=dectv.getText().toString().trim();
        if(data.isEmpty())
        {
            ClipData temp=ClipData.newPlainText("text",data);
            Toast.makeText(this, "Copied1", Toast.LENGTH_SHORT).show();
        }
    }*/
}