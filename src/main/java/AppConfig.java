import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.springdemo")

/*use this class just for component scanning 
 * Annotation 'ComponentScan' scan the entire package which we mentioned in annotation
 * and get beans of the classes
 */
public class AppConfig {

}
