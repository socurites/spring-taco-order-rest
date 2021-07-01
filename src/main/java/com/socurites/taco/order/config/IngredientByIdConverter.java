package com.socurites.taco.order.config;

import com.socurites.taco.order.model.Ingredient;
import com.socurites.taco.order.repository.IngredientRepository;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

import java.util.Optional;

@Configuration
public class IngredientByIdConverter implements Converter<String, Ingredient> {
	private IngredientRepository ingredientRepository;

	public IngredientByIdConverter(IngredientRepository ingredientRepository) {
		this.ingredientRepository = ingredientRepository;
	}

	@Override
	public Ingredient convert(String id) {
		Optional<Ingredient> optional = ingredientRepository.findById(id);
		return optional.isPresent() ? optional.get() : null;
	}

}
