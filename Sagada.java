public class Sagada implements Locations {

    int airFare = 800;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}