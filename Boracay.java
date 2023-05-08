public class Boracay implements Locations {

    int airFare = 1000;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}