package controller;

import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;

import database.ConexionAWS;
import model.Reservacion;

public class ReservacionDAO {
	private int idReservacion;
	private Date fechaLlegada;
	private Date fechaSalida;
	private int numAdultos;
	private int numNinos;
	private int numCamas;
	private String tipoHabitacion;
	private double precio;
	private int idCliente;
	
	private ConexionAWS database;
	
	/**
	 * @param idReservacion
	 * @param fechaLlegada
	 * @param fechaSalida
	 * @param numAdultos
	 * @param numNinos
	 * @param numCamas
	 * @param tipoHabitacion
	 * @param precio
	 * @param idCliente
	 */
	public ReservacionDAO(int idReservacion, String fechaLlegada, String fechaSalida, int numAdultos, int numNinos,
			int numCamas, String tipoHabitacion,  int idCliente) {
		this.idReservacion = idReservacion;
		this.fechaLlegada = Date.valueOf(fechaLlegada);
		this.fechaSalida = Date.valueOf(fechaSalida);
		this.numAdultos = numAdultos;
		this.numNinos = numNinos;
		this.numCamas = numCamas;
		this.tipoHabitacion = tipoHabitacion;
		this.idCliente = idCliente;
	}
	
	/**
	 * @param fechaLlegada
	 * @param fechaSalida
	 * @param numAdultos
	 * @param numNinos
	 * @param numCamas
	 * @param tipoHabitacion
	 * @param precio
	 * @param idCliente
	 */
	public ReservacionDAO(String fechaLlegada, String fechaSalida, int numAdultos, int numNinos,
			int numCamas, String tipoHabitacion, int idCliente) {
		this.fechaLlegada = Date.valueOf(fechaLlegada);
		this.fechaSalida = Date.valueOf(fechaSalida);
		this.numAdultos = numAdultos;
		this.numNinos = numNinos;
		this.numCamas = numCamas;
		this.tipoHabitacion = tipoHabitacion;
		this.idCliente = idCliente;
	}
	
	/**
	 * @param idReservacion
	 */
	public ReservacionDAO(int idReservacion) {
		this.idReservacion = idReservacion;
	}

	/**
	 * @return the idReservacion
	 */
	public int getIdReservacion() {
		return idReservacion;
	}

	
	/**
	 * Metodo para agregar una reservacion
	 * @return
	 */
	public boolean registrarReservacion() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connect().createStatement().execute(
					"INSERT INTO reservaciones (fechaLlegada, fechaSalida, numAdultos, numNinos, numCamas, tipoHabitacion, precio, idCliente) VALUES "
					+ "('"+this.fechaLlegada+"','"+this.fechaSalida+"','"+this.numAdultos+"','"+this.numNinos+"','"+this.numCamas
					+"','"+this.tipoHabitacion+"','"+this.precio+"','"+this.idCliente+"')");
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	/**
	 * Metodo para actualizar una reservacion en la Base de Datos
	 * @return true si se actualizo la reservacion de forma exitosa en la BD
	 */
	public boolean actualizarReservacion() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connect().createStatement().execute(
					"UPDATE reservaciones SET "
							+ "fechaLlegada = '"+this.fechaLlegada+"'"
							+ " ,fechaSalida = '"+this.fechaSalida+"'"
							+ " ,numAdultos = "+this.numAdultos
							+ " ,numNinos = "+this.numNinos
							+ " ,numCamas = '"+this.numCamas+"'"
							+ " ,tipoHabitacion = '"+this.tipoHabitacion+"'"
							+ " ,precio = '"+this.precio+"'"
							+ " ,idCliente = "+this.idCliente
							+ " WHERE idReservacion = "+this.idReservacion);
			resultado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	
	/**
	 * @return true si se elimina la reservacion de forma exitosa
	 */
	public boolean eliminarReservacion() {
		boolean resultado = false;
		this.database = new ConexionAWS();
		try {
			this.database.connect().createStatement().execute(
					"DELETE FROM reservaciones WHERE idReservacion = "+this.idReservacion);
			resultado = true;				
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return resultado;
	}
	
	/**
	 * Metodo para obtener el precio aproximado de la estancia
	 * @return precio
	 */
	public double getPrecio() {
		double costoHabitacion = 0.0;
		
		int dias=(int) ((this.fechaSalida.getTime()-this.fechaLlegada.getTime())/86400000);
		
		switch (this.tipoHabitacion) {
			case "Individual":
				costoHabitacion = 900.0;
				this.precio = costoHabitacion * dias;
				break;
			case "Doble":
				costoHabitacion = 1300.0;
				this.precio = costoHabitacion * dias;
				break;
			case "Suite":
				costoHabitacion = 2000.0;
				this.precio = costoHabitacion * dias;
				break;
		}
		
		return this.precio;
	}
	
	/**
	 * Metodo para consultar una reservacion
	 * @param id
	 * @return
	 */
	public Reservacion consultarReservacion(int id) {
		Reservacion reservacion = null;
		this.database = new ConexionAWS();
		try {
			ResultSet rs = this.database.connect().createStatement().executeQuery("SELECT * FROM reservaciones WHERE idReservacion="+id);
			while(rs.next()) {
				reservacion = new Reservacion(rs.getDate("fechaLlegada"),rs.getDate("fechaSalida"),
						rs.getInt("numAdultos"), rs.getInt("numNinos"), rs.getInt("numCamas"), 
						rs.getString("tipoHabitacion"), rs.getDouble("precio"), rs.getInt("idCliente"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return reservacion;
	}
}
