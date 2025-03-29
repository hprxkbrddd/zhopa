package com.zhopa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@AllArgsConstructor
@Getter
@Setter
@Node
public class Task {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Boolean completed;

    public Task(){}
}
