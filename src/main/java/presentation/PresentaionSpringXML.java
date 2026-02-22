package presentation;

import ma.yassine.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author pc
 **/
public class PresentaionSpringXML {
    public static  void main(String[] args){
        ApplicationContext springContext=new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=(IMetier) springContext.getBean("metier");
////        IMetier metier=springContext.getBean(IMetier.class);
        System.out.println("Résult="+metier.calcul());
    }
}
