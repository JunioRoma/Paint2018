/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author xp
 */
public class Cuadrado extends Rectangle2D.Double {

    public Color color = null;
    public boolean relleno = false;

    public Cuadrado (int _posX, int _posY, int _lado, Color _color, boolean _relleno){
        super();
        //guardo las coordenadas de inicio del Cuadrado
        x = _posX; 
        y = _posY;
        width = _lado;
        height = _lado;
        color = _color;
        relleno = _relleno;
    }
    
     
    public void dibujate(Graphics2D g2, int _posX){
                //redibujas el Cuadrado
        int lado = Math.abs( (int) x - _posX);
        width = lado;
        height = lado; 
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }
        else {
            g2.draw(this);
        }
    }
    
    
    
    
    
}
