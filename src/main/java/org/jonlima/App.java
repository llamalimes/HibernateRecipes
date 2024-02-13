package org.jonlima;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.jonlima.model.*;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        createUser(session);

        //Generate Recipe for second function
        List<String> ingredients = new ArrayList<String>();
        ingredients.add("Macaroni");
        ingredients.add("Cheese");
        ingredients.add("Milk");
        Recipe r = new Recipe("Mac n Cheese", ingredients, 3,3);

        createUser(session, r);

        createRecipe(session);


    }
    public static void createUser(Session session){

        //Begin Transaction
        Transaction transaction = session.beginTransaction();

        //Create User
        User u = new User("Jon", "Lima","LlamaLimes");

        //Store User in database;
        session.persist(u);

        //Commit transaction
        transaction.commit();
    }
    public static void createUser(Session session, Recipe recipe){

        //Begin transaction
        Transaction transaction = session.beginTransaction();

        //Create Recipe
        Set<Recipe> r = new HashSet<>();
        r.add(recipe);

        //Create User
        User u = new User("Ian", "Dempsey", "Shaper", r);

        //Store User in database
        session.persist(u);

        //Commit transaction
        transaction.commit();
    }
    public static void createRecipe(Session session){

        //Begin transaction
        Transaction transaction = session.beginTransaction();

        //Create Recipe
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Flour");
        ingredients.add("Butter");
        ingredients.add("Sugar");
        ingredients.add("Chocolate Chips");
        Recipe r = new Recipe("Chocolate Chip Cookies", ingredients, 4,4);

        //Store Recipe in database
        session.persist(r);

        //Commit Transaction
        transaction.commit();
    }
}

