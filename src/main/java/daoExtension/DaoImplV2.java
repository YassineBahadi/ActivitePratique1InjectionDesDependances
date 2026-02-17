package daoExtension;

import dao.IDao;

/**
 * @author pc
 **/
public class DaoImplV2 implements IDao {
    public double getData(){
        System.out.println("Version capteur");
        double data=40;
        return data;
    }
}
