package tickets;

/**
 * @author Juan Jurado
 */

/**
 * La clase ticketGeneral calcula la tarifa que pagan los  autobuses
 */

public class ticketEspecial extends Ticket 
{

	/**
	 * numeroPasajeros - Numero de pasajeros que tiene el autobus
	 */
	private int numeroPasajeros;

	/**
	 * 
	 * @param kilometroEntrada
	 * @param kilometroSalida
	 * @param precioKilometro
	 * @param numeroPasajeros
	 */
	public ticketEspecial(int kilometroEntrada, int kilometroSalida, double precioKilometro, int numeroPasajeros) 
	{
		super(kilometroEntrada, kilometroSalida, precioKilometro);
		this.numeroPasajeros = numeroPasajeros;
	}

	/**
	 * 
	 * @return numeroPasajeros
	 */
	public int getNumeroPasajeros() 
	{
		return numeroPasajeros;
	}

	/**
	 * 
	 * @param numeroPasajeros
	 */

	public void setNumeroPasajeros(int numeroPasajeros) 
	{
		this.numeroPasajeros = numeroPasajeros;
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
		ticketEspecial other = (ticketEspecial) obj;
		return numeroPasajeros == other.numeroPasajeros;
	}



	@Override
	public String toString() 
	{
		return super.toString() + " ticketEspecial ";

	}

}
