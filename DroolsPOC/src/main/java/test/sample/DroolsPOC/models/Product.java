package test.sample.DroolsPOC.models;


public class Product {

    private String type;
    private int discount;
    private String location;
    private String userMessage;


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void setUserMessage(String userMessage){
        this.userMessage = userMessage;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
