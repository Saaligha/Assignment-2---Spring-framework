package Assignment2;
import java.util.*;
public class Run {


    public static void main (String[] args){

        Invoice h1 = new Invoice("1234", "Hammer", 25.50, 212);
        Invoice h2 = new Invoice("5678", "Axe", 27.75, 156);
        Invoice h3 = new Invoice("9012", "Spray can", 22.00, 189);

        Invoice p1 = new Invoice ("9782", "Dulux", 28.00, 119);
        Invoice p2 = new Invoice ("9635", "Glydden", 19.00, 189);
        Invoice p3 = new Invoice ("6387", "Behr", 26.00, 132);



        HashSet<Invoice> set = new HashSet <Invoice>();

        set.add(h1);
        set.add(h2);
        set.add(h3);
        set.add(p1);
        set.add(p2);
        set.add(p3);

        //  System.out.println(h1.hashCode());
        //  System.out.println(h2.hashCode());
        //  System.out.println(p3.hashCode());

        Iterator<Invoice> invoiceIterator = set.iterator();
        while(invoiceIterator.hasNext()){
            Invoice i = invoiceIterator.next();
            System.out.println("\t Product description: " +i.getDescription()+ "\t\t Part number: " +i.getPartNumber()+ "\t\t Unit price: " + i.getUnitPrice());
        }


        System.out.println("------------------------------------------------------------------------------");

    }



}
