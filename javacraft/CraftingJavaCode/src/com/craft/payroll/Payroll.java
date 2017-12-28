package com.craft.payroll;


public class Payroll {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	Address a1 = new Address("1243", "Seclusion Cove Rd", "Anchorage", "AK", 
                "12345");
        Address a2 = new Address("5200", "Amber Bay Loop", "Anchorage", "AK", 
                "54321");
		Address a3 = new Address("1250", "Main Street", "Brewster", "MA", 
				"02631");
		Address a7 =  null; //new Address("1550", "Sampson blvd", "Austin", "TX", "71121");
		
        Employee E1 = new Employee("William", "Defoe", "808-555-5151",a1, 955123, 001, "Performer",4504500.00 );
        Employee E2 = new Employee("Tony", "Stark", "808-555-5152",a2, 955123, 002, "Businessman",3500000.00 );
        Employee E3 = new Employee("Elon", "Musk", "808-555-5525", a3, 955123, 005, "Contractor", 5000000.00);
        Employee E7 = new Employee("John", "doe", "808-555-5225", a7, 956423, 005, "Contractor", 53300.00);

		E1.printEmployee();
		E2.printEmployee();
		E3.printEmployee();
		E7.printEmployee();
        
        Address a4 = new Address("123", "South Main Street", "Cleveland", "OH", 
                "12345");
        Address a5 = new Address("123", "North Main Street", "Willoughby", "OH", 
                "54321");
        Employee ee1 = new Employee("Peggy", "Fisher", "717-555-1212",a1, 
                955123, 003, "Lecturer",5000.00 );
        ee1.printEmployee();
        ee1.setSalary(5000);
        ee1.setTitle("Manager");
        ee1.printEmployee();
		Employee ee2 = new Employee("Bob", "Fisher", "717-555-1212",a2, 955123, 
                003, "Lecturer",55500.00 );
        ee2.printEmployee();
        ee2.setSalary(5000);
        ee2.setTitle("Manager");
        ee2.printEmployee();
		//compare salaries to see who makes more money  
		  
		if(ee1.compareTo(ee2)==0)
			System.out.println("\nEqual salaries");
		else if(E1.compareTo(ee2)<0)
			System.out.println("\n"+ee2.getName() + " makes more than "+
					E1.getName());
		else			
			System.out.println("\n"+E1.getName() + " makes more than "+
					ee2.getName());
					
		//print out the addresses in sorted order by zip code
		System.out.println("Addresses in sorted order: \n");
		if(a1.compareTo(a2)==0 || a1.compareTo(a2)<0)
		{
			System.out.println(a1);
			System.out.println(a2);
		}
		else
		{
			System.out.println(a2);
			System.out.println(a1);
		}
			
		
    } 
    
}
