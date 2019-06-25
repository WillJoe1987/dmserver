package configs;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;  
  
@Configuration  
public class CorsConfig {  

	public CorsConfig(){
		System.out.println("used================================================");
	}
    
    @Bean
	public WebMvcConfigurer corsConfigurer() {
    	return new WebMvcConfigurer() {
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")  
                .allowedOrigins("*")  
                .allowCredentials(true)  
                .allowedMethods("GET", "POST", "DELETE", "PUT").allowedHeaders("*")
                .maxAge(3600);  
			}
		};
	}
}