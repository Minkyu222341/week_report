public class Bus extends Transport{

    int number;
    int fuel =100;
    int speed = 100;
    int maxPassenger = 30;
    boolean status = true;
    int passenger = 0;
    int normal_price = 1000;
    int payment;


    @Override
    public void engineStart() {
        super.engineStart();
    }

    @Override
    public void changeSpeed() {
        super.changeSpeed();
        this.speed += 50;
        //
    }

    @Override
    public void changeStatus(boolean status) {
        super.changeStatus(status);
        this.status = status;
    }

    @Override
    public void changedOil(int fuel) {
        super.changedOil(fuel);
        this.fuel += fuel;
    }

    public void bus_Location() {
        if(status==true){
            passenger = 0;
            System.out.println("상태 : 운행중");
        }else {
            System.out.println("상태 : 차고지행");
            System.out.println("주유가 필요합니다");
        }
    }

    public void oilStatus() {
        System.out.println("주유량 : "+fuel);
        if (fuel < 10) {
            status = false;

        }
    }

    @Override
    public void bus_inPassenger(int passenger) {
        if (maxPassenger < passenger) {
            System.out.println("최대 승객 수 초과");
        } else {
            this.passenger = passenger;
        }
    }


    @Override
    public void status() {
        System.out.println("---------------------------------------------------");
        System.out.println("탑승 승객 수 : "+passenger);
        System.out.println("잔여 승객 수 : "+(maxPassenger-passenger));
        System.out.println("요금 확인 : " + (normal_price*passenger));
        System.out.println("---------------------------------------------------");
    }

    public Bus(int number) {
        super(number);
        this.number = number;
    }

    public static void main(String[] args) {
    }
}

