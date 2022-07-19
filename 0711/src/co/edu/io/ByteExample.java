package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExample {
	public static void main(String[] args) {
		long start = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.png");
			FileOutputStream fos = new FileOutputStream("c:/Dev/image2.png");
			byte[] buff = new byte[100]; //100 바이트씩 읽겠다. 
			
			while(true) {
				int buf = fis.read(buff);    // 한 바이트씩 읽겠습니다.(반복)
				if(buf == -1) {
					break;
				}
				fos.write(buff);
			}
			fos.flush();
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("처리시간: "+(end - start));
		
	}

	public static void write2() {
		byte[] arr = new byte[] { 10, 20, 30 };
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data2.dat");
			fos.write(arr);
			fos.flush();
			fos.close(); // 리소스 다시 반환.
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");
	}

	public static void write() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");
			byte a = 10, b = 20, c = 30;

			fos.write(a);
			fos.write(b);
			fos.write(c);

			fos.flush();
			fos.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("실행");
	}

	public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data2.dat");
			byte[] arr = new byte[2];
			while (true) {
				int buf = fis.read(arr); // 읽은 만큼 대입 3byte 10,20,30 - >2번 반복
				if (buf == -1) {
					break;
				}
				for (int i = 0; i < buf; i++) {
					System.out.print(arr[i]);
				}
				System.out.println();
			}
			fis.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행.");

	}

	// 바이트 기반의 입력스트림.
	public static void read1() {

		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data1.dat");

			while (true) {
				int buf = fis.read();
				if (buf == -1) {
					break;
				}
				System.out.println(buf);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}
}
