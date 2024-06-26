package ies.jandula.reservas.error;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Manuel y Miguel
 */

@Data
@NoArgsConstructor
public class BookingError extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5216111150976621274L;
	
	private int id;
	
	private String message;
	
	private Exception exception;

	public BookingError(int id, String message, Exception exception)
	{
		super();
		this.id = id;
		this.message = message;
		this.exception = exception;
	}
	
	public BookingError(int id, String message)
	{
		super();
		this.id = id;
		this.message = message;
	}

	public Map<String, String> getMapError()
	{
		Map<String, String> mapError = new HashMap<String, String>();
		
		mapError.put("id", "" + id) ;
		mapError.put("message", message) ;
		
		if (this.exception != null)
		{
			String stacktrace = ExceptionUtils.getStackTrace(this.exception);
			mapError.put("exception", stacktrace);			
		}
		
		return mapError ;
	}
}