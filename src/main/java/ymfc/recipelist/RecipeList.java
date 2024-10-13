package ymfc.recipelist;

import ymfc.recipe.Recipe;

import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> recipes;
    private int counter;

    public RecipeList() {
        counter = 0;
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
        counter++;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public Recipe getRecipe(int id) {
        return recipes.get(id);
    }

    public void removeRecipe(int id) {
        assert counter > 0 : "List should not be empty when deleting recipe";
        recipes.remove(id);
        counter--;
    }

    public boolean removeRecipeByName(String name) {
        for (int i = 0; i < recipes.size(); i++) {
            if (recipes.get(i).getName().equalsIgnoreCase(name)) {
                recipes.remove(i);
                counter--;
                return true;
            }
        }
        return false;
    }

    public int getCounter() {
        return counter;
    }

}