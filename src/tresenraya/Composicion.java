/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tresenraya;

import pack_clases.Jugador;
import pack_clases.Fecha;
import pack_clases.Juego;
import pack_clases.JuegoAlquilado;

/**
 *
 * @author EDUARDO PASTOR
 */
public class Composicion {
    
    public static void main(String[] args) {
        Juego juego1= new Juego("001", "Juego de Mesa", "TresEnRaya", "Azul", 5, true);
        Juego juego2= new Juego("002", "Juego de Disparos", "Derriba el muñeco", "Rojo",30,true);
        
        Jugador jugador1= new Jugador("75594937", "Eduardo Javier","Pastor Romero");
        
        Fecha fechaAlquiler1=new Fecha(13,12,2021);
        
        JuegoAlquilado alquiler1= new JuegoAlquilado(jugador1, juego1, fechaAlquiler1, 10);
        
        System.out.println("Jugador DNI: "+alquiler1.getJugador().getDni());
        System.out.println("Jugador Nombres y apellidos: "+alquiler1.getJugador().getNombre()+""+alquiler1.getJugador().getApellidos());
        System.out.println("Numero del Juego alquilado: "+alquiler1.getJuego().getNumero());
        alquiler1.imprimirPrecioTotalAlquiler();
        
    }
    
}
