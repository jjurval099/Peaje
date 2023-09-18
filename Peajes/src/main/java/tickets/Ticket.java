package tickets;

import interfaces.ITicket;

/**
 * @author Juan Jurado
 */

public abstract class Ticket implements ITicket 
{
	
	/**
	 * kilometroEntrada - kilometro en el que entra el vehiculo
	 * kilometroSalida - kilometro en el que sale el vehiculo
	 * precioKilometro - coste del peaje
	 */
	private int kilometroEntrada;
	private int kilometroSalida;
	private double precioKilometro;
	
	
	/**
	 * 
	 * @param kilometroEntrada
	 * @param kilometroSalida
	 * @param precioKilometro
	 */
	public Ticket(int kilometroEntrada, int kilometroSalida, double precioKilometro) 
	{
		this.kilometroEntrada = kilometroEntrada;
		this.kilometroSalida = kilometroSalida;
		this.precioKilometro = precioKilometro;
	}

	/**
	 * 	
	 * @return kilometroEntrada
	 */
	public int getKilometroEntrada() 
	{
		return kilometroEntrada;
	}
	
	/**
	 * 
	 * @param kilometroEntrada
	 */

	public void setKilometroEntrada(int kilometroEntrada) 
	{
		this.kilometroEntrada = kilometroEntrada;
	}
	
	/**
	 * 
	 * @return kilometroSalida
	 */

	public int getKilometroSalida() 
	{
		return kilometroSalida;
	}
	
	/**
	 * 
	 * @param kilometroSalida
	 */

	public void setKilometroSalida(int kilometroSalida) 
	{
		this.kilometroSalida = kilometroSalida;
	}
	
	/**
	 * 
	 * @return precioKilometro
	 */

	public double getPrecioKilometro() 
	{
		return precioKilometro;
	}
	
	/**
	 * 
	 * @param precioKilometro
	 */

	public void setPrecioKilometro(double precioKilometro) 
	{
		this.precioKilometro = precioKilometro;
	}
	

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return kilometroEntrada == other.kilometroEntrada && kilometroSalida == other.kilometroSalida
				&& Double.doubleToLongBits(precioKilometro) == Double.doubleToLongBits(other.precioKilometro);
	}

	@Override
	public String toString() 
	{
		return "Ticket [kilometroEntrada= " + kilometroEntrada + ", kilometroSalida=" + kilometroSalida
				+ ", precioKilometro=" + precioKilometro;
	}
	

}
