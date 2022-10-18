package com.kunaaal.ArraysStrings;

public class EncodeDecodeTinyURL {
    public static void main(String[] args) {
        String longUrl = "";

    }

//    a xor b = res    => a xor res = b
//    We can use this property of XOR in Encryption-Decryption as well

    public String encode(String longUrl)
    {
        StringBuilder url = new StringBuilder(longUrl);
        for(int i = 0; i < url.length(); i++)
        {
            char ch = (char)(url.charAt(i)^url.length());
            url.replace(i,i+1, Character.toString(ch));
        }
        return url.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        StringBuilder url = new StringBuilder(shortUrl);
        for(int i = 0; i < url.length(); i++)
        {
            char ch = (char)(url.charAt(i)^url.length());
            url.replace(i,i+1, Character.toString(ch));
        }
        return url.toString();
    }
}
