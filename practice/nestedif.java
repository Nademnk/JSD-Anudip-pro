
class NestedIfEg{
	//default method to perform result
	public void calc_Result(){
		boolean status = true; 
		int marks = 35;
		//outer condition
		if(status == true){
			System.out.println("You are present");
			//inner multi condition
			 if(marks<=99 && marks>80){
				System.out.println("Your grade is O... Outstanding");
			}
			else if(marks<=80 && marks>65){
				System.out.println("Your grade is A .... Very good");
			}
			else if(marks<=65 && marks>55){
				System.out.println("Your grade is B ....  Good");
			}
			else if(marks<=55 && marks>45){
				System.out.println("Your grade is C ....  Average");
			}
			else if(marks<=45 && marks>=35){
				System.out.println("Your grade is D .... Poor");
			}
			//inner else
			else {
				System.out.println("Failed.... You score very less....");
			}
		}
		//outer else
		else{
			System.out.println("You was Absent in assessment");
		}
	}
	//main entrance
	public static void main(String args[]){
		NestedIfEg obj = new NestedIfEg(); //object of class
		obj.calc_Result(); //call method with obj
	}
	
}