/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Junior
 */
public class Circulo extends Forma {

    public Circulo(int _posX, int _posY, Color _color, boolean _relleno) {
        //Inicializa el constructor del triengulo correctamente que guarde 3 lados
        super(_posX, _posY, 1000, _color, _relleno);

    }
}
