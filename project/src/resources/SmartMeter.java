package resources;

public class SmartMeter extends Resource { 
    public int effectInput;

    public SmartMeter(int resourceIdentifier, int activationCost, int periodicCost, int numberOfConsequtiveTurns, int numberOfDowntimeTurns, int totalLifeCycle, int numberOfBuildings, String specialEffect, int effectInput) {
        super(resourceIdentifier, activationCost, periodicCost, numberOfConsequtiveTurns, numberOfDowntimeTurns, totalLifeCycle, numberOfBuildings, specialEffect);
        this.effectInput = effectInput;
    }
}
