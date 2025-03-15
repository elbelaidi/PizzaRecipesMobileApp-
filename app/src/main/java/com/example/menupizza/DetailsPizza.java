package com.example.menupizza;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.menupizza.beans.Pizza;
import com.example.menupizza.services.PizzaServices;

public class DetailsPizza extends AppCompatActivity {
    private PizzaServices pizzaService;
    private ImageView image;
    private TextView desc;
    private TextView nom;
    private TextView ingredients;
    private TextView preparation;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_pizza);


        Intent intent = getIntent();
        int id = Integer.parseInt(intent.getStringExtra("idf"));


        pizzaService = PizzaServices.getInstance();


        image = findViewById(R.id.image);
        nom = findViewById(R.id.nom);
        desc = findViewById(R.id.desc);
        ingredients = findViewById(R.id.ingredients);



        Pizza pizza = pizzaService.findById(id);


        if (pizza != null) {
            image.setImageResource(pizza.getPhoto());
            nom.setText(pizza.getNom());
            desc.setText(pizza.getDescription());
            ingredients.setText(pizza.getDetailsIngred());
        }
    }
}