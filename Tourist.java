interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Bohol bohol);
    void visit(Cebu cebu);
    void visit(Palawan palawan);
    void visit(Sagada sagada);
    void visit(Vigan vigan);
    
    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
