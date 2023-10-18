package jpu2016.dogfight.controleur;
import jpu2016.dogfight.model.IDogfightModel;

public class DogfightController implements IOrderPerformer {
    private final int TIME_SLEEP = 30;
    private IDogfightModel dogfightModel;
    public DogfightController(IDogfightModel dogfightModel) {
        this.dogfightModel = dogfightModel;
    }
    public void orderPerform(UserOrder userOrder) {
    }
    public void player() {

    }
    public void setViewSystem(IViewSystem viewSystem) {

    }
    private void launchMissile(int player) {

    }
    private void gameLoop() {

    }
}
