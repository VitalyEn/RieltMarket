public class Flat {
    //Свойства - характеристики квартиры
    private double square;
    private double price;
    private double flour;
    private int rooms;
    private enum remont {no, pred, cosmetic, euro, euroSuper};
    private enum otoplenie {centr, centrCount, gas, electro};

    Flat (double square, double price, int rooms){
        this.square = square;
        this.price = price;
        this.rooms = rooms;
    }
    public String getSquare(){
        return this.square + " метров квадратных";
    }
}