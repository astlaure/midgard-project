package com.astlaure.midgard.blueprints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/blueprints")
public class BlueprintController {
    private final BlueprintService blueprintService;

    public BlueprintController(BlueprintService blueprintService) {
        this.blueprintService = blueprintService;
    }

    @GetMapping
    public ResponseEntity<?> getBlueprints() {
        return ResponseEntity.status(200).body(blueprintService.getBlueprints());
    }
}
