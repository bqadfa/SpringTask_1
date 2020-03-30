
import model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);



        Middle middleBean = applicationContext.getBean(Middle.class);

        Child childBean = applicationContext.getBean(Child.class);

        System.out.println(middleBean.getParent().getName());

        System.out.println(childBean.getMiddle().getParent().getName());
    }

}
