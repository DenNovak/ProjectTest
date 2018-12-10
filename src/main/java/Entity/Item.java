package Entity;

public class Item {
    private Integer ID;
    private String name;
    private Integer price;
    private Integer type_id;
    private TypeOfItem type;

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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public TypeOfItem getType() {
        return type;
    }

    public void setType(TypeOfItem type) {
        this.type = type;
    }
}
