package presentation;

import ma.yassine.dao.IDao;
import ma.yassine.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pc
 **/
public class PresentationSpringAnnotation {
    public static void main(String [] args){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("ma.yassine");
        IMetier metier=(IMetier) applicationContext.getBean("metier");
        System.out.println("Result="+metier.calcul());

    }
}
