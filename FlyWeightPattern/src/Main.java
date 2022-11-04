public class Main {
    public static void main(String[] args) throws Exception {
        FlyWeightFactory factory = new FlyWeightFactory();

        FlyWeight flyweight = factory.getFlyWeight("A");
        System.out.println((flyweight));

        flyweight = factory.getFlyWeight("A");
        System.out.println(flyweight);
    }
}
