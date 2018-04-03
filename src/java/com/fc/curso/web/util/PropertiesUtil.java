
package com.fc.curso.web.util;

import java.util.ResourceBundle;

/**
 *
 * @author NB
 */
public class PropertiesUtil {

    public static String getPropiedad(String clave) {
       //cargamos el archivo  de propiedades
            ResourceBundle rb
                    = ResourceBundle.getBundle("com.fc.curso.web.dao.config-db");
            //obtenemos la propiedad  del archivo
            return rb.getString(clave);
    }
    
}
