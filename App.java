/*
* File: App.java
* Author: Kovács Dorina
* Copyright: 2022, Kovács Dorina
* Group: Szoft I/N
* Date: 2021-02-16
* Github: https://github.com/Kdorina/
* Licenc: GNU GPL
*/
import java.util.Scanner;

class App{
	public static void main(String[] args){
		System.out.println("Kovacs Dorina, 2022-02-16, Szoft I N");
		System.out.println("Feladat 0306");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Alap: ");
		double alap = sc.nextInt();
		
		System.out.println("Magassag: ");
		double magassag = sc.nextInt();
		
		double eredmeny = (alap*magassag)/2;
		
		System.out.println("Terulet: " + eredmeny);
		
		
		}
	
	}
