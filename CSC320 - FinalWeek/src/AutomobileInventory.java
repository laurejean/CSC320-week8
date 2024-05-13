import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class AutomobileInventory {

public static void main(String[] args) {
	
		
		Automobile v = new Automobile();
		
		//Add some vehicles with parameterized constructor 
		v.addNewVehicle(new Automobile("Toyota", "Prado", "Black", 2018, 52000));
		v.addNewVehicle(new Automobile("Toyota", "Hilux", "Blue", 2024, 72000));
		v.addNewVehicle(new Automobile("Ford", "Ranger", "Beige", 2022, 8600));
		v.addNewVehicle(new Automobile("Isuzu", "Trooper", "Red", 2015, 9500));
		v.addNewVehicle(new Automobile("Honda", "Accord", "Green", 2014, 91000));
		
		System.out.println(" ");
		
		//Listing the values
		ArrayList<Automobile> vehicles = v.getVehicleList();
		
		for(Automobile auto : vehicles) {
			System.out.println(auto.getMake()+ " " + auto.getModel() + " " + auto.getColor() + " " + auto.getYear() + " " + auto.getMileage());
		}
		
		System.out.println(" ");
		
		//Remove a car with from a specific position
		 v.removeVehicle(2);
		 
		 System.out.println(" ");
		 
		//Add a new vehicle
		 Automobile v3 = new Automobile();
		 
		 v3.setMake("Subaru");
		 v3.setModel("Forester");
		 v3.setColor("Red");
		 v3.setYear(2010);
		 v3.setMileage(41000);
		 
		 v.addNewVehicle(v3);
		 
		 Automobile lastVehicle = vehicles.get(vehicles.size()-1);
		 
		 System.out.println(lastVehicle.getMake()+ " " + lastVehicle.getModel() + " " + lastVehicle.getColor() + " " + lastVehicle.getYear() + " " + lastVehicle.getMileage());
		 
		 System.out.println(" ");
		 
		//Update a vehicle
		Automobile updateVehicle = new Automobile("Izuzu", "DMAX", "Green", 2024, 12000);
		
		v.updateVehicle(2 , updateVehicle);
		
		Automobile updatedVehicle = vehicles.get(vehicles.size()-3);
		 
		System.out.println(updatedVehicle.getMake()+ " " + updatedVehicle.getModel() + " " + updatedVehicle.getColor() + " " + updatedVehicle.getYear() + " " + updatedVehicle.getMileage());
		
		System.out.println(" ");
		
		//Displaying message to get user input
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Do you want print the information to a file?");
		System.out.print("Please enter your answer ('Y' for Yes and 'N' for No): ");
		String userInput = scnr.next();
		
		if(userInput.equalsIgnoreCase("Y")) {
			printToAFile();
			
		}else {
			System.out.print("A file will not be printed");
		}
}
/*
 * Method to print information to a file
 */
public static void printToAFile() {
	String filePath = "C:\\Temp\\Autos.txt";
	
	try {
        PrintWriter writer = new PrintWriter(filePath);
        writer.write("This is the information that will be printed to the file.");
        System.out.println("Information printed to the file successfully.");
    } catch (IOException e) {
    	System.err.println("Sorry we were not able to update your information to the file. The error message is: " + e.getMessage());
    }	
  }

}

