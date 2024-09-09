/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Fernando
 */

public class Usuario {
    private String paterno;
    private String materno;
    private String nombres;
    private String documento;
    private String tipoDocumento;

    // Constructor por defecto
    public Usuario() {
        this.paterno = "";
        this.materno = "";
        this.nombres = "";
        this.documento = "";
        this.tipoDocumento = "";
    }

    // Constructor con parámetros
    public Usuario(String paterno, String materno, String nombres, String documento, String tipoDocumento) {
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
    }

    // Métodos getters y setters
    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    // Método para recargar
    public boolean recargar(float monto) {
        return monto > 0;
    }

    // Método para consumir
    public boolean consumir() {
        return true; // Asume una operación de consumo exitosa
    }
}
