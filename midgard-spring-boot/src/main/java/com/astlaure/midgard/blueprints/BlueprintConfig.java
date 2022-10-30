package com.astlaure.midgard.blueprints;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan
@AutoConfiguration
@EnableJpaRepositories
@Import({BlueprintController.class, BlueprintService.class})
public class BlueprintConfig { }
