package controller;

import java.util.ArrayList;

import com.proyectosw.hotel.ObtenerListaClientesResponse;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.ConexionAWS;
import model.Cliente;

public class ClienteDAO {
	private int idCliente;
	private String nombre;
	private String apellido;
	private String telefono;
	private String correo;
	private String formaPago;
	
	private ConexionAWS database;
	private ObtenerListaClientesResponse.Cliente cliente;
	
	/**
	 * Constructor de CLIENTE para registrar al cliente
	 * @param nombre, apellido, telefono, correo, formaPago
	 */
	public ClienteDAO(String nombre,String apellido, String telefono, String correo, String formaPago) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.formaPago = formaPago;
	}
	
	/**
	 * Constructor de CLIENTE para actualizar al cliente
	 * @param idCliente, nombre, apellido, telefono, correo, formaPago
	 */
	public ClienteDAO(int idCliente, String nombre,String apellido, String telefono, String correo, String formaPago) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.correo = correo;
		this.formaPago = formaPago;
	}
	
	/**
	 * Constructor de CLIENTE para eliminar al cliente
	 * @param idCliente
	 */
	public ClienteDAO(int idCliente) {
		this.idCliente = idCliente;
	}
	
	/**
	 * Constructor de CLIENTE vacio
	 * @param idCliente
	 */
	public ClienteDAO() {
		
	}
	
	/**
	 * Metodo para registrar un cliente en la Base de Datos
	 * @return true si se registro el cliente de forma exitosa en la BD
	 */
	public String registrarCliente() {
		String resultado = "Error";
		this.database = new ConexionAWS();
		try {
			String queryDuplicado = "SELECT * FROM clientes WHERE correo='"+this.correo+"' AND telefono='"+this.telefono+"'";
			ResultSet rs = this.database.connect().createStatement().executeQuery(queryDuplicado);
			System.out.println("Revistar registro");
			System.out.println(rs);
			if (rs.next()) {
				resultado = "Duplicado";
			} else {
				this.database.connect().createStatement().execute(
						"INSERT INTO clientes (nombre,apellido,telefono,correo,formaPago) VALUES "
						+ "('"+this.nombre+"','"+this.apellido+"','"+this.telefono+"','"+this.correo
						+"','"+this.formaPago+"')");
				resultado = "Exito";
			}
			
			
		} catch (SQLException e) {
			resultado = "Error";
			System.out.println("error = " + e.getMessage());
		}
		return resultado;
	}
	
	
	
	/**
	 * Metodo para actualizar a un cliente en la Base de Datos
	 * @return true si se actualizo el cliente de forma exitosa en la BD
	 */
	public String actualizarCliente() {
		String resultado = "Error";
		this.database = new ConexionAWS();
		try {
			String query = "UPDATE clientes SET"
				+ " nombre = '"+this.nombre+"',"
				+ " apellido = '"+this.apellido+"',"
				+ " telefono = '"+this.telefono+"',"
				+ " correo = '"+this.correo+"',"
				+ " formaPago = '"+this.formaPago+"'"
				+ " WHERE idCliente = "+this.idCliente;
			this.database.connect().createStatement().execute(query);
		
			resultado = "Exito";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	/**
	 * Metodo para eliminar a un cliente de la Base de Datos
	 * @return true si se elimina el cliente de forma exitosa
	 */
	public boolean eliminarCliente() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connect().createStatement().execute(
					"DELETE FROM clientes WHERE idCliente = "+this.idCliente);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}

	/**
	 * Metodo para obtener el nombre del cliente
	 * @return the nombre
	 */
	public String getNombre() {
		this.database = new ConexionAWS();
		if (nombre == null) {
			try {
				this.database.connect().createStatement().execute(
						"SELECT nombre FROM clientes WHERE idCliente = "+this.idCliente);
								
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return nombre;
	}

	

	/**
	 * Metodo para obtener el apellido del cliente
	 * @return the apellido
	 */
	public String getApellido() {
		this.database = new ConexionAWS();
		if (apellido == null) {
			try {
				this.database.connect().createStatement().execute(
						"SELECT apellido FROM clientes WHERE idCliente = "+this.idCliente);
								
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return apellido;
	}
	
	/**
	 * Metodo para verificar que el id del cliente existe
	 * @return true si existe y false si no existe
	 */
	public boolean verificarIdCliente() {
		boolean existe = false;
		this.database = new ConexionAWS();
			try {
				final String queryCheck = "SELECT * FROM clientes WHERE idCliente = "+this.idCliente;
				final PreparedStatement ps = this.database.connect().prepareStatement(queryCheck);
				//ps.setString(1, msgid);
				final ResultSet resultSet = ps.executeQuery();
				if(resultSet.next()) {
				    final int count = resultSet.getInt(1);
				}
				
				
				//this.database.connect().createStatement().execute("SELECT * FROM clientes WHERE idCliente = "+this.idCliente);
				existe = true;				
			} catch(SQLException e) {
				e.printStackTrace();
			}
		return existe;
	}
	
	
	/**
	 * Metodo para consultar la informacion de un cliente
	 * @param id
	 * @return cliente
	 */
	public Cliente consultarCliente(int id) {
		Cliente cliente = null;
		this.database = new ConexionAWS();
		try {
			ResultSet rs = this.database.connect().createStatement().executeQuery("SELECT * FROM clientes WHERE idCliente="+id);
			while(rs.next()) {
				cliente = new Cliente(rs.getString("nombre"), rs.getString("apellido"), rs.getString("telefono")
						, rs.getString("correo"), rs.getString("formaPago"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}
	
	public ArrayList<ObtenerListaClientesResponse.Cliente> getListaClientes(){
		ArrayList<ObtenerListaClientesResponse.Cliente> clientes = new ArrayList<ObtenerListaClientesResponse.Cliente>();
		this.database = new ConexionAWS();
		try {
			ResultSet rs = this.database.connect().createStatement().executeQuery("SELECT * FROM clientes");
			while(rs.next()) {
				ObtenerListaClientesResponse.Cliente c = new ObtenerListaClientesResponse.Cliente(rs.getInt("idCliente"),rs.getString("nombre"), rs.getString("apellido"), rs.getString("telefono")
							, rs.getString("correo"), rs.getString("formaPago"));
				
					
					//= new Cliente(rs.getInt("idCliente"),rs.getString("nombre"), rs.getString("apellido"), rs.getString("telefono")
					//	, rs.getString("correo"), rs.getString("formaPago"));
				clientes.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
}
