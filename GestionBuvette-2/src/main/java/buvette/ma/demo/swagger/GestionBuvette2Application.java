package buvette.ma.demo.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;



@SpringBootApplication
//@EnableSwagger2
@OpenAPIDefinition(info = @Info(title = "UniRegal App", version = "2.0", description = "Gestion de buvette"))
@SecurityScheme(name = "UniRegal", scheme = "basic", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class GestionBuvette2Application {

	/*
	 * @Bean public Docket api(){ return new Docket(DocumentationType.SWAGGER_2)
	 * .select()
	 * .apis(RequestHandlerSelectors.basePackage("buvette.ma.demo.swagger"))
	 * .build(); }
	 */
    
	public static void main(String[] args) {
		SpringApplication.run(GestionBuvette2Application.class, args);
	}

}
