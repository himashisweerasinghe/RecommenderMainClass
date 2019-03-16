import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //INPUT STAGE
    public static void main(String[]args) {
        List<Restaurant> restaurantList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        System.out.println("Do you want to add a restaurant");

        System.out.println("Enter the name assigned to the restaurant");
        restaurant.restaurantName=sc.nextLine();

        System.out.println("Enter the location assigned to the restaurant");
        restaurant.restaurantLocation=sc.nextLine();

        System.out.println("Enter the type assigned to the restaurant");
        restaurant.restaurantType=sc.nextLine();

        System.out.println("ASSIGNING TAGS TO THE RESTAURANT BASED ON ZOMATO REVIEWS...");






    }
}
