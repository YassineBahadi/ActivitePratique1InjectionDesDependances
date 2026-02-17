package Dao;

/**
 * @author pc
 **/
public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version base de données");
        double data=21;
        return data;
    }
}
