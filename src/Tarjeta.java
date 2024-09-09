/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis Fernando
 */
public class Tarjeta {
    private int numero;
    private float saldo;
    private boolean activo;
    private float precio;

    // Constructor por defecto
    public Tarjeta() {
        this.numero = 0;
        this.saldo = 0;
        this.activo = false;
        this.precio = 0;
    }

    // Constructor con parámetros
    public Tarjeta(int numero, float saldo, boolean activo, float precio) {
        this.numero = numero;
        this.saldo = saldo;
        this.activo = activo;
        this.precio = precio;
    }

    // Métodos getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // Método para recargar saldo
    public boolean recargar(float monto) {
        if (monto > 0) {
            this.saldo += monto;
            return true;
        }
        return false;
    }

    // Método para consumir saldo
    public boolean consumir() {
        if (this.saldo >= this.precio && this.activo) {
            this.saldo -= this.precio;
            return true;
        }
        return false;
    }
}
