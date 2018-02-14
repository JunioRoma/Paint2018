/*
 * La clase Forma es la parte comun de todas las formas regulares que dibuja el programa
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Junior
 */
public class Forma extends Polygon {

    public Color color = null;
    public boolean relleno = false;

    //Coordenadas del centro de la forma
    public int x = 0;
    public int y = 0;

    public Forma(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        //Inicializa el constructor del triengulo correctamente que guarde 3 lados
        super(new int[_lados], new int[_lados], _lados);
        //guardo el centro de la forma
        x = _posX;
        y = _posY;

        color = _color;
        relleno = _relleno;
    }
    
    public void dibujate(Graphics2D g2, int _posY) {

        calculaVertices(y - _posY);
        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }

    //recalcula la posicion de los vertices en un poligono regular
    private void calculaVertices(int _radio) {
        for (int i = 0; i < npoints; i++) {
            xpoints[i] = (int) (x + _radio * Math.cos(2 * Math.PI * i / npoints));
            ypoints[i] = (int) (y + _radio * Math.sin(2 * Math.PI * i / npoints));
        }
    }
}
