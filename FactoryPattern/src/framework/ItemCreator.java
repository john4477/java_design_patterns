package framework;

public abstract class ItemCreator {
    public Item create(){
        Item item;
        
        requestItemsInfo();
        item = createItem();
        createItemLog();

        return item;
    }

    //아이템을 생성하기 전에 데이터 베이스에서 아이템 정보를 요청
    abstract protected void requestItemsInfo();
    //아이템을 생성 후 아이템 복제를 방지하기 위해 데이터 베이스에 아이템 생성 로그를 남김
    abstract protected void createItemLog();
    //아이템을 생성하는 알고리즘
    abstract protected Item createItem();
}