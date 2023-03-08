/**
* @author Elizabeth McCurdy - emccurdy
* CIS 175 - Spring 2023
* Mar 8, 2023
*/
package menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import menu.beans.MenuPlan;

/**
 * Java 2 - Week 8 Assessment - Spring Intro project -
 * menuplans DB
 * A repository interface is defined for each domain entity in the application.
 * A repository contains methods for performing CRUD (create, update, delete/drop)
 * operations, sorting & paginating data. 
 */
@Repository
public interface MenuPlanRepository extends JpaRepository<MenuPlan, Long> {

}
