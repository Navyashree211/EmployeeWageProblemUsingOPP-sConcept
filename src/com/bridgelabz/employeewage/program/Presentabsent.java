package com.bridgelabz.employeewage.program;

class Presentabsent {
	final int present = 1;
	int empType;

	Presentabsent() // default constructor
	{
		empType = (int) (Math.random() * 100) % 2;
	
		if (empType == present) {
			System.out.println("employee present");
		} else {
			System.out.println("employee absent");
		}
	}

	public static void main(String args[]) {
	   new Presentabsent();
	}

}
