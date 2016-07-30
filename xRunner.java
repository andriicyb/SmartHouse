import java.util.ArrayList;
import java.util.List;

public class xRunner {
    public static void main(String[] args) {

        //Test single items separately
        Room hall = new Room().setName("hall");
        System.out.println( hall.toString() );

        Sensor temp1 = new Sensor("Temp1","bath");
        System.out.println( temp1.toString() );
        System.out.println( temp1.getValue() );

        Light light1 = new Light("Light1","kitchen").setActivated(true).setBrighness(100);
        //light1.setActivated(true).setBrighness(100);
        System.out.println( light1.toString() );


        //Lets construct the Room with subitems
        Room bedroom = new Room("bedroom")
                .add(new Sensor("bedroomTemp1","bedroom"))
                .add(new Light("bedroomLight1","bedroom"))
                .add(new Light("bedroomLight2","bedroom"));
        System.out.println( bedroom.toString() );
        System.out.println( bedroom.items.get(0));


        //Lets construct the whole house
        List<Room> house = new ArrayList<>();

        house.add(new Room("hall").add(new Light("hallLight1","hall")));

        house.add(new Room("bathroom").add(new Light("bathLight1","bathroom"))
                .add(new Sensor("bathTemperature","bathroom"))
                .add(new Sensor("bathHumidity","bathroom")));

        house.add(new Room("bedroom").add(new Light("bedLight1","bedroom"))
                .add(new Sensor("bedTemperature","bedroom"))
                .add(new Sensor("bedHumidity","bedroom")));

        house.add(new Room("livingroom").add(new Light("livLight1","livingroom"))
                .add(new Sensor("livTemperature","livingroom"))
                .add(new Sensor("livHumidity","livingroom")));

        System.out.println( house );
        System.out.println( house.get(2) );
        System.out.println( house.get(2).getName() );

    }

}