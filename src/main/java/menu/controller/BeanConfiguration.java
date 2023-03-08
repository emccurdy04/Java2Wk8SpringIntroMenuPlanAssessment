/**
* @author Elizabeth McCurdy - emccurdy
* CIS 175 - Spring 2023
* Mar 8, 2023
*/
package menu.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import menu.beans.MenuPlan;

/**
 * Java 2 - Week 8 Assessment - Spring Intro project -
 * Menu project
 * 
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public MenuPlan menuplan() {
		MenuPlan bean = new MenuPlan();
		return bean;
	}

}
