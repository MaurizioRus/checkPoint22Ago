/*It is possible to implement constructors, setter, getters or any other additional method where it is considered necessary.
1. Declare a class Product with the following instance variables:
- name: String
- manufacturer: String
- id: long
- quantity: int
2. Implement a method printNameLastLetter that takes an array of Product objects as parameter and prints to the terminal the last character of the name string of each element of the array.
3. Implement a main method where:
- An array of 3 Product objects is allocated.
- The method printNameLastLetter is called, passing the allocated array as
parameter.
- The value of the quantity attribute for each element of the array is printed to
screen, if for that specific element quantity > 5.

 */
public class Product {

    private String name;
    private String manufacturer;

    private long id;

    private int quantity;

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product(String name , String manufacturer , long id , int quantity){
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.quantity = quantity;

    }
}

