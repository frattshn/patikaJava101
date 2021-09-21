
public class Match {

	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	
	Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
		this.f1= f1;
		this.f2= f2;
		this.minWeight= minWeight;
		this.maxWeight= maxWeight;
	}
	
	public void run() {
		if(isCheck()) {
			
			System.out.println(this.f1.name+ " Caný : "+this.f1.health);
			System.out.println(this.f2.name+ " Caný : "+ this.f2.health);
			
			while(this.f1.health>0 && this.f2.health>0) {
				System.out.println("######## YENÝ ROUND ########");
				
				this.f2.health= this.f1.hit(this.f2); //f1 vuruyor
				if(isWin()) break;
				System.out.println(this.f2.name+ " Saðlýk : "+ this.f2.health);

				
				this.f1.health= this.f2.hit(this.f1);
				if(isWin()) break;				
				System.out.println(this.f1.name+ " Saðlýk : "+ this.f1.health);
			}
		}else System.out.println("Sporcularýn sikletleri uymuyor.");
	}
	
	public boolean isCheck() { //Siklet uyumu kontrolü
		return(this.f1.weight>=minWeight && this.f1.weight<=maxWeight) &&
				(this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
	}
	
	public boolean isWin() {
		if(this.f1.health==0) {
			System.out.println(this.f2.name+" kazandý!");
			return true;
		}
		
		if(this.f2.health==0) {
			System.out.println(this.f1.name+ " kazandý!");
			return true;
		}
		
		return false;
	}
	
}
