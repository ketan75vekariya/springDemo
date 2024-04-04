import org.springdemo.car.Corolla;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springdemo.car.Swift;
import org.springdemo.engine.EngineType;

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
	@Bean("unknownEngine")
	public EngineType type() {
		return new EngineType();
	}
	@Bean("V8Engine")
	public EngineType v8type() {
		return new EngineType("V8 Engine type");
	}
}
