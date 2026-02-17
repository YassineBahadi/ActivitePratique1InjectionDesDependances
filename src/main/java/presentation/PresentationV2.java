package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author pc
 **/
public class PresentationV2 {
//    FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
    public static void main(String[]args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao= (IDao) cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

//        IMetier metier= (IMetier) cMetier.newInstance();
//        Method setDao=cMetier.getDeclaredMethod("setDao",IDao.class);
//        setDao.invoke(metier,dao);

        System.out.println(metier.calcul());

    }
}
