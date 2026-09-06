package task_tasks;

public class FoodOrder {

    String customerName;
    String foodItem;
    double price;

    FoodOrder(String customerName, String foodItem, double price) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.price = price;
    }

    void showOrder() {
        System.out.println("Customer: " + customerName);
        System.out.println("Food: " + foodItem);
        System.out.println("Price: " + price);
    }

    void confirmOrder() {
        System.out.println("Order Confirmed!");
    }

    public static void main(String[] args) {

        FoodOrder order = new FoodOrder("Arjun", "Chicken Biryani", 280);

        order.showOrder();
        order.confirmOrder();
    }
}