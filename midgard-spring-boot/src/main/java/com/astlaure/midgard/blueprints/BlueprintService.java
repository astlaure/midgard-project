package com.astlaure.midgard.blueprints;

import org.springframework.stereotype.Service;

@Service
public class BlueprintService {
    private final BlueprintRepository blueprintRepository;

    public BlueprintService(BlueprintRepository blueprintRepository) {
        this.blueprintRepository = blueprintRepository;
    }

    public String getBlueprints() {
        return "blueprints";
    }
}
