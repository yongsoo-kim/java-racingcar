package step3.domain;

public class CarRunResult {

    private final CarName carName;
    private final int runDistance;

    public CarRunResult(CarName carName, int runDistance) {
        this.carName = carName;
        this.runDistance = runDistance;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public String getCarNameString() {
        return carName.value();
    }
}
