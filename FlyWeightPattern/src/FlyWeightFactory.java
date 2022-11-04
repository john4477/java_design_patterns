import java.util.Map;
import java.util.TreeMap;

public class FlyWeightFactory {
    Map<String, FlyWeight> pool;
    
    public FlyWeightFactory(){
        pool = new TreeMap<>();
    }

    public FlyWeight getFlyWeight(String key){
        FlyWeight flyweight = pool.get(key);
        if(flyweight == null){
            flyweight = new FlyWeight(key);
            pool.put(key, flyweight);
            System.out.println("새로 생성 " + key);
        }
        else{
            System.out.println("재사용 " + key);
        }

        return flyweight;
    }
}
