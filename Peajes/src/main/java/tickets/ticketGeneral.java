package tickets;

/**
 * @author Juan Jurado
 */

/**
 * La clase ticketGeneral calcula la tarifa que pagan todos los vehiculos menos
 * los autobuses
 */

public class ticketGeneral extends Ticket 
{

	public ticketGeneral(int kilometroEntrada, int kilometroSalida, double precioKilometro) 
	{
		super(kilometroEntrada, kilometroSalida, precioKilometro);
	}
	

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}


	@Override
	public String toString() {
		return super.toString() + "ticketGeneral ";
	}
	
	
	
}


