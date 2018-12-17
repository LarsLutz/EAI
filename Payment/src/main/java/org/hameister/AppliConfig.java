package org.hameister;


import javax.inject.Named;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppliConfig {
@Named
static class JerseyConfig extends ResourceConfig {
public JerseyConfig() {

}

@Bean
public RestTemplate restTemplate() {
RestTemplate restTemplate = new RestTemplate();
return restTemplate;
}
}
}
