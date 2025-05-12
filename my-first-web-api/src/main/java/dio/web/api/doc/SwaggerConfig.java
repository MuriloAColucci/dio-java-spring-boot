package dio.web.api.doc;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI(){
        OpenAPI openAPI = new OpenAPI();

        openAPI.info(new Info().title("Title - Rest API")
                .description("API exemplo de uso de Springboot REST API")
                .version("1.0"));

        return openAPI;
    }
}
