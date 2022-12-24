// we define our variables later on when calling the function (Parameters) to see the flexibility with using functions
// also using return type to manipulate our function output and use it for something else.
public class Main {
    public static double calculateTotalMealPrice(double listedmealprice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedmealprice;
        double tax = taxRate * listedmealprice;
        double result = tip + tax + listedmealprice;
        //System.out.println("Your total meal price " + result);
        return result;
    }
    public static void main(String[] args){
        double groupTotalMealCost = calculateTotalMealPrice(100,.2,.08);
        System.out.println("The total price of the meal is " + groupTotalMealCost);

        double individualMealPrice = (groupTotalMealCost/ 5);
        System.out.println("Individually each person in the group of 5 needs to pay " + individualMealPrice);


    }
}
