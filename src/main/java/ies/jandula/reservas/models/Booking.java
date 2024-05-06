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
 * booking class
 */
public class Booking
{
	/**
	 *  Teacher that makes the book
	 */
	private Teacher teacher;
	/**
	 * the date of the book
	 */
	private String date;
}
