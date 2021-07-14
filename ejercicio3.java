package ejerciciosunidad7;

import java.util.Enumeration;

import java.util.Hashtable;

import javax.swing.JOptionPane;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Hashtable<String, Double> inventario = productos();
		
		menu(inventario);

	}
	
		
	public static void menu(Hashtable<String, Double> inventario) {
		
		String opcionbeta=(JOptionPane.showInputDialog("Escribe consultar para consultar el inventario.\nEscribe consultarprecio para consultar el precio de un articulo.\nEscrive introducir para introducir un articulo"));
		
		do {
		
		switch (opcionbeta) {
			
			case "consultar":
				
				System.out.println("ARTICULOS A LA VENTA\n-------------------------");
				
				recorrerhashtable(inventario);
				
				break;
			
			case "consultarprecio":
			
				System.out.println("CONSULTAR PRECIOS\n-----------------------");
				
				consultarprecio(inventario);
				
				break;
			
			case "introducir":
			
				introducirdatos(inventario);
				
				break;
	
			default:
				
				JOptionPane.showMessageDialog(null, "Introduzca una respuesta valida");
				
				menu(inventario);
				
				break;
		
		
		}
		
		}while(opcionbeta!="consultarinv"||opcionbeta!="consultarprecio"||opcionbeta!="introducir");
		
	}
	
		
	public static Hashtable<String, Double> productos(){
		
		Hashtable<String, Double> producto = new Hashtable<>();
		
		
		producto.put("Fideos", 0.70);
		
		producto.put("Platanos", 0.60);
		
		producto.put("Chocolate", 1.00);
		
		producto.put("Papel", 0.30);
		
		producto.put("Harina", 0.50);
		
		producto.put("Vino", 1.50);
		
		producto.put("Refresco", 1.20);
		
		producto.put("Helado", 1.60);
		
		producto.put("Ternera", 0.90);
		
		producto.put("Agua", 0.50);
		
		return producto;
		
	}
	
		
	public static void introducirdatos (Hashtable<String, Double> hash) {
		
		String articulo = JOptionPane.showInputDialog("Introduce el nombre del articulo");
		
		String preciobeta= JOptionPane.showInputDialog("Introduce el precio del articulo");
		
		Double precio = Double.parseDouble(preciobeta);
		
		hash.put(articulo, precio);
		
		menu(hash);
		
	}
	
		
	public static void consultarprecio(Hashtable<String, Double> hash) {
		
		String articulo = JOptionPane.showInputDialog("Introduce el nombre del articulo a buscar");
		
		double precioarticulo=hash.get(articulo);
		
		System.out.println("El articulo que has seleccionado es: " + articulo +".\n Su precio es " + precioarticulo);
		
		menu(hash);
		
		}
		
	public static void recorrerhashtable(Hashtable<String, Double> hash) {
		
		Enumeration<String> key = hash.keys();
		
		Enumeration<Double> valor = hash.elements();
		
		while (key.hasMoreElements()) {
			
			System.out.println(key.nextElement() + ": " + valor.nextElement());
			
		}
		
		menu(hash);
		
	}

}