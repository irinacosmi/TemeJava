package com.java.training.d02.Teme.Phone;

public class PhoneMain {

    public static void main(String[] args) {

        Phone samsung = new Phone();
        samsung.setName("Samsung");
        samsung.setModel("Galaxy 11");
        samsung.setStock(50);

        Phone iPhone = new Phone();
        iPhone.setName("iPhone");
        iPhone.setModel("11 PRO");
        iPhone.setStock(30);

        samsung.display();
        iPhone.display();
        Phone.displayNumbers();

        ImmutablePhone huawei = new ImmutablePhone("Huawei" , "20", 20);

        huawei.display();
        ImmutablePhone.displayNumbers();

}
}