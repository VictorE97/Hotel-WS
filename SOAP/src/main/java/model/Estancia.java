package model;

import java.util.Date;

public class Estancia {
	private int idEstancia;
	private int numHabitacion;
	private int numPersonas;
	private double precio;
	private Date fechaCheckIn;
	private Date fechaCheckOut;
	private int idCliente;
	private String status;
	private String tipoHabitacion;
	
	
	public Estancia() {}
	/**
	 * @param idEstancia
	 * @param numHabitacion
	 * @param numPersonas
	 * @param precio
	 * @param fechaCheckIn
	 * @param fechaCheckOut
	 * @param idCliente
	 */
	public Estancia(int idEstancia, int numHabitacion, int numPersonas, double precio, Date fechaCheckIn,
			Date fechaCheckOut, String status, String tipoHabitacion, int idCliente) {
		this.idEstancia = idEstancia;
		this.numHabitacion = numHabitacion;
		this.numPersonas = numPersonas;
		this.precio = precio;
		this.fechaCheckIn = fechaCheckIn;
		this.fechaCheckOut = fechaCheckOut;
		this.status = status;
		this.tipoHabitacion = tipoHabitacion;
		this.idCliente = idCliente;
	}
	
	/**
	 * 
	 * @param numHabitacion
	 * @param numPersonas
	 * @param precio
	 * @param fechaCheckIn
	 * @param fechaCheckOut
	 * @param status
	 * @param tipoHabitacion
	 * @param idCliente
	 */
	public Estancia(int numHabitacion, int numPersonas, double precio, Date fechaCheckIn,
			Date fechaCheckOut, String status, String tipoHabitacion, int idCliente) {
		this.numHabitacion = numHabitacion;
		this.numPersonas = numPersonas;
		this.precio = precio;
		this.fechaCheckIn = fechaCheckIn;
		this.fechaCheckOut = fechaCheckOut;
		this.idCliente = idCliente;
	}
	
	/**
	 * 
	 * @param idEstancia
	 */
	public Estancia(int idEstancia) {
		this.idEstancia = idEstancia;
	}
	
	/**
	 * 
	 * @param idEstancia
	 * @param fechaCheckOut
	 */
	public Estancia(int idEstancia, Date fechaCheckOut) {
		this.idEstancia = idEstancia;
		this.fechaCheckOut = fechaCheckOut;
	}
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the tipoHabitacion
	 */
	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	/**
	 * @param tipoHabitacion the tipoHabitacion to set
	 */
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	/**
	 * @return the idEstancia
	 */
	public int getIdEstancia() {
		return idEstancia;
	}

	/**
	 * @param idEstancia the idEstancia to set
	 */
	public void setIdEstancia(int idEstancia) {
		this.idEstancia = idEstancia;
	}

	/**
	 * @return the numHabitacion
	 */
	public int getNumHabitacion() {
		return numHabitacion;
	}

	/**
	 * @param numHabitacion the numHabitacion to set
	 */
	public void setNumHabitacion(int numHabitacion) {
		this.numHabitacion = numHabitacion;
	}

	/**
	 * @return the numPersonas
	 */
	public int getNumPersonas() {
		return numPersonas;
	}

	/**
	 * @param numPersonas the numPersonas to set
	 */
	public void setNumPersonas(int numPersonas) {
		this.numPersonas = numPersonas;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the fechaCheckIn
	 */
	public Date getFechaCheckIn() {
		return fechaCheckIn;
	}

	/**
	 * @param fechaCheckIn the fechaCheckIn to set
	 */
	public void setFechaCheckIn(Date fechaCheckIn) {
		this.fechaCheckIn = fechaCheckIn;
	}

	/**
	 * @return the fechaCheckOut
	 */
	public Date getFechaCheckOut() {
		return fechaCheckOut;
	}

	/**
	 * @param fechaCheckOut the fechaCheckOut to set
	 */
	public void setFechaCheckOut(Date fechaCheckOut) {
		this.fechaCheckOut = fechaCheckOut;
	}

	/**
	 * @return the idCliente
	 */
	public int getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	
	
}
