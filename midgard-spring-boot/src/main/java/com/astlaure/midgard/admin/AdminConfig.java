package com.astlaure.midgard.admin;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Import;

@AutoConfiguration
@Import({AdminController.class})
public class AdminConfig { }
