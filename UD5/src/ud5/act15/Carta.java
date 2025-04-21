/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ud5.act15;

/**
 *
 * @author usuario
 */
public class Carta {

    private int valor; // 1-13
    private Palo palo;

    public Carta(int valor, Palo palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public int getValor() {
        return valor;
    }

    public Palo getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        String nombreValor;
        switch (valor) {
            case 1:
                nombreValor = "As";
                break;
            case 11:
                nombreValor = "J";
                break;
            case 12:
                nombreValor = "Q";
                break;
            case 13:
                nombreValor = "K";
                break;
            default:
                nombreValor = String.valueOf(valor);
        }
        return nombreValor + " de " + palo;
    }
}
