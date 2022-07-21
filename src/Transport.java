//### 상위 클래스 = 대중교통

public abstract class Transport {

	int number;

	public Transport(int number) {
		this.number = number;
	}

	public void engineStart(){
	}
	public void changeSpeed(){
	}
	public void changeStatus(boolean status){
	}
	//상태
	public void inPassenger(int passenger,String destination,int destinationToDistance){
	}
	public void bus_inPassenger(int passenger){

	}
	public void status() {
	}
	public void makePayment(){
	}

	public void changedOil(int fuel){

	}
	public void oilStatus(int fuel){
//
	}
	public void alertOil(){}

}
