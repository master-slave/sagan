package sagan;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * The entry point for the Sagan web application.
 */
public class SiteMain extends SpringBootServletInitializer {

    public static void main(String[] args) {
        new SaganApplication(SiteConfig.class).run(args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        // Customize the application or call application.sources(...) to add sources
        // Since our example is itself a @Configuration class we actually don't
        // need to override this method.
        return application.sources(SiteMain.class);
    }
}
