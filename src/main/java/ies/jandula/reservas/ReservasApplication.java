package ies.jandula.reservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Manuel y Miguel
 */

@SpringBootApplication
@ComponentScan(basePackages = "ies.jandula")
public class ReservasApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(ReservasApplication.class, args);
	}
}
