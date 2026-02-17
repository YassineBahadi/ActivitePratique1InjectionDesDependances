package presentation;

import dao.DaoImpl;
import dao.IDao;
import daoExtension.DaoImplV2;
import metier.MetierImpl;

/**
 * @author pc
 **/
public class PresentationV1 {
    public static void main(String []args){
        IDao dao=new DaoImpl();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println(metier.calcul());
    }
}
