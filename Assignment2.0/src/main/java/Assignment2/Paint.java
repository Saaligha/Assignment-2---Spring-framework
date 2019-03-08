package Assignment2;

public class Paint extends Invoice {

    public Paint(String num, String desc, double price, int quant)
    {super(num,desc,price,quant);}

    public double inflation(){
        return this.getUnitPrice() * 0.05D + this.getUnitPrice();
    }

}