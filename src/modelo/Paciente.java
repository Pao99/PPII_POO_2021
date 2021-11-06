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
public class Paciente extends Persona {
  private LocalDate fechaNacimiento;
  private String nacionalidad;
  private Lista<Integer> telefono;
  private Lista<Cita> misCitas;
  private Lista<Vacuna> misVacunas;
}
