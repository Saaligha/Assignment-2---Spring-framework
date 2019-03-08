package Assignment2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author logday
 */
class Invoice {

    protected String partNumber;
    protected String description;
    protected double unitPrice;
    protected int quantity;

    public Invoice(){

        partNumber = "";
        description = "";
        unitPrice = 0.0;
        quantity = 0;
    }

    public Invoice(String num, String desc, double price, int quant){



        partNumber = num;
        description = desc;
        unitPrice = price;
        quantity = quant;

    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double calPaymentAmount(){

        return unitPrice * quantity;
    }



    public double inflation(){
        return this.getUnitPrice() * 0.12D +this.getUnitPrice();
    }




}
