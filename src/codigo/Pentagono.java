/*
 * Esta clase dibuja Pentagonos
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Junior
 */
public class Pentagono extends Polygon {

    public Color color = null;
    public boolean relleno = false;

    public Pentagono(int _posX, int _posY, int _altura, Color _color, boolean _relleno) {
        
        this.npoints = 5;
        int radio = 40;
        for (int i = 0; i < 4; i++) {
            xpoints[i] = (int) (140 + radio * Math.cos(2 * Math.PI * (i + 40) / npoints));
            ypoints[i] = (int) (320 + radio * Math.sin(2 * Math.PI * (i + 40) / npoints));
        }

        int puntoX;
        int puntoY;

        for (int i = 4; i < 5; i++) {

            puntoX = (int) (140 + radio * Math.cos(2 * Math.PI * (i + 40) / npoints));
            puntoY = (int) (320 + radio * Math.sin(2 * Math.PI * (i + 40) / npoints));
            addPoint(puntoX, puntoY);
                
            
        }

        color = _color;
        relleno = _relleno;
    }

    public void dibujate(Graphics2D g2, int _posY) {

        g2.setColor(color);
        if (relleno) {
            g2.fill(this);
        } else {
            g2.draw(this);
        }
    }

}
