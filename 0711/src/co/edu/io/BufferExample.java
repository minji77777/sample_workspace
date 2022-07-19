package co.edu.io;
/*
 * 보조스트림 생성. 바이트 기반 => 문자 기반(InputStreamReader, OutputStreamWriter)
 *               버퍼스트림(성능향상)
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class BufferExample {
	public static void main(String[] args) {
		bufferReaderWriter();
	}
	
	//버퍼스트림
	public static void bufferReaderWriter() {
		try {
			FileInputStream fis = new FileInputStream("c/Dev/image.png");//기본.
			BufferedInputStream bis = new BufferedInputStream(fis);  //보조.  읽기 전용. reader,writer 문자기반 
			
			FileOutputStream fos = new FileOutputStream("c:/Dev/buffer.png");
			BufferedOutputStream bos =  new BufferedOutputStream(fos);
			
			while(true) {
				int bt = bis.read();
				if(bt == -1)
					break;
				
			}
			bos.write(bt);
		
		
		
		bos.flus();
		bos.close();
		bis.close();
		fis.close();
		fos.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		
	
	
	public static void streamToReader() {
		InputStream is = System.in;     //키보드로 입력. 
		InputStreamReader isr = new InputStreamReader(is);
		char[] cbuf = new char[10];
		System.out.println("입력> ");
		try {
			
			int b = isr.read(cbuf);
			for(int i=0; i<b;i++)
				System.out.println((char)cbuf[i]);
			
			System.out.println();
			isr.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

	public static void streamToWriter() {
		// 바이트 스트림 => 문자 스트림. 
		OutputStream os = System.out; // 키보드 입력. 파일로 출력할거면 fileoutputstream
		OutputStreamWriter osw = new OutputStreamWriter(os); // char 기반

		Scanner scn = new Scanner(System.in);
		System.out.println("입력> ");
		String text = scn.nextLine();

		try {
			osw.write(text + "\n"); // 입력값을 모니터에 출력
			osw.write("실행.");
			osw.flush();
			osw.close();

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("실행.");
	}

}
