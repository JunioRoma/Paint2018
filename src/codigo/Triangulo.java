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
public class Triangulo extends Forma {

   

    public Triangulo(int _posX, int _posY, Color _color, boolean _relleno) {
        //Inicializa el constructor del triengulo correctamente que guarde 3 lados
        super(_posX, _posY, 3 ,_color, _relleno);
        
    }

    

}
