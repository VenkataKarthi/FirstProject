import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/Resume_UI Feature")
public class CucumberRunnnerTest {

}