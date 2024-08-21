package main.java.question.store;

public class OrderItem {

    private String itemName;
    private int itemSet;

    public OrderItem() {
    }

    public OrderItem(String itemName, int itemSet) {
        this.itemName = itemName;
        this.itemSet = itemSet;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemSet() {
        return itemSet;
    }

    public void setItemSet(int itemSet) {
        this.itemSet = itemSet;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "itemName='" + itemName + '\'' +
                ", itemSet=" + itemSet +
                '}';
    }


    public void total(){   //총 가격 메서드

    }
}
