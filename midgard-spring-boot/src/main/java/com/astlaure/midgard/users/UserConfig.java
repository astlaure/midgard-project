package com.astlaure.midgard.users;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan
@AutoConfiguration
@EnableJpaRepositories
@Import({UserController.class, UserService.class})
public class UserConfig { }

