
package com.fc.curso.web.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    
    public static Date  getFechaActual(){
        //Obtenemos un objeto  calendar para resetearlo
        Calendar cActual =  Calendar.getInstance();
        cActual.clear();
        
        //Obtenemos la fecha actual
        Calendar  cTemporal = Calendar.getInstance();
        
        //Pasamos el año, mes día para obtener unicamente la fecha actual
        cActual.set(cTemporal.get(Calendar.YEAR),
                        cTemporal.get(Calendar.MONTH),
                        cTemporal.get(Calendar.DAY_OF_MONTH));
        return cActual.getTime();   
    }
    
    public static boolean esMayorFchActual(Date fchBase){
        //Obtenemos la fecha actual
        Date d = getFechaActual();
        
        //Comparamos la fecha base si es mayor a la actual
        boolean b = fchBase.compareTo(d) > 0;
        
        return b;
    }
    
    public static boolean  esIgualFchActual(Date fchBase){
        //Obtenemos las fecha actual
        Date d =  getFechaActual();
        
        //Comparamos la fecha base  si es igual a la actual
        boolean b = fchBase.compareTo(d)== 0;
        
        return b;
    }
    
}
