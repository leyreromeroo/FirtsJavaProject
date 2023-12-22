package org.cuatrovientos.dam.ed.ejemplo1maven;


import javax.management.loading.PrivateClassLoader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Calculadora 
{
	private static Logger logger = LogManager.getLogger() ;
	/**
	 * 
	 */
	private String operacionEnCurso;
	
    public Calculadora(String operacionEnCurso) {
		super();
		this.operacionEnCurso = operacionEnCurso;
	}

	public static void main( String[] args )
    {
					System.out.println( "Hello World!" );
        //TODO LR: Cear una función que haga suma
					logger.error("Error");
     
//       switch (key) {
//	case value:
//		
//		break;
//
//	default:
//		break;
//	}
					Calculadora miCalculadora = new Calculadora();
					switch (args[0]) {
					case "sumar":
						
						int resultado = sumar(args[1], args[2]);
						break;

					default:
						break;
					}
					Private static int sumar (String, numero1, String numero2) {
						int numero1Int= Integer.valueOf(numero1);
						int numero2Int= Integer.valueOf(numero2);
						return numero1Int = numero2Int
					}
    }

	public String getOperacionEnCurso() {
		return operacionEnCurso;
	}

	public void setOperacionEnCurso(String operacionEnCurso) {
		this.operacionEnCurso = operacionEnCurso;
	}
}
