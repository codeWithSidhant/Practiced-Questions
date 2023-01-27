package VendingMachine;

public class Store {
    ColdDrinks[][] coldDrinks;

    public Store(ColdDrinks[][] coldDrinks) {

        this.coldDrinks = coldDrinks;
    }

    public void setColdDrinks(ColdDrinks coldDrink, int row, int spot) {
        this.coldDrinks[row][spot] = coldDrink;
    }

    public ColdDrinks getColdDrinks(int row, int spot) {
        return coldDrinks[row][spot] = this.coldDrinks[row][spot];
    }

    public void sell(int row, int spot) {
        if (coldDrinks[row][spot].getQuantity() == 0) {
            throw new NullPointerException("Cannot dispense Coldrink of quantity zero");
        }
        coldDrinks[row][spot].setQuantity(coldDrinks[row][spot].getQuantity() - 1);
    }

    public int getLength() {
        return this.coldDrinks.length;
    }

    public int getRowLength() {
        return coldDrinks[0].length;
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < coldDrinks.length; i++) {
            temp += "\n";
            for (int j = 0; j < coldDrinks[i].length; j++) {
                temp += "\t" + coldDrinks[i][j].toString() + " ||";
            }
        }
        return temp;
    }
}