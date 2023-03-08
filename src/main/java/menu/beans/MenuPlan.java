/**
* @author Elizabeth McCurdy - emccurdy
* CIS 175 - Spring 2023
* Mar 8, 2023
*/
package menu.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * Java 2 - Week 8 Assessment - Spring Intro project -
 * MenuPlan class for object/entity blueprint to be
 * used  in menuplans DB.  
 */
@Entity
public class MenuPlan {
	@Id
	@GeneratedValue
	private long id;
	private String mainCourse;
	private String sideDish;
	private String dessert;
	
	
	/**
	 * Default - no args constructor
	 */
	public MenuPlan() {
		super();
		this.sideDish = "none";
		this.dessert = "none";
	}


	/**
	 * Non-default constructor - takes all args except id
	 * @param mainCourse
	 * @param sideDish
	 * @param dessert
	 */
	public MenuPlan(String mainCourse, String sideDish, String dessert) {
		super();
		this.mainCourse = mainCourse;
		this.sideDish = sideDish;
		this.dessert = dessert;
	}


	/**
	 * Non-default constructor - takes all args
	 * @param id
	 * @param mainCourse
	 * @param sideDish
	 * @param dessert
	 */
	public MenuPlan(long id, String mainCourse, String sideDish, String dessert) {
		super();
		this.id = id;
		this.mainCourse = mainCourse;
		this.sideDish = sideDish;
		this.dessert = dessert;
	}


	// Getters and Setters
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}


	/**
	 * @return the mainCourse
	 */
	public String getMainCourse() {
		return mainCourse;
	}


	/**
	 * @param mainCourse the mainCourse to set
	 */
	public void setMainCourse(String mainCourse) {
		this.mainCourse = mainCourse;
	}


	/**
	 * @return the sideDish
	 */
	public String getSideDish() {
		return sideDish;
	}


	/**
	 * @param sideDish the sideDish to set
	 */
	public void setSideDish(String sideDish) {
		this.sideDish = sideDish;
	}


	/**
	 * @return the dessert
	 */
	public String getDessert() {
		return dessert;
	}


	/**
	 * @param dessert the dessert to set
	 */
	public void setDessert(String dessert) {
		this.dessert = dessert;
	}


	// Helper/toString methods
	
	@Override
	public String toString() {
		return "MenuPlan [id=" + id + ", mainCourse=" + mainCourse + ", sideDish=" + sideDish + ", dessert=" + dessert
				+ "]";
	}
	
	

}
