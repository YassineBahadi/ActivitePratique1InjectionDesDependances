package Presentation;

import Dao.IDaoImpl;
import Metier.IMetier;
import Metier.IMetierImpl;

/**
 * @author pc
 **/
public class PresentationV1 {
    public static void main(String []args){
        IMetierImpl metier=new IMetierImpl();
        metier.setDao(new IDaoImpl());
        System.out.println(metier.calcul());
    }
}
