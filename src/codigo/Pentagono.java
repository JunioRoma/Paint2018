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
public class Pentagono extends Forma {

    public Pentagono(int _posX, int _posY, Color _color, boolean _relleno) {
        //Inicializa el constructor del pentagono correctamente que guarde 5 lados
        super(_posX, _posY, 5 ,_color, _relleno);
        
    }
}
