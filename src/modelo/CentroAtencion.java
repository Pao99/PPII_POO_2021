package modelo;

public class CentroAtencion {
  private int codigo;
  private String nombre;
  private String tipoCentro;
  private int capacidadMaxima;
  private Direccion direccion;
  
  public CentroAtencion(int pCodigo, String pNombre, String pTipoCentro, int pCapMax,
                        Direccion pDireccion) {
    codigo = pCodigo;
    nombre = pNombre;
    tipoCentro = pTipoCentro;
    capacidadMaxima = pCapMax;
    direccion = pDireccion;
  }
  
  
  
}
