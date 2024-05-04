package com.dailicodework.lakesidehotel.security;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;

@Configuration
public class CorsConfig {
//    private static final Long MAX_AGE = 3600L;
//    private static final int CORS_FILTER_ORDER = -102;
//
//    @Bean
//    public CorsFilter corsFilter() {
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        CorsConfiguration config = new CorsConfiguration();
//        config.setAllowCredentials(true);
//        config.addAllowedOrigin("http://localhost:5173");
//        config.addAllowedOrigin("https://lakeside-hotel-booking.vercel.app");
//        config.setAllowedHeaders(Arrays.asList(
//                HttpHeaders.AUTHORIZATION,
//                HttpHeaders.CONTENT_TYPE,
//                HttpHeaders.ACCEPT));
//        config.setAllowedMethods(Arrays.asList(
//                HttpMethod.GET.name(),
//                HttpMethod.POST.name(),
//                HttpMethod.PUT.name(),
//                HttpMethod.DELETE.name()));
//        config.setMaxAge(MAX_AGE);
//        source.registerCorsConfiguration("/**", config);
//
//        return new CorsFilter(source);
//
//    }
@Bean
public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedMethods(HttpMethod.GET.name(), HttpMethod.POST.name(), HttpMethod.PUT.name(),
                            HttpMethod.OPTIONS.name(), HttpMethod.DELETE.name())
                    .allowedHeaders("*")
                    .allowedOrigins("https://lakeside-hotel-booking.vercel.app",
                            "http://localhost:80/",
                            "https://giatuinhanh.site/",
                            "http://127.0.0.1:5500",
                            "http://localhost:63342",
                            "http://localhost:5174",
                            "http://localhost:5173",
                            "http://localhost:5176",
                            "https://deploy--glittering-dusk-ee3c93.netlify.app",
                            "https://bidbay.netlify.app",
                            "https://bidbay-backup.netlify.app",
                            "https://fashion-bidbay.netlify.app",
                            "https://bidbay-ship-simulator.netlify.app");

        }
    };
}
}
