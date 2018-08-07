package br.com.raphamendonca.springmvc.web.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.raphamendonca.springmvc.web.controller.ProdutoController;

@EnableWebMvc
@ComponentScan(basePackageClasses={ProdutoController.class})
public class AppWebConfiguration {

	
	@Bean
    public InternalResourceViewResolver internalResourceViewResolve() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
}
