package com.bridglabz.linklist;

import java.util.Scanner;

public class LinkList {

	public static void main(String[] args) {
	
		 System.out.println("Welcome to the LinkedList Code !!");
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Press '1' to add the data at the start \nPress '2' to add the data at the last\\nPress '3' to add the data in between"
	        		+ "");
	        switch (scanner.nextInt()) {
	            case 1: {
	                Operations.addDataAtStart();break;
	            }
	            case 2:
	                Operations.addDataAtEnd();
	                break;
	            case 3:
	                Operations.insertInBetween();
	                break;
	        }

	    }
}
