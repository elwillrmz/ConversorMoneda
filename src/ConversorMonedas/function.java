package ConversorMonedas;

import javax.swing.JOptionPane;

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedas dolares = new ConvertirMonedas();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Dólar a Pesos", "De Dólar a Euro", "De Dólar a Libras","De Dólar a Yen","De Dólar a Won Coreano","De Pesos a Dólar", "De Euro a Dólar", "De Libras a Dólar","De Yen a Dólar","De Won Coreano a Dólar"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Dólar a Pesos":
        	monedas.ConvertirDolaresAPesosMXN(Minput);
        	break;
        case "De Dólar a Euro":
        	monedas.ConvertirDolaresAEuros(Minput);
        	break;
        case "De Dólar a Libras":
        	monedas.ConvertirDolaresALibra(Minput);
        	break;
        case "De Dólar a Yen":
        	monedas.ConvertirDolaresAYen(Minput);
        	break;
        case "De Dólar a Won Coreano":
        	monedas.ConvertirDolaresAWon(Minput);
        	break;    	    	                          
        case "De Pesos a Dólar":
        	dolares.ConvertirPesosMXNADolares(Minput);
        	break;
        case "De Euro a Dólar":
        	dolares.ConvertirEurosADolares(Minput);
        	break;
        case "De Libras a Dólar":
        	dolares.ConvertirLibraADolares(Minput);
        	break;
        case "De Yen a Dólar":
        	dolares.ConvertirYenADolares(Minput);
        	break;
        case "De Won Coreano a Dólar":
            dolares.ConvertirWonADolares(Minput);
            break;
        }      
    }
        
	
}
