public class me implements Tourist {

    static int budget = 5000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }
    public void visit(Boracay boracay) {
        int airFare = 1000;
        System.out.println("Boracay airFare is: " + airFare);

        if (budget > airFare) {
            System.out.println("Escape to paradise, welcome to Boracay!");
            budget = budget - airFare;
            checkBudget();
            System.out.println(" ");
        } else { 
            System.out.println("Anmount is not enough.");
        }
    }
    public void visit(Bohol bohol) {
        int airFare = 700;
        System.out.println("Bohol airFare is: " + airFare);

        if (budget > airFare) {
        System.out.println("Experience nature's wonders, welcome to Bohol!");
        budget = budget - airFare;
        checkBudget();
        System.out.println(" ");
    } else {
        System.out.println("Anmount is not enough.");
    }
    }
    public void visit(Cebu cebu) {
        int airFare = 1000;
        System.out.println("Cebu airFare is: " + airFare);

        if (budget > airFare) {
        System.out.println("Discover a vibrant blend of culture and adventure, welcome to Cebu!");
        budget = budget - airFare;
        checkBudget();
        System.out.println(" ");
    } else {
        System.out.println("Anmount is not enough.");
    }   
}
    public void visit(Palawan palawan) {
        int airFare = 1000;
        System.out.println("Palawan airFare is: " + airFare);

        if (budget > airFare) {
        System.out.println("Explore paradise on earth, welcome to Palawan!");
        budget = budget - airFare;
        checkBudget();
        System.out.println(" ");
    } else {
        System.out.println("Anmount is not enough.");
    }   
}
    public void visit(Sagada sagada) {
        int airFare = 800;
        System.out.println("Sagada airFare is: " + airFare);

        if (budget > airFare) {
        System.out.println("Step into a world of misty mountains and cultural treasures, welcome to Sagada!");
        budget = budget - airFare;
        checkBudget();
        System.out.println(" ");
    } else {
        System.out.println("Anmount is not enough.");
    }   
}
    public void visit(Vigan vigan) {
        int airFare = 700;
        System.out.println("Vigan airFare is: " + airFare);

        if (budget > airFare) {
        System.out.println("Journey through time and marvel at history, welcome to Vigan!");
        budget = budget - airFare;
        checkBudget();
        System.out.println(" ");
    } else {
        System.out.println("Anmount is not enough.");
    }   
}
    public void checkBudget() {
        System.out.println("My budget is " + budget);
    }
    
    
}
