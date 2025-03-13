
public class FoodTask {
    public static List<String> getIngredientsByFoodItem(String foodItem) {
        Map<String, List<String>> foodToIngredients = new HashMap<>();
        foodToIngredients.put("Pizza", Arrays.asList("Cheese", "Tomato Sauce", "Dough"));
        foodToIngredients.put("Pasta", Arrays.asList("Pasta", "Olive Oil", "Garlic"));
        foodToIngredients.put("Salad", Arrays.asList("Lettuce", "Tomato", "Cucumber"));

        return foodToIngredients.getOrDefault(foodItem, Collections.emptyList());
    }

    public static void main(String[] args) {
        List<String> ingredients = getIngredientsByFoodItem("Pizza");
        System.out.println("Ingredients for Pizza: " + ingredients);
    }
}