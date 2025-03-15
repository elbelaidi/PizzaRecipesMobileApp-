package com.example.menupizza;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.menupizza.adapters.PizzaAdapter;
import com.example.menupizza.beans.Pizza;
import com.example.menupizza.services.PizzaServices;

public class ListPizzaActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView liste;
    private PizzaServices pizzaService = PizzaServices.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        liste = findViewById(R.id.liste);
        pizzaService.create(new Pizza("MARGHERITA PIZZA", "4", R.mipmap.pizza3, 30,
                "1 prebaked pizza crust, 2 tablespoons olive oil, 2 garlic cloves (minced), 3 medium tomatoes (sliced), 1 cup shredded mozzarella cheese, 1/2 cup fresh basil leaves, 1/4 teaspoon salt, 1/4 teaspoon pepper",
                "A classic Italian pizza with fresh tomatoes, basil, and mozzarella for a deliciously simple yet flavorful experience.",
                "STEP 1: Preheat oven to 425°F. Brush pizza crust with olive oil and sprinkle with garlic. Arrange tomato slices over crust, then top with mozzarella cheese and basil. Sprinkle with salt and pepper. Bake for 12-15 minutes until cheese is bubbly and slightly golden."));

        pizzaService.create(new Pizza("PEPPERONI PIZZA", "3", R.mipmap.pizza4, 25,
                "1 prebaked pizza crust, 1/2 cup pizza sauce, 1 1/2 cups shredded mozzarella cheese, 20 slices pepperoni, 1/4 teaspoon oregano",
                "A beloved classic loaded with pepperoni and gooey mozzarella cheese, perfect for any pizza lover.",
                "STEP 1: Spread pizza sauce over the crust. Sprinkle with cheese and evenly distribute pepperoni slices. Bake at 450°F for 10-12 minutes until cheese is melted and edges are golden."));

        pizzaService.create(new Pizza("VEGGIE DELIGHT PIZZA", "5", R.mipmap.pizza5, 35,
                "1 whole wheat pizza crust, 1/2 cup tomato sauce, 1 cup shredded mozzarella cheese, 1/4 cup sliced black olives, 1/4 cup chopped green peppers, 1/4 cup chopped red onions, 1/4 cup sliced mushrooms, 1 teaspoon dried oregano",
                "A fresh and healthy pizza loaded with colorful veggies and topped with delicious mozzarella.",
                "STEP 1: Preheat oven to 400°F. Spread tomato sauce over the crust. Sprinkle with cheese, then layer with olives, peppers, onions, and mushrooms. Sprinkle with oregano. Bake for 12-15 minutes until cheese is melted."));

        pizzaService.create(new Pizza("MEAT LOVER'S PIZZA", "4", R.mipmap.pizza6, 40,
                "1 prebaked pizza crust, 1/2 cup pizza sauce, 1 cup shredded mozzarella cheese, 1/2 cup cooked ground beef, 1/2 cup cooked crumbled sausage, 1/2 cup sliced pepperoni, 1/4 cup cooked bacon bits",
                "For those who love their pizza meaty! This pizza is packed with beef, sausage, pepperoni, and bacon.",
                "STEP 1: Preheat oven to 450°F. Spread pizza sauce over the crust, then top with mozzarella cheese. Evenly distribute beef, sausage, pepperoni, and bacon bits. Bake for 12-15 minutes until cheese is bubbly and golden."));

        pizzaService.create(new Pizza("BUFFALO CHICKEN PIZZA", "4", R.mipmap.pizza7, 35,
                "1 prebaked pizza crust, 1 cup cooked shredded chicken, 1/4 cup buffalo wing sauce, 1 cup shredded mozzarella cheese, 1/2 cup crumbled blue cheese, 1/4 cup sliced green onions, 1/4 cup ranch dressing",
                "A spicy and tangy pizza featuring buffalo chicken, blue cheese, and ranch drizzle.",
                "STEP 1: Preheat oven to 425°F. Toss cooked chicken with buffalo sauce. Spread over the crust and sprinkle with mozzarella cheese. Add blue cheese crumbles and green onions. Bake for 12-15 minutes. Drizzle with ranch before serving."));

        pizzaService.create(new Pizza("HAWAIIAN PIZZA", "3", R.mipmap.pizza8, 30,
                "1 prebaked pizza crust, 1/2 cup pizza sauce, 1 cup shredded mozzarella cheese, 1/2 cup diced ham, 1/2 cup pineapple chunks",
                "A sweet and savory pizza with ham and pineapple, a favorite for tropical pizza lovers.",
                "STEP 1: Preheat oven to 450°F. Spread pizza sauce over crust. Sprinkle with mozzarella, then top with ham and pineapple chunks. Bake for 12-15 minutes until cheese is bubbly and golden brown."));

        pizzaService.create(new Pizza("MARGHERITA PIZZA", "4", R.mipmap.pizza3, 30,
                "1 prebaked pizza crust, 2 tablespoons olive oil, 2 garlic cloves (minced), 3 medium tomatoes (sliced), 1 cup shredded mozzarella cheese, 1/2 cup fresh basil leaves, 1/4 teaspoon salt, 1/4 teaspoon pepper",
                "A classic Italian pizza with fresh tomatoes, basil, and mozzarella for a deliciously simple yet flavorful experience.",
                "STEP 1: Preheat oven to 425°F. Brush pizza crust with olive oil and sprinkle with garlic. Arrange tomato slices over crust, then top with mozzarella cheese and basil. Sprinkle with salt and pepper. Bake for 12-15 minutes until cheese is bubbly and slightly golden."));

        pizzaService.create(new Pizza("PEPPERONI PIZZA", "3", R.mipmap.pizza4, 25,
                "1 prebaked pizza crust, 1/2 cup pizza sauce, 1 1/2 cups shredded mozzarella cheese, 20 slices pepperoni, 1/4 teaspoon oregano",
                "A beloved classic loaded with pepperoni and gooey mozzarella cheese, perfect for any pizza lover.",
                "STEP 1: Spread pizza sauce over the crust. Sprinkle with cheese and evenly distribute pepperoni slices. Bake at 450°F for 10-12 minutes until cheese is melted and edges are golden."));

        pizzaService.create(new Pizza("VEGGIE DELIGHT PIZZA", "5", R.mipmap.pizza5, 35,
                "1 whole wheat pizza crust, 1/2 cup tomato sauce, 1 cup shredded mozzarella cheese, 1/4 cup sliced black olives, 1/4 cup chopped green peppers, 1/4 cup chopped red onions, 1/4 cup sliced mushrooms, 1 teaspoon dried oregano",
                "A fresh and healthy pizza loaded with colorful veggies and topped with delicious mozzarella.",
                "STEP 1: Preheat oven to 400°F. Spread tomato sauce over the crust. Sprinkle with cheese, then layer with olives, peppers, onions, and mushrooms. Sprinkle with oregano. Bake for 12-15 minutes until cheese is melted."));

        pizzaService.create(new Pizza("MEAT LOVER'S PIZZA", "4", R.mipmap.pizza6, 40,
                "1 prebaked pizza crust, 1/2 cup pizza sauce, 1 cup shredded mozzarella cheese, 1/2 cup cooked ground beef, 1/2 cup cooked crumbled sausage, 1/2 cup sliced pepperoni, 1/4 cup cooked bacon bits",
                "For those who love their pizza meaty! This pizza is packed with beef, sausage, pepperoni, and bacon.",
                "STEP 1: Preheat oven to 450°F. Spread pizza sauce over the crust, then top with mozzarella cheese. Evenly distribute beef, sausage, pepperoni, and bacon bits. Bake for 12-15 minutes until cheese is bubbly and golden."));

        pizzaService.create(new Pizza("BUFFALO CHICKEN PIZZA", "4", R.mipmap.pizza7, 35,
                "1 prebaked pizza crust, 1 cup cooked shredded chicken, 1/4 cup buffalo wing sauce, 1 cup shredded mozzarella cheese, 1/2 cup crumbled blue cheese, 1/4 cup sliced green onions, 1/4 cup ranch dressing",
                "A spicy and tangy pizza featuring buffalo chicken, blue cheese, and ranch drizzle.",
                "STEP 1: Preheat oven to 425°F. Toss cooked chicken with buffalo sauce. Spread over the crust and sprinkle with mozzarella cheese. Add blue cheese crumbles and green onions. Bake for 12-15 minutes. Drizzle with ranch before serving."));

        pizzaService.create(new Pizza("HAWAIIAN PIZZA", "3", R.mipmap.pizza8, 30,
                "1 prebaked pizza crust, 1/2 cup pizza sauce, 1 cup shredded mozzarella cheese, 1/2 cup diced ham, 1/2 cup pineapple chunks",
                "A sweet and savory pizza with ham and pineapple, a favorite for tropical pizza lovers.",
                "STEP 1: Preheat oven to 450°F. Spread pizza sauce over crust. Sprinkle with mozzarella, then top with ham and pineapple chunks. Bake for 12-15 minutes until cheese is bubbly and golden brown."));

        liste.setAdapter(new PizzaAdapter(this, pizzaService.findAll()));
        liste.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        final TextView idf = view.findViewById(R.id.idf);
        TextView nom = view.findViewById(R.id.nom);
        Toast.makeText(this, idf.getText().toString() + " " + nom.getText().toString(), Toast.LENGTH_SHORT).show();

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Choose an option :");

        alertDialogBuilder.setPositiveButton("Delete", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                pizzaService.delete(pizzaService.findById(Integer.parseInt(idf.getText().toString())));
                liste.setAdapter(new PizzaAdapter(ListPizzaActivity.this, pizzaService.findAll()));
            }
        });

        alertDialogBuilder.setNegativeButton("Description", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(ListPizzaActivity.this, DetailsPizza.class);
                intent.putExtra("idf", idf.getText().toString());
                startActivity(intent);
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}