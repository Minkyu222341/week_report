public class Taxi extends Transport{


    int number;
    int fuel =100;
    int speed = 100;
    int maxPassenger = 4;
    boolean status = false;
    int passenger = 0;
    int normal_price = 3000;
    String destination="";
    int distance =0;
    int destinationToDistance =0;
    int payment=0;
    int accruePayment = 0;


    @Override
    public void engineStart() {
        super.engineStart();
    }

    @Override
    public void changeSpeed() {
        super.changeSpeed();
        this.speed += 50;
    }

    @Override
    public void changeStatus(boolean status) {
        super.changeStatus(status);
    }

    @Override
    public void changedOil(int fuel) {
        super.changedOil(fuel);
        this.fuel += fuel;
    }

    @Override
    public void oilStatus(int fuel) {
        super.oilStatus(fuel);
        System.out.println("주유량 : "+fuel);
    }

    @Override
    public void inPassenger(int passenger, String destination, int destinationToDistance) {
        super.inPassenger(passenger, destination, distance);
        if(passenger>maxPassenger){
            System.out.println("***************");
            System.out.println("최대 승객 수 초과");
            System.out.println("***************");
        }else{
            this.destination = destination;
            this.passenger = passenger;
            this.destinationToDistance = destinationToDistance;
            payment = normal_price+destinationToDistance*500;
            status = true;
        }
    }

    @Override
    public void makePayment() {
        oilStatus(fuel);
        accruePayment += payment;
        System.out.println("누적요금: "+accruePayment);
        this.passenger = 0;
        status = false;
        alertOil();
    }

    @Override
    public void alertOil() {
        super.alertOil();
        if(fuel==0){
            System.out.println("***************");
            System.out.println("주유 필요");
            System.out.println("***************");
        }
    }

    @Override
    public void status() {
        System.out.println("---------------------------------------------------");
        System.out.println("탑승 승객 수 : "+passenger);
        System.out.println("잔여 승객 수 : "+(maxPassenger-passenger));
        System.out.println("기본 요금 확인 : " + normal_price);
        System.out.println("목적지 : "+destination);
        System.out.println("목적지까지의 거리 : "+destinationToDistance+"km");
        System.out.println("지불 할 요금 : "+payment);
        if (status==true){
            System.out.println("상태 : 운행중");
        }else{
            System.out.println("상태 :일반");
        }
        System.out.println("---------------------------------------------------");
    }
//
    public Taxi(int number) {
        super(number);
        this.number = number;
    }

    public static void main(String[] args) {

    }
}
