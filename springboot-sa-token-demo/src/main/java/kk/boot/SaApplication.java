package kk.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * Hello world!
 *
 * @author Hello
 */
@Slf4j
@SpringBootApplication
public class SaApplication
{
    public static void main( String[] args )
    {

        SpringApplication springApplication = new SpringApplication(SaApplication.class);
        ConfigurableApplicationContext context = springApplication.run(args);
        Environment env = context.getEnvironment();
        log.info("""
                        
                        ----------------------------------------------------------
                        Application is running! Access URLs:
                        Local:    http://localhost:{}
                        Doc:      http://localhost:{}/doc.html
                        ----------------------------------------------------------""",
                env.getProperty("server.port"),
                env.getProperty("server.port"));
    }
}
