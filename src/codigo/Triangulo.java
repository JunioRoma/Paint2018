/*
 * Esta clase dibuja triangulos
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Junior
 */
public class Triangulo extends Polygon {

    public Color color = null;
    public boolean relleno = false;

    public Triangulo(int _posX, int _posY, int _altura, Color _color, boolean _relleno) {

        this.npoints = 3;

        //primera coordenada del triangulo , el punto X0,Y0
        xpoints[0] = _posX;
        ypoints[0] = _posY;

        //escribo las "Y" q coinciden con el valor de las alturas
        ypoints[1] = _posY + _altura;
        ypoints[2] = _posY + _altura;

        int mediaBase = (int) (_altura / Math.tan(Math.toRadians(60)));

        xpoints[1] = _posX + mediaBase;
        xpoints[2] = _posX - mediaBase;

        color = _color;
        relleno = _relleno;
    }

    public void dibujate(Graphics2D g2, int _posY) {
        //redibujas el Triangulo
        int altura = Math.abs((int) ypoints[0] - _posY);

        ypoints[1] = _posY + altura;
        ypoints[2] = _posY + altura;

        int mediaBase = (int) (altura / Math.sin(Math.toRadians(60)));

        xpoints[1] = xpoints[0] + mediaBase;
        xpoints[2] = xpoints[0] - mediaBase;

        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }

}
