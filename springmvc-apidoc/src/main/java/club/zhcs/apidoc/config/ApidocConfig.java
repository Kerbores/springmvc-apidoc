package club.zhcs.apidoc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "club.zhcs.apidoc.controller" })
public class ApidocConfig {

}
