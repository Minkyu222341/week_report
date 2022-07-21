public class Main {


    public static void main(String[] args) {
        Transport taxi1 = new Taxi((int) Math.round(Math.random()*10000));
        Transport taxi2 = new Taxi((int) Math.round(Math.random()*10000));

        if (taxi1.number!=taxi2.number) {
            taxi1.inPassenger(2,"서울역",2);
            taxi1.status();
            taxi1.changedOil(-80);
            taxi1.makePayment();
            taxi1.inPassenger(5,"강남역",5);
            taxi1.inPassenger(3,"구로디지털단지역",12);
            taxi1.status();
            taxi1.changedOil(-20);
            taxi1.makePayment();
        }
        //
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooo");
        System.out.println("oooooooooooooooooooooooooooooooooooooooooooooooooooooooo");

        Bus bus1 = new Bus((int) Math.round(Math.random() * 10000));
        Bus bus2 = new Bus((int) Math.round(Math.random() * 10000));

        if(bus1.number != bus2.number) {
            bus1.bus_inPassenger(2);
            bus1.status();
            bus1.changedOil(-50);
            bus1.oilStatus();
            bus1.changeStatus(false);
            bus1.changedOil(10);
            bus1.bus_Location();
            bus1.oilStatus();
            bus1.changeStatus(true);
            bus1.bus_inPassenger(45);
            bus1.bus_inPassenger(5);
            bus1.status();
            bus1.changedOil(-55);
            bus1.oilStatus();
            bus1.bus_Location();
        }
    }
}
