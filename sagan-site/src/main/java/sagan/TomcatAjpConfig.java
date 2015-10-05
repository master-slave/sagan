package sagan;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TomcatAjpConfig {

    private static Connector createConnector() {
        Connector connector = new Connector("AJP/1.3");
        connector.setPort(8010);
        return connector;
    }

    @Bean
    @SuppressWarnings("static-method")
    public EmbeddedServletContainerFactory servletContainer() {
        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
        tomcat.addAdditionalTomcatConnectors(createConnector());
        tomcat.setPort(8081);
        return tomcat;
    }

}