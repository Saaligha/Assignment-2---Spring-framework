package Assignment2;

public class Hardware extends Invoice {

    public Hardware(String num, String desc, double price, int quant)
    {super(num,desc,price,quant);}

    public double inflation(){return this.getUnitPrice() * 0.2D + this.getUnitPrice();}




}
