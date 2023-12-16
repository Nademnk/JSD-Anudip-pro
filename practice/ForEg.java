import java.util.Scanner; //import Scanner package
class ForEg{
	
	void calc_Table(int number){	
		for(int i=1;i<=10;i++){
			System.out.println("Value is :  " + ( number*i ));
		}
	}

	public static void main(String args[]){	
		Scanner sc = new Scanner(System.in);	
		char status;
		ForEg e = new ForEg();
		do{
			System.out.println("Enter number"); 
		int number = sc.nextInt(); 
			e.calc_Table(number);
			System.out.println("Do you want to continue Y/N ");
			status= sc.next().charAt(0);
		}
		while(status=='Y');
		
	}
