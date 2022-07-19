package co.edu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CharExample {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			char[] cbuf = new char[10];
			int buf = 0;
			
			while((buf=fr.read(cbuf)) != -1) {
				for(int i =0; i<buf;i++) {
					System.out.println(cbuf[i]);         //읽어들인 버퍼의 크기만큼 반ㅂ고
				}
				System.out.println();
				
			}
			fr.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("실행");
	}
	
	
	
	public static void reader1() {
		
		try {
			FileReader fr = new FileReader("c:/Dev/test.txt");
			
			fr.read(); //2바이트씩 읽어들인다.
			while(true) {
				
			int buf = fr.read();   
			if(buf == -1) {
				break;
			}
			System.out.println((char)buf);   //int->char
			}
			fr.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("실행.");
		}
		
		
		
		
	
public static void writer1() {
	Scanner scn = new Scanner(System.in);
	System.out.println("입력> ");
	String txt = "";
	try {
		FileWriter fw = new FileWriter("c:/Dev/test.txt");
		while (true) {
			try {
				txt = scn.nextLine();
			} catch (NoSuchElementException e) {     //ctrl z 누르면 종료. 
				break;
			}
			fw.write(txt + "\n");
		}
		fw.flush();
		fw.close();                                  

	} catch (IOException e) {

		e.printStackTrace();
	}
	System.out.println("실행. ");

}
}
