/**
* @author Elizabeth McCurdy - emccurdy
* CIS 175 - Spring 2023
* Mar 8, 2023
*/

package menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import menu.beans.MenuPlan;
import menu.controller.BeanConfiguration;
import menu.repository.MenuPlanRepository;

/**
 * Java 2 - Week 8 Assessment - Spring Intro project -
 * Menu project
 */
@SpringBootApplication
public class SpringJ2Wk8MenuAssessProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJ2Wk8MenuAssessProjectApplication.class, args);
		
//		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//		
//		MenuPlan menu = appContext.getBean("menuplan", MenuPlan.class);
//		
//		System.out.println(menu.toString());
//		//output: with initial run of application
//		//MenuPlan [id=0, mainCourse=null, sideDish=null, dessert=null]
//		
//		// output: after put defaults for sideDish & dessert values in default constructor
//		//MenuPlan [id=0, mainCourse=null, sideDish=none, dessert=none]
	}
	
	
	// add an instance to use the MenuPlanRepository - autowire it so it is
	// available to use. 
	@Autowired
	MenuPlanRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		// If had an existing bean to use, would then use setters for sideDish & dessert then save 
		//to repo - but did not use constructor injectino in BeanConfiguration method
		//MenuPlan menu = appContext.getBean("menuplan", MenuPlan.class);
		//menu.setSideDish("none");
		//menu.setDessert("none");
		//repo.save(menu);
		
		// Create a bean to use - not managed by Spring - by calling the
		//non-default constructor MenuPlan(String mainCourse, String sideDish, String dessert)
		MenuPlan menuA	= new MenuPlan("pizza", "none", "none");
		repo.save(menuA);
		
		MenuPlan menuB	= new MenuPlan("baked 'fried' chicken", "broccoli with cheese", "none");
		repo.save(menuB);
		
		MenuPlan menuC	= new MenuPlan("french dip sandwiches", "caesar salad", "lemon pound cake");
		repo.save(menuC);
		
		MenuPlan menuD	= new MenuPlan("chicken fahitas", "none", "strawberry shortcake");
		repo.save(menuD);
		
		List<MenuPlan> allMyMenus = repo.findAll();
		for (MenuPlan menu : allMyMenus) {
			System.out.println(menu.toString());
		}
		
		//closes the ApplicationContext resource leak - not imperative to add, but good programming
		// practice to code in clean up
		((AbstractApplicationContext) appContext).close();
	}
	
	

}
