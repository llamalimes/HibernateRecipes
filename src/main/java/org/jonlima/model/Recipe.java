package org.jonlima.model;
import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int recipeID;
    String recipeName;
    @ElementCollection
    @CollectionTable(name = "ingredients")
    List<String> ingredients;
    int numIngredients;
    int ingredientCount;

    public Recipe(String recipeName, List<String> ingredients, int numIngredients, int ingredientCount) {
        this.recipeName = recipeName;
        this.ingredients = ingredients;
        this.numIngredients = numIngredients;
        this.ingredientCount = ingredientCount;
    }
    public Recipe() {
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public int getNumIngredients() {
        return numIngredients;
    }

    public void setNumIngredients(int numIngredients) {
        this.numIngredients = numIngredients;
    }

    public int getIngredientCount() {
        return ingredientCount;
    }

    public void setIngredientCount(int ingredientCount) {
        this.ingredientCount = ingredientCount;
    }
}

