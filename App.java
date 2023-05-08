

public class App {
    public static void main(String[] args) throws Exception {

    Locations boracay = new Boracay();
    Locations bohol = new Bohol();
    Locations cebu = new Cebu();
    Locations palawan = new Palawan();
    Locations sagada = new Sagada();
    Locations vigan = new Vigan();

    Tourist Zaira = new me();

    boracay.accept(Zaira);
    bohol.accept(Zaira);
    cebu.accept(Zaira);
    palawan.accept(Zaira);
    sagada.accept(Zaira);
    vigan.accept(Zaira);
    
    }

    }
