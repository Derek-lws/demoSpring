import com.liwenshuo.pojo.Product;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTestProduct {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appletContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) appletContext.getBean("product");
        System.out.println(product);
    }
}
