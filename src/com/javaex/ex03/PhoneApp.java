package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {

	public static void main(String[] args)throws IOException {
		
		//파일 읽는다. ->한줄씩 출력 
		Reader fr = new FileReader("/Users/ol.season/Desktop/javaStudy/file/PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> pList = new ArrayList<Person>();
		
		
		String line = "";
		
		while(true) {
			line = br.readLine();
			if(line == null) {
				break;
			}
			String[] pInfo = line.split(","); //자르는
			
			String name = pInfo[0];
			String hp = pInfo[1];
			String company = pInfo[2];
			
			Person person =new Person(name, hp, company);
			
			pList.add(person);
		
		}
		
		for(int i =0; i<pList.size(); i++) {
			System.out.println("이름: " + pList.get(i).getName());
			System.out.println("핸드폰: " + pList.get(i).getHp());
			System.out.println("회사: " + pList.get(i).getCompany());
			System.out.println("");
		}
	
		
		br.close();
		

	}

}
