package com.fuyun.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;

public class DigestUtils {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MessageDigest messageDigest;
		String str = "48264";
		String a = "abc";
		String encdeStr = "";
		byte[] hash;

		messageDigest = MessageDigest.getInstance("md5");
		hash = messageDigest.digest(str.getBytes("UTF-8"));
		encdeStr = Hex.encodeHexString(hash);
		System.out.println(encdeStr);
	}
	
	public static String encode(String string){
		MessageDigest messageDigest;
		byte[] hash;
		String encdeStr = "";
		try {	
			messageDigest = MessageDigest.getInstance("md5");
			hash = messageDigest.digest(string.getBytes("UTF-8"));
			encdeStr = Hex.encodeHexString(hash);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encdeStr;
	}

}
