import org.springdemo.carInterface.Car;
import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//This is our main method class
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
		Car myCar = context.getBean("corolla",Car.class);
		myCar.spece();
		context.close();
	} catch (BeansException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	}

}
