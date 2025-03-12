package resources;

public abstract class Resource {
    public int resourceIdentifier;
    public int activationCost;
    public int periodicCost;
    public int numberOfConsequtiveTurns;
    public int numberOfDowntimeTurns;
    public int totalLifeCycle;
    public int numberOfBuildings;

    public String specialEffect;

    // creating a constuctor
    public Resource(int resourceIdentifier, int activationCost, int periodicCost, int numberOfConsequtiveTurns, int numberOfDowntimeTurns, int totalLifeCycle, int numberOfBuildings, String specialEffect){
        this.resourceIdentifier = resourceIdentifier;
        this.activationCost = activationCost;
        this.periodicCost = periodicCost;
        this.numberOfConsequtiveTurns = numberOfConsequtiveTurns;
        this.numberOfDowntimeTurns = numberOfDowntimeTurns;
        this.totalLifeCycle = totalLifeCycle;
        this.numberOfBuildings = numberOfBuildings;
        this.specialEffect = specialEffect;
    }

    
}
