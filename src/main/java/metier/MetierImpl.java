package metier;

import dao.IDao;

/**
 * @author pc
 **/
public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(){}



    public MetierImpl(IDao dao){
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
