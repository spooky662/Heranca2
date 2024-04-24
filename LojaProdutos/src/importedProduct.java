public class importedProduct extends Product{
    double customFee;

    public importedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }

    public double totalPrice(){
        return price += customFee;
    }

    @Override
    public String priceTag() {
        return name + " $ " + String.format("%.2f", price) +
                " (Custom fee: $ " + String.format("%.2f", customFee) + ")";
    }

}
