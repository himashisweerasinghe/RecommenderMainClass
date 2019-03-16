public class Restaurant {

    String restaurantName;
    String restaurantLocation;
    String restaurantType;

    public Restaurant(String restaurantName, String restaurantLocation, String restaurantType) {
        this.restaurantName = restaurantName;
        this.restaurantLocation = restaurantLocation;
        this.restaurantType = restaurantType;
    }

    public Restaurant() {
        this.restaurantName = "";
        this.restaurantLocation = "";
        this.restaurantType = "";
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantLocation() {
        return restaurantLocation;
    }

    public void setRestaurantLocation(String restaurantLocation) {
        this.restaurantLocation = restaurantLocation;
    }

    public String getRestaurantType() {
        return restaurantType;
    }

    public void setRestaurantType(String restaurantType) {
        this.restaurantType = restaurantType;
    }
}
