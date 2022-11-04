package concrete;

import abst.GuiFac;
import linux.LinuxGuiFac;
import mac.MacGuiFac;

public class FactoryInstance {
    public static GuiFac getGuiFac(){
        switch(0){
            case 0: return new MacGuiFac();
            case 1: return new LinuxGuiFac();
        }

        return null;

    }
}
