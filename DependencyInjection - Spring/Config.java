package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.baeldung.spring")
public class Config {
 
    @Bean("Fiat")
    public Engine engineF() {
        return new FiatEngine();
    }
    
    @Bean("Ferrari")
    public Engine engineFe() {
        return new FerrariEngine();
    }
    
    
}