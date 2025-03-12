package resources;

public class DistributionFacility extends Resource {
    public int effectInput;

    public DistributionFacility(int resourceIdentifier, int activationCost, int periodicCost, int numberOfConsequtiveTurns, int numberOfDowntimeTurns, int totalLifeCycle, int numberOfBuildings, String specialEffect, int effectInput) {
        super(resourceIdentifier, activationCost, periodicCost, numberOfConsequtiveTurns, numberOfDowntimeTurns, totalLifeCycle, numberOfBuildings, specialEffect);
        this.effectInput = effectInput;
    }
}
