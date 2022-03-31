package business;

public interface EkgController {
    void startrecording();
    void registerObserver(EKGObserver ekgObserver);
}
