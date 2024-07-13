package com.adena.api_gateway;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CorsGlobalConfiguration {


//    @Bean
//    public CorsWebFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOriginPattern("http://localhost:*"); // Change this to specific origins for better security
//        config.addAllowedHeader("*");
//        config.addAllowedMethod("*");
//        source.registerCorsConfiguration("/**", config);
//        return new CorsWebFilter(source);
//    }
}
