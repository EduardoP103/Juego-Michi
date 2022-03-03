/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_clases;

/**
 *
 * @author DIA
 */
public class JuegoAlquilado {

    private Jugador jugador;
    private Juego juego;
    private Fecha fechaAlquiler;
    private int totalDiasAlquiler;

    public JuegoAlquilado(Jugador cliente, Juego juego, Fecha fechaAlquiler, int totalDiasAlquiler) {
        this.jugador = cliente;
        this.juego = juego;
        this.fechaAlquiler = fechaAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setCliente(Jugador jugador) {
        this.jugador = jugador;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public Fecha getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(Fecha fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }

    public void imprimirPrecioTotalAlquiler() {
        System.out.println("El precio total a pagar por el alquiler del juego es: " + this.juego.getTarifa() * this.totalDiasAlquiler);
    }

}
