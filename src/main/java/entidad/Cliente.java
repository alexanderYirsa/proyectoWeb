package entidad;

public class Cliente {
	
	int id_cliente;
	String nombre;
	String apellido;
	String clave;
	String email;
	String telefono;
	double saldo;
	
	public Cliente() {
		
	}

	public Cliente(int id_cliente, String nombre, String apellido, String clave, String email, String telefono, double saldo) {
		
		this.id_cliente = id_cliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.email = email;
		this.telefono = telefono;
		this.saldo = saldo;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nombre=" + nombre + ", apellido=" + apellido + ", clave="
				+ clave + ", email=" + email + ", telefono=" + telefono + ", saldo=" + saldo + "]";
	}


	
}
