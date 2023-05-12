package com.example.demo.relacionamentos;

import com.example.demo.BaseEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Categoria extends BaseEntity {

    @OneToMany(mappedBy = "categoria")
    private Set<Produto> produtos = new HashSet<>();

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date createdAt;
}
