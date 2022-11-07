package com.astlaure.midgard.blueprints.models;

import com.astlaure.midgard.blueprints.enums.BlueprintStatus;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class BlueprintDto {
    private Long id;
    private String name;
    private BlueprintStatus status;
    private boolean secured;
    private List<BlueprintField> fields;
}
