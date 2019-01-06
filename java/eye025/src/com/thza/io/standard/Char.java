package com.thza.io.standard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;


public class Char {
	
	public static void start() throws IOException {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		
		try {
			while(true) {
				String s = bf.readLine();
				if(":exit".equals(s)) {
					break;
				}else {
					mag(s);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(bf != null) {
				bf.close();
			}
			if(in != null) {
				in.close();
			}
		}
	}
	
	public static void mag(String s) throws IOException {
		Socket ss = new Socket();
		SocketAddress add = new InetSocketAddress("127.0.0.1", 8088);
		
		OutputStream out = null;
		OutputStreamWriter ow = null;
		
		try {
			ss.connect(add);
			out = ss.getOutputStream();
			ow = new OutputStreamWriter(out, "utf-8");
			
			ow.write(s + "\n");
			ow.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			ow.close();
			out.close();
			ss.close();
		}
	}
	
	
	
	
	

	public static void main(String[] args) throws IOException {
		
		
		start();
		
	}
}
