package com.faithfish.service;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Main {
	
	
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("123.207.4.30",7682);
			Player p = new Player();
			int responseStatuCode = p.askCards(socket);
			loop:while (true) {
				switch (responseStatuCode) {
					case 0:{
						break;
					}
					case 1:{

						break;
					}
					case 2:{

						break;
					}
					case 3:{

						break;
					}
					case 4:{

						break;
					}
					case 5:{

						break;
					}
					case 6:{

						break;
					}
					default: break loop;
				}
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
