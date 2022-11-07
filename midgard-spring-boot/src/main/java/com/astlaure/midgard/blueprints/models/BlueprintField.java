package com.astlaure.midgard.blueprints.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BlueprintField {
    private String name;

    private String type;

    private boolean nullable;

    private boolean unique;

    private int length;
}
