package com.socurites.taco.order.repository;

import com.socurites.taco.order.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String>{
}
