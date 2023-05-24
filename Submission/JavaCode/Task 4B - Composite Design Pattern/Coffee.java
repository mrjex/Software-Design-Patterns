public abstract class Coffee implements Product {

    int basePrice;

    Coffee(boolean hasSugar, boolean hasMilk, int basePrice) {
        this.basePrice = basePrice;
        if (hasMilk) {
            this.basePrice++;
        }
        if (hasSugar) {
            this.basePrice++;
        }
    }

    @Override
    public int getPrice() {
        return basePrice;
    }

}
