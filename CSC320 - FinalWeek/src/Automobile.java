import java.util.List;
import java.util.ArrayList;

public class Automobile {

	//Declaration of attributes
	private String make;
	private String model;
	private String color;
	private int year;
	private int mileage;
	
	// List of vehicles
	private ArrayList<Automobile> vehicleLst = new ArrayList<Automobile>();
	
	
	//Default Constructor
	public Automobile() {
		this.make = "";
		this.model = "";
		this.color = "";
		this.year = 0;
		this.mileage = 0;
	}	
	//Parameterized constructor
	 public Automobile(String make, String model, String color, int year, int mileage) {
		 this.make = make;
		 this.model = model;
		 this.color = color;
		 this.year = year;
		 this.mileage = mileage;
	 }
	 
	 /*
	  * Getter & Setter methods
	  */
	 public String getMake() {
		 return make;
	 }
	 
	 public void setMake(String make) {
		 this.make = make;
	 }
	 public String getModel() {
		 return model;
	 }
	 
	 public void setModel(String model) {
		 this.model = model;
	 }
	 public String getColor() {
		 return color;
	 }
	 
	 public void setColor(String color) {
		 this.color = color;
	 }
	 public int getYear() {
		 return year;
	 }
	 
	 public void setYear(int year) {
		 this.year = year;
	 }
	 public int getMileage() {
		 return mileage;
	 }
	 
	 public void setMileage(int mileage) {
		 this.mileage = mileage;
	 }
	 
	 /*
	  * Method to add new vehicles
	  */
	 public void addNewVehicle(Automobile auto) {
	 	
	 	try{
	 		this.vehicleLst.add(auto); 
	 		System.out.println("Vehicule added succesfully!");
	 		System.out.println("The new size of the array is: " + vehicleLst.size());
	 	}catch(Exception e){
	 		System.out.println("Sorry we were not able to add your vehicule. The error message is: " + e.getMessage());
	 	} 	
	 }
	 
	 /*
	  * Method to remove a vehicle
	  */
	 public void removeVehicle(int index) {
		
		 try {
			 if(this.vehicleLst.get(index) != null ) {
				 vehicleLst.remove(index); 
				 System.out.println("Vehicule removed succesfully!");
				 System.out.println("The new size of the array is: " + vehicleLst.size());
			 } 
		}catch(Exception e) {
			System.out.print("Sorry we were not able to remove your vehicule. The error message is: " + e.getMessage());
		} 			 
	}
	 /*
	  * BONUS method to remove a vehicle by make
	  */
	 public void removeByMake(String makeToRemove) {
		 for(Automobile auto : vehicleLst) {
			 if(auto.getMake() == makeToRemove) {
				try {
					vehicleLst.remove(auto);
					System.out.print("Vehicule removed succesfully!");
				} catch(Exception e) {
					System.out.print("Sorry we were not able to remove your vehicule. The error message is: " + e.getMessage());
					
				}
			 }	 
		 }
	 }
	 
	 /*
	  * BONUS method to remove a vehicle by model
	  */
	 public void removeByModel(String modelToRemove) {
		 for(int i = 0; i < vehicleLst.size(); i++) {
			try {
				if(vehicleLst.get(i).getModel() == modelToRemove) {
					System.out.print("Vehicule removed succesfully!");
				}
			}  catch(Exception e) {
				System.out.print("Sorry we were not able to remove your vehicule. The error message is: " + e.getMessage());
			 }   
		 } 
	 }
	 
	 /*
	  * Method to update a vehicle
	  */
	 public void updateVehicle(int index, Automobile newValue) {
		 
		 try {
			 if(this.vehicleLst.get(index) != null ) {
				 this.vehicleLst.set(index, newValue); 
				 System.out.println("Vehicule updated succesfully!"); 
				 System.out.println("The new size of the array is: " + vehicleLst.size());
			 }
			 
			 //BONUS POINT: we can add the vehicle in the list if does not exist.
			 else {
				 addNewVehicle(newValue); 
			 }
		 }catch(Exception e) {
			 System.out.print("Sorry we were not able to update your vehicule. The error message is: " + e.getMessage()); 
		 }
	}
	 
	 /*
	  * Method to return a string array
	  */
	 public ArrayList<Automobile> getVehicleList() {
		 return this.vehicleLst; 
	 }

}
