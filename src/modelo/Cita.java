/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import estructuras.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author pedro2
 */
public class Cita {
  private String especialidad; 
  private LocalDateTime citaFechaHora;
  private String observacion; 
  private int idCita;
  private Lista<EstadoBitacoraCita> bitacora;
  
  public Cita(String pEspecialidad, LocalDateTime pCitaFechaHora, String pObservacion, int pIdCita, Lista<EstadoBitacoraCita> pBitacora) {
    this.especialidad = pEspecialidad;
    this.citaFechaHora = pCitaFechaHora;
    this.observacion = pObservacion;
    this.idCita = pIdCita;
    this.bitacora = pBitacora;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public LocalDateTime getCitaFechaHora() {
    return citaFechaHora;
  }

  public String getObservacion() {
    return observacion;
  }

  public int getIdCita() {
    return idCita;
  }

  public Lista<EstadoBitacoraCita> getBitacora() {
    return bitacora;
  }
  
  
  
}
