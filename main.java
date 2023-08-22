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
public class main {
    public static void printNameLastLetter(Product[] products){
        for(Product prd : products){
            String name = prd.getName();
            int leng = name.length();
            System.out.println(name.charAt(leng -1));
        }
    }

    public static  void main(String[] args){

        Product[] products = new Product[3];

        Products[0] = new Product("alessio" , "Com1" , 01 , 5);
        Products[1] = new Product("alessia" , "Com2" , 02 , 6);
        Products[2] = new Product("alex" , "Com3" , 03 , 7);

        printNameLastLetter(products);

        for(Product prd : products ){
            if(prd.getQuantity() > 5 ){
                System.out.println("quantity : " + prd.getQuantity());
            }
        }


    }
}
