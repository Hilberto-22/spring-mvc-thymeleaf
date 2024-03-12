package br.com.spring.curso.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@ComponentScan("br.com.spring.curso")
@EnableWebMvc
public class RootConfig {
}
