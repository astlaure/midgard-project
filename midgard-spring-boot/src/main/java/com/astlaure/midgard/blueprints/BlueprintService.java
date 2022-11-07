package com.astlaure.midgard.blueprints;

import com.astlaure.midgard.blueprints.models.BlueprintDto;
import com.astlaure.midgard.blueprints.models.CreateBlueprintDto;
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

    public BlueprintDto create(CreateBlueprintDto dto) {
        var blueprint = Blueprint.builder()
                .name(dto.getName())
                .status(dto.getStatus())
                .secured(dto.isSecured())
                .fields(dto.getFields())
                .build();

        blueprintRepository.save(blueprint);

        return BlueprintDto.builder()
                .id(blueprint.getId())
                .name(blueprint.getName())
                .status(blueprint.getStatus())
                .secured(blueprint.isSecured())
                .fields(blueprint.getFields())
                .build();
    }
}
