package interfaces;

/**
 * @author Juan Jurado
 */

public interface ITicket 
{

	/**
	 * Tarifa que tiene que pagar los autobuses
	 * 
	 * @param kilometroEntrada
	 * @param kilometroSalida
	 * @param precioKilometro
	 * @param numeroPasajeros
	 * @return
	 */
	static double tarifaEspecial(int kilometroEntrada, int kilometroSalida, double precioKilometro, int numeroPasajeros) 
	{
		double reduccion;
		double tarifa;
		int diferencia = kilometroSalida - kilometroEntrada;

		if (diferencia > 100) 
		{

			reduccion = (diferencia * precioKilometro * numeroPasajeros * 0.05);

			tarifa = (diferencia * precioKilometro) - reduccion;

		} else
		{
			tarifa = diferencia * precioKilometro * numeroPasajeros;

		}

		return tarifa;
	}

	/**
	 * Tarifa que tiene que pagar los vehiculos
	 * 
	 * @param kilometroEntrada
	 * @param kilometroSalida
	 * @param precioKilometro
	 * @return
	 */
	static double tarifaGeneral(int kilometroEntrada, int kilometroSalida, double precioKilometro)
	{                                                                                              
		double reduccion;                                                                          
		double tarifa;                                                                             
		int diferencia = kilometroSalida - kilometroEntrada;                                       
		                                                                                           
		if(diferencia>500)                                                                         
		{                                                                                          
			                                                                                       
			 reduccion= (diferencia*precioKilometro*0.1);                                         
			 tarifa=(diferencia*precioKilometro) - reduccion;                                        
			                                                                                       
			 return tarifa;                                                                        
		                                                                                           
		}                                                                                          
		else                                                                                       
		{                                                                                       
			                                                                                       
			 tarifa= diferencia*precioKilometro;                                                   
			                                                                                       
			                                                                                       
		}                                                                                          
	                                                                                               
		                                                                                           
		return tarifa;		                                                                       
	}                                                                                              
	
}
