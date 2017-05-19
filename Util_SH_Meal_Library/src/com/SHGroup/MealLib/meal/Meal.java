package com.SHGroup.MealLib.meal;

import java.util.Arrays;
import java.util.List;

public class Meal {
	private final List<String> breakfast, lunch, dinner;

	public Meal(String breakfast, String lunch, String dinner) {
		this.breakfast = Arrays.asList(breakfast.split("\n"));
		this.lunch = Arrays.asList(lunch.split("\n"));
		this.dinner = Arrays.asList(dinner.split("\n"));
	}

	public Meal(List<String> breakfast, List<String> lunch, List<String> dinner) {
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.dinner = dinner;
	}

	public List<String> getBreakFast() {
		return breakfast;
	}

	public List<String> getLunch() {
		return lunch;
	}

	public List<String> getDinner() {
		return dinner;
	}

	@Override
	public String toString() {
		return "breakfast : ["
				+ Arrays.toString(breakfast.toArray(new String[] {}))
				+ "], lunch : ["
				+ Arrays.toString(lunch.toArray(new String[] {}))
				+ "], dinner : ["
				+ Arrays.toString(dinner.toArray(new String[] {})) + "]";
	}
}
