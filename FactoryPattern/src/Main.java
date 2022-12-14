import concrete.HpCreator;
import concrete.MpCreator;
import framework.Item;
import framework.ItemCreator;

public class Main {
    public static void main(String[] args) throws Exception {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }
}
