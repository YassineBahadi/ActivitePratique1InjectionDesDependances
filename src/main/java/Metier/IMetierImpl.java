package Metier;

import Dao.IDao;

/**
 * @author pc
 **/
public class IMetierImpl implements IMetier {
    private IDao dao;

    public IMetierImpl(){}

    public IMetierImpl(IDao dao){
        this.dao=dao;
    }

    public double calcul(){
        double data=dao.getData();
        return data*2;
    }

    public void setDao(IDao dao){
        this.dao=dao;
    }
}
