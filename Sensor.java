import java.util.Random;

public class Sensor extends RoomItem {

    int value = 0;

    public Sensor(String name, String location) {
        super(name, location);
    }

    public int getValue() {
        //return value;
        Random r = new Random();
        return r.nextInt();
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "name=" + super.name.toString() +
                ", location=" + super.location.toString() +
                ", value=" + value +
                "}";
    }
}