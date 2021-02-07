package view;

import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("1. Crear Arreglo Dinamico de Datos");
			System.out.println("2. Agregar Dato");
			System.out.println("3. Buscar Dato");
			System.out.println("4. Eliminar Dato");
			System.out.println("5. Invertir el arreglo");
			System.out.println("6. Imprimir el Arreglo");
			System.out.println("7. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		
		public void printModelo(Modelo modelo)
		{
			// TODO implementar
			System.out.println(modelo.toString());
		}
		
}

