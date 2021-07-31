package arreglo;

import java.util.ArrayList;

import clase.Producto;

public class ArregloProductos {
	
	private ArrayList<Producto> pro;
	
	public ArregloProductos() {
		pro = new ArrayList<Producto>();
		
		adicionar(new Producto(3456, "Laptop", 19, 2499.00));
		adicionar(new Producto(5476, "Mouse", 13, 249.00));
		adicionar(new Producto(2678, "Keyboard", 25, 399.00));
		adicionar(new Producto(7534, "Case", 50, 499.00));
		adicionar(new Producto(4678, "Monitor", 71, 1199.00));
	}
	
	public void adicionar(Producto x) {
		pro.add(x);		
	}
	
	public int tamaño() {
		return pro.size();
	}
	
	public Producto obtener(int i) {
		return pro.get(i);
	}
	
	public Producto buscar(int codigo) {
		for (int i = 0; i < tamaño(); i++) {
			if (obtener(i).getCodigo() == codigo) {
				return obtener(i);
			}
		}
		return null;
	}
	
	public void eliminar(Producto e) {
		pro.remove(e);
	}

	public String productoMayorStock() {
		int psMayor = obtener(0).getStock();
		String desc = obtener(0).getDescripcion();
		for (int i = 0; i < tamaño(); i++) {
			if(obtener(i).getStock() > psMayor) {
				psMayor = obtener(i).getStock();
				desc = obtener(i).getDescripcion();
			}	
		}
		return desc;
	}
	
	public String productoMenorStock() {
		String desc = obtener(0).getDescripcion();
		int psMenor = obtener(0).getStock();
		for (int i = 0; i < tamaño(); i++) {
			if(obtener(i).getStock() < psMenor) {
				psMenor = obtener(i).getStock();
				desc = obtener(i).getDescripcion();
			}	
		}
		return desc;
	}
	
	public double sumaPrecioProducto() {
		double sumaPP = 0;
		
		for (int i = 0; i < tamaño(); i++) {
			sumaPP += obtener(i).getPrecio();
		}
		return sumaPP;
	}
	
	public double promedioPrecioProducto() {
		int cantPP = tamaño();
		double sumaPP = 0;
		
		for (int i = 0; i < tamaño(); i++) {
			sumaPP += obtener(i).getPrecio();
		}
		return sumaPP / cantPP;
	}
	

}
