
package com.concesionario.automovil;

import com.concesionario.automovil.igu.Principal;

public class Automovil {

    public static void main(String[] args) {
        
        //Llamado a IGU
        Principal princ = new Principal();
        //Lo hago visible
        princ.setVisible(true);
        //Lo localizo en el centro
        princ.setLocationRelativeTo(null);
    }
}
