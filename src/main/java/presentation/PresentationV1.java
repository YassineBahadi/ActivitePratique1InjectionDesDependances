package presentation;

import ma.yassine.dao.DaoImpl;
import ma.yassine.dao.IDao;
import ma.yassine.metier.MetierImpl;

/**
 * @author pc
 **/
public class PresentationV1 {
    public static void main(String []args){
        IDao dao=new DaoImpl();
        MetierImpl metier=new MetierImpl(dao);
//        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
