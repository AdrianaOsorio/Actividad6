package actividad6;

public class CentroDeServicio extends Paciente{
    
    private String nombreCentroServicio;

    public CentroDeServicio() {
    }

    public CentroDeServicio(String nombreCentroServicio) {
        this.nombreCentroServicio = nombreCentroServicio;
    }
    
    public String getNombreCentroServicio() {
        return nombreCentroServicio;
    }

    public void setNombreCentroServicio(String nombreCentroServicio) {
        this.nombreCentroServicio = nombreCentroServicio;
    }
      
}