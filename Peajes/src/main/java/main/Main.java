package main;

import interfaces.ITicket;

/**
 * @author Juan Jurado
 */

public class Main 
{

	public static void main(String[] args) 
	{
		
				
		System.out.println(ITicket.tarifaGeneral(20, 601, 1));
		System.out.println(ITicket.tarifaEspecial(50, 200, 2, 20));
		

	}

}
