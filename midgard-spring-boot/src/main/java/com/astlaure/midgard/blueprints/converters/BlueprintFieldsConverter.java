package com.astlaure.midgard.blueprints.converters;

import com.astlaure.midgard.blueprints.models.BlueprintField;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.AttributeConverter;
import java.util.List;

public class BlueprintFieldsConverter implements AttributeConverter<List<BlueprintField>, String> {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final Logger logger = LoggerFactory.getLogger(BlueprintFieldsConverter.class);

    @Override
    public String convertToDatabaseColumn(List<BlueprintField> blueprintFields) {
        try {
            return objectMapper.writeValueAsString(blueprintFields);
        } catch (JsonProcessingException ex) {
            logger.error(ex.getMessage());
        }
        return null;
    }

    @Override
    public List<BlueprintField> convertToEntityAttribute(String json) {
        try {
            return objectMapper.readValue(json, new TypeReference<>() {});
        } catch (JsonProcessingException ex) {
            logger.error(ex.getMessage());
        }
        return null;
    }
}
