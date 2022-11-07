package com.astlaure.midgard.blueprints;

import com.astlaure.midgard.blueprints.converters.BlueprintFieldsConverter;
import com.astlaure.midgard.blueprints.enums.BlueprintStatus;
import com.astlaure.midgard.blueprints.models.BlueprintField;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "blueprints")
public class Blueprint {
    @Id
    @EqualsAndHashCode.Exclude
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Builder.Default
    @Enumerated(EnumType.STRING)
    private BlueprintStatus status = BlueprintStatus.DRAFT;

    @Builder.Default
    private boolean secured = false;

    @Column(columnDefinition = "json")
    @Convert(converter = BlueprintFieldsConverter.class)
    private List<BlueprintField> fields;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime updatedAt;
}

