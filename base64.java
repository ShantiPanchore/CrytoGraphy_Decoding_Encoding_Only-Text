package com.example.cryptograpgy_encrypting_and_decrypting;

import android.util.Base64;

public class base64 {
    public static byte[] decryptBase64(String key) throws Exception{
        return Base64.decode(key,Base64.DEFAULT);
    }

    public static String encryptBase64(byte[] key) throws Exception{
        return Base64.encodeToString(key,Base64.DEFAULT);
    }
}
