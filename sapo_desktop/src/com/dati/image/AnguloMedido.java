package com.dati.image;
import java.awt.Point;
//import java.io.Serializable;

/*
 * Created on 27/01/2005 - Puig
 *
 * Esta classe cont�m as coordenadas, denomina��o,
 * designa��o gen�rica, valor do �ngulo, tipo do �ngulo 
 * e outras informa��es do �ngulo medido.
 * 
 */

public class AnguloMedido /*implements Serializable*/ {
    public Point p[] = new Point[5];
    public String nome = new String();
    public String generico = new String(); // designa��o gen�rica
    public double angulo;
    public int tipo;
    public boolean apresenta;
}