package day37_Inheritance.phoneTask;

public class Phone {

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;
// 5 instance variables

    public static boolean hasBattery=true; // if you sure its ture; you dont need static block
// 1 static variable

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
// 1 constructor
    /* // line 11 de acikladim neden bunu kullanmadigimizi
    static{
        hasBattery= true;
    }
*/

    public void call(long phoneNumber){
        System.out.println(brand +" "+model+ " is calling" + phoneNumber);
    }

    public void text( long phoneNumber){
        System.out.println(brand +" "+model+ " is texting" + phoneNumber);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }
    // 3 instance methods
}

/*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */
