public class Burger {

    String bun;

    String meat;

    String cheese;

    String greens;

    String mayonnaise;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        displayIngredients();
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        displayIngredients();
    }

    public Burger(String bun, String cheese, String doubleMeat) {
        this.bun = bun;
        this.meat = doubleMeat;
        this.cheese = cheese;
        displayIngredients();
    }

    private  void displayIngredients() {

        System.out.println("Burger Ingredient");

        System.out.println("Bun = " + (bun != null ? bun : "Not included"));

        System.out.println("Meat = " + (meat != null ? meat : "Not included"));

        System.out.println("Cheese = " + (cheese != null ? cheese : "Not included"));

        System.out.println("Greens = " + (greens != null ? greens : "Not included"));

        System.out.println("Mayonnaise = " + (mayonnaise != null ? mayonnaise : "Not included"));

        System.out.println();

    }

}
