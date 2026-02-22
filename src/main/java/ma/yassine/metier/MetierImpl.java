package ma.yassine.metier;


import ma.yassine.dao.IDao;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author pc
 **/
@Component("metier")
public class MetierImpl implements IMetier {
//    @Autowired @Qualifier("d2")
    private IDao dao;




    public MetierImpl(@Qualifier("d") IDao dao){
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
