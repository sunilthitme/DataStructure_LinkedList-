package com.bridglabz.linklist;

import java.util.Scanner;

public class LinkList {

	public static void main(String[] args) {
	
		 System.out.println("Welcome to the LinkedList Code !!");
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Press '1' to add the data at the start");
	        switch (scanner.nextInt()) {
	            case 1: {
	                Operations.addDataAtStart();
	            }
	        }

	    }
}
