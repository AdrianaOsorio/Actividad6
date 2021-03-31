package actividad6;

public class Paciente extends Medico{
    
    private String codigo, getApellidosPacientes, nombresPacientes, sexo, dirección, residencia, lugarAtendido, motivoConsulta, nombreMedico, fecha;

    public Paciente(){
       
    }

    public Paciente(String codigo, String getApellidosPacientes, String nombresPacientes, String sexo, String dirección, String residencia, String lugarAtendido, String motivoConsulta, String nombreMedico, String fecha) {
        this.codigo = codigo;
        this.getApellidosPacientes = getApellidosPacientes;
        this.nombresPacientes = nombresPacientes;
        this.sexo = sexo;
        this.dirección = dirección;
        this.residencia = residencia;
        this.lugarAtendido = lugarAtendido;
        this.motivoConsulta = motivoConsulta;
        this.nombreMedico = nombreMedico;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getApellidosPacientes() {
        return getApellidosPacientes;
    }

    public void setApellidosPacientes(String getApellidosPacientes) {
        this.getApellidosPacientes = getApellidosPacientes;
    }

    public String getNombresPacientes() {
        return nombresPacientes;
    }

    public void setNombresPacientes(String nombresPacientes) {
        this.nombresPacientes = nombresPacientes;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getLugarAtendido() {
        return lugarAtendido;
    }

    public void setLugarAtendido(String lugarAtendido) {
        this.lugarAtendido = lugarAtendido;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}