package ies.jandula.reservas.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Manuel y Miguel
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * teacher class
 */
public class Teacher
{
	/**
	 * teacher name
	 */
	private String name;
	/**
	 * teacher last name
	 */
	private String lastname;
	/**
	 * teacher dni
	 */
	private String dni;
}
