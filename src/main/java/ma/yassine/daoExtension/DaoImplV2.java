package ma.yassine.daoExtension;

import ma.yassine.dao.IDao;
import org.springframework.stereotype.Component;

/**
 * @author pc
 **/
@Component("d2")
public class DaoImplV2 implements IDao {
    public double getData(){
        System.out.println("Version capteur");
        double data=40;
        return data;
    }
}
