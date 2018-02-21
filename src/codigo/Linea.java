/*
 * Esta clase dibuja Lineas
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Junior
 */
public class Linea extends Forma {

    public Linea(int _posX, int _posY, Color _color, boolean _relleno) {
        //Inicializa el constructor de la linea con 2 lados.
        super(_posX, _posY, 2 ,_color, _relleno);
        
    }
}
