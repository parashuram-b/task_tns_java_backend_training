package task_tasks;

public class Bikeservice {
	
	Bikeservice(){
		this("Royal Enfield");
		System.out.println("Service Booking Created");	
		}
	Bikeservice(String bikename){
		
		System.out.println("Bike Selected: " + bikename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bikeservice b = new Bikeservice();

	}

}
