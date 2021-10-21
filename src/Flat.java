public class Flat {
    //Свойства - характеристики квартиры
    private double square;
    private double price;
    private double flour;
    private int rooms;
    private String repair;
    private String heat;


    Flat (double square, double price, int rooms){
        this.square = square;
        this.price = price;
        this.rooms = rooms;
    }

    public String getSquare(){
        return this.square + " метров квадратных";
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getRepair() {
        return repair;
    }

    public void setRepair(String repair) {
        this.repair = repair;
    }

    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }
}