package com.astlaure.midgard.blueprints;

import com.astlaure.midgard.blueprints.models.CreateBlueprintDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public ResponseEntity<?> postBlueprint(@RequestBody CreateBlueprintDto dto) {
        var blueprint = blueprintService.create(dto);
        return ResponseEntity.status(201).body(blueprint);
    }
}
