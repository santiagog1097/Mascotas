/**
 * 
 */
package Mundo;

/**
 * @author W
 *
 */
public class Cliente {
	Cliente siguiente;
	String nombre, direccion, telefono;
	int identificacion;

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Cliente getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Cliente siguiente) {
		this.siguiente = siguiente;
	}

	public Cliente(int identificacion, String nombre, String direccion, String telefono) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}

}
