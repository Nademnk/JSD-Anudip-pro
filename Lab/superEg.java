//parent class
class Father {
	//parent class property
	String name = "abcccc";
	final String surname = "zzzzzzz";
	
	//parent class method
	void details (){
		String educ = "ssc";
		double height = 5.7;
		double weight = 65;
	//	surname = "aaaaaaaaaaa";
		System.out.println(educ +" "+ height +" "+ weight);
	}
}
//child class
class Daughter extends Father {
	//overriding parent class property
	String name = "aaaaaaaaa";
	
	void show (){
	System.out.println("child name "+ name +" "+ surname); //print child class property 
	System.out.println("father name " + super.name +" "+ super.surname) ; //print parent class proeprty
	super.details(); //print parent class method
	}
	
	//overriding parent class method
	void details (){
		String educ = "mca";
		double height = 5.4;
		double weight = 65;
	System.out.println(educ +" "+ height +" "+ weight);
	}
}
//main class
class superEg{
	public static void main(String args[]){
		Daughter c = new Daughter(); //child class object 
		c.show(); //invoke child class method
		c.details(); //invoke overriding child class method
	}
}