package com.astlaure.midgard.auth;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@AutoConfiguration
@Import({AuthController.class})
public class AuthConfig {

    @Bean
    @ConditionalOnMissingBean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    @ConditionalOnMissingBean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf(csrf -> csrf
                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                )
                .authorizeHttpRequests(http -> http
                        .antMatchers("/api/v1/**").authenticated()
                        .antMatchers("/admin/**").authenticated()
                        .anyRequest().permitAll()
                )
                .sessionManagement(session -> session
                        .invalidSessionUrl("/login")
                )
                .formLogin(login -> login
                        .loginPage("/login")
                        .successForwardUrl("/login/success")
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/")
                )
                .rememberMe(remember -> remember
                        .key("keyboard-cat")
                );
        return httpSecurity.build();
    }
}
