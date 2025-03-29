package com.zhopa.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.id.factory.spi.GenerationTypeStrategy;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Collections;
import java.util.List;

@Node
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private List<GrantedAuthority> authority;

    public Users(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
        authority = Collections.singletonList(new SimpleGrantedAuthority("USER"));
    }
}
