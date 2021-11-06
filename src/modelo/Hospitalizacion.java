/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import estructuras.*;

/**
 *
 * @author pedro2
 */
public class Hospitalizacion {
  private LocalDate fechaInicio;
  private LocalDate fechaFinal;
  private Lista<Seguimiento> seguimientoPaciente;
  private CentroAtencion centroAtencion;
}
