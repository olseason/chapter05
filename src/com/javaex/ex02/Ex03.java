package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("/Users/ol.season/Desktop/javaStudy/file/MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");         //UTF-8이 아닌 경우에 해당 (해석방법)
		BufferedReader br = new BufferedReader(isr);
		
		
		String line ="";
		
		while(true) {
			line = br.readLine();
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		
		br.close();
		
		

	}

}
