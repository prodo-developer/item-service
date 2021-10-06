package hello.itemservice.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price; // price가 안들어갈 수도 있음
    private Integer quantity; // int일 경우 0이라도 들어가야 함

    public Item() {

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}