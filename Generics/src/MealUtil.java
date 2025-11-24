interface MealPlan { }

class VegetarianMeal implements MealPlan { }
class VeganMeal implements MealPlan { }
class KetoMeal implements MealPlan { }

class Meal<T extends MealPlan> {
    T plan;
    Meal(T p) { plan = p; }
}

class MealUtil {
    public static <T extends MealPlan> void generatePlan(T meal) {
        System.out.println("Generated plan: " + meal.getClass().getSimpleName());
    }
}
