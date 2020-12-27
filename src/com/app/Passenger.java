package com.app;
import java.util.Scanner;
import com.model.passengerclass;
public class Passenger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of passengers");
		int n=sc.nextInt();
		passengerclass passenger[]=new passengerclass[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("passengerclass"+(i+1));
			System.out.println("Enter the ticketid:");
			int ticketid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the name:");
			String name=sc.nextLine();
			System.out.println("Enter the gender:");
			String gender=sc.nextLine();
			System.out.println("Enter the address:");
			String address=sc.nextLine();
			passenger[i] =new passengerclass(ticketid,name,gender,address);
		}
		for(int i=0;i<n;i++) {
			System.out.println(passenger[i].toString());
			
		}

	}

}
