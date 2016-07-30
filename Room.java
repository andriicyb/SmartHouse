import java.util.ArrayList;
import java.util.List;

public class Room {

    String name;
    protected List<RoomItem> items = new ArrayList<>();

    public Room() {
    }

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Room setName(String name) {
        this.name = name;
        return this;
    }

    public Room add(RoomItem item) {
        //check cyclic;
        items.add(item);
        //items.add(new RoomItem(item.getName(), this.name));

        return this;
    }

    @Override
    public String toString() {
        return "Room{" +
                "name='" + name + '\'' +
                ", items: " + items +
                '}';
    }
}