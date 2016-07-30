public class Light extends RoomItem {

    boolean activated = false;
    int brighness = 0;

    public Light(String name, String location) {
        super(name, location);
    }

    public boolean isActivated() {
        return activated;
    }

    public Light setActivated(boolean activated) {
        this.activated = activated;
        return this;
    }

    public int getBrighness() {
        return brighness;
    }

    public Light setBrighness(int brighness) {
        this.brighness = brighness;
        return this;
    }

    @Override
    public String toString() {
        return "Light{" +
                "name=" + super.name.toString() +
                ", location=" + super.location.toString() +
                ", activated=" + activated +
                ", brighness=" + brighness +
                "}";
    }

}
