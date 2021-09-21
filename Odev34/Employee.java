
public class Employee {
	
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	//Constructor
	Employee(String name, double salary, int workHours, int hireYear){
		this.name= name;
		this.salary= salary;
		this.workHours= workHours;
		this.hireYear= hireYear;
	}
	
	public double tax() {
		double tax=0;
		if(this.salary>1000) { tax= this.salary*3.0/100.0;}
		return tax;
	}
	
	public double bonus() {
		double bonus=0;
		if(this.workHours>40) {bonus= (this.workHours-40)*30;}
		return bonus;
	}
	
	public double raiseSalary() {
		double raiseSalary=0;
		int year= 2021- this.hireYear;
		if(year<10) {raiseSalary= this.salary*5.0/100.0; return raiseSalary;}
		else if(year>9 && year<20) {raiseSalary= this.salary*10.0/100.0; return raiseSalary;}
		else if(year>19) {raiseSalary= this.salary*15.0/100.0; return raiseSalary;}
		else return raiseSalary;
	}
	
	public void toMyString() {
		System.out.println("Adý : "+this.name);
		System.out.println("Maaþý : "+ this.salary);
		System.out.println("Çalýþma Saati : "+ this.workHours);
		System.out.println("Baþlangýç Yýlý : "+ this.hireYear);
		System.out.println("Vergi : "+ this.tax());
		System.out.println("Bonus : "+ this.bonus());
		System.out.println("Maaþ Artýþý : "+ this.raiseSalary());
		System.out.println("Vergi ve Bonuslar ile Birlikte Maaþ : "+ (this.salary+this.bonus()-this.tax()));
		System.out.println("Toplam Maaþ : "+ (this.salary+this.bonus()+this.raiseSalary()-this.tax()));
		
		
		
	}
	
}
