package io.maddennis.mapstruct.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "MapStruct",
                version = "1.0.0",
                description = "Endpoints documentation.\n" +
                        "\n" +
                        "A list of all available endpoints"
        ),
        servers= {
                @Server(
                        url="http://localhost:8080"
                )
        }
)
public class SwaggerConfig {
}
