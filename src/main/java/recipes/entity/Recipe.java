/**
 * 
 */
package recipes.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Asha
 *
 */
public class Recipe {
	private Integer recipeId;
	private String recipeName;
	private String notes;
	private Integer numServings;
	private LocalTime prepTime;
	private LocalTime cookTime;
	private LocalDateTime createdAt;
	
	private List<Ingredient> ingredient = new LinkedList<>();
	private List<Step> steps = new LinkedList<>();	
	private List<Category> categories = new LinkedList<>();	
	

}
