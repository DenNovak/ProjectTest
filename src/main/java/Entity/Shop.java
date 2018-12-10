package Entity;

public class Shop  {
    private Integer ID;
    private String name;
    private String shop_location;
    private Integer room_area;

    public Shop() {}

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShop_location() {
        return shop_location;
    }

    public void setShop_location(String shop_location) {
        this.shop_location = shop_location;
    }

    public Integer getRoom_area() {
        return room_area;
    }

    public void setRoom_area(Integer room_area) {
        this.room_area = room_area;
    }
}
