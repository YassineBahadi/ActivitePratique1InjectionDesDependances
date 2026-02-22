package ma.yassine.dao;

import org.springframework.stereotype.Component;

/**
 * @author pc
 **/
@Component("d")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double data=21;
        return data;
    }
}
