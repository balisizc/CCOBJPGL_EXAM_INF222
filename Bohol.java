public class Bohol implements Locations {

    int airFare = 700;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}