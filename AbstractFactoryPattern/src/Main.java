import SamCheonLi.SamFactory;
import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import gt.GtBikeFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        // BikeFactory factory = new SamFactory();
        BikeFactory factory = new GtBikeFactory();
        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();
        
    }
}
