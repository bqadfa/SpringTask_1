import model.Child;
import model.Config;
import model.Middle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);


        Middle middleBean = applicationContext.getBean(Middle.class);

        Child childBean = applicationContext.getBean(Child.class);

        System.out.println(middleBean.getParentOfMiddle().getName());

        System.out.println(childBean.getMiddle().getParentOfMiddle().getName());
    }

}
