import org.springdemo.car.Corolla;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springdemo.car.Swift;
import org.springdemo.engine.V6;
import org.springdemo.engine.V8;

@Configuration
@ComponentScan("org.springdemo")

/*use this class just for component scanning 
 * Annotation 'ComponentScan' scan the entire package which we mentioned in annotation
 * and get beans of the classes
 */
public class AppConfig {
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	@Bean("swift")
	public Swift Swift() {
		return new Swift();
	}
	@Bean("v6")
	public V6 v6() {
		return new V6();
	}
	@Bean("v8")
	public V8 v8() {
		return new V8();
	}
}
