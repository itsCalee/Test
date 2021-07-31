package clase;

public class Producto {
	private int codigo;
	private String descripcion;
	private int stock;
	private double precio;
	
	public Producto(int codigo, String descripcion, int stock, double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.stock = stock;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
