package com.java.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.eclipse.jdt.internal.compiler.batch.Main;

public class MD5 {
	public static String encryption(String source){
		MessageDigest md;
		StringBuffer sb = new StringBuffer();
		try {
			md = MessageDigest.getInstance("md5");
			byte [] res = md.digest(source.getBytes());//加密了
			 sb = new StringBuffer();
			for(byte b:res){
				int num = b & 0xff;
				String str =Integer.toHexString(num);
				if(str.length()==1){
					sb.append("0");
				}
				sb.append(str);
			}
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sb.toString();
	}
}
