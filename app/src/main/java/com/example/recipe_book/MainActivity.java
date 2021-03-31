package com.example.recipe_book;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.recipe_book.Activities.my_recipes;

public class MainActivity extends AppCompatActivity
{
    private Button recipe_book;
    private Button add_recipe;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipe_book = findViewById(R.id.my_recippes_button);
        recipe_book.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                open_recipes_viev();
            }
        });
    }

    private void open_recipes_viev()
    {
        Intent open = new Intent(this, my_recipes.class);
        startActivity(open);
    }

}
