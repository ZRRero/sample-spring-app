package com.zrrero.books.domain.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "books")
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class Author {
    @Column
    @Id
    @GeneratedValue
    private UUID id;
    @Column
    private String name;
    @Column
    private String nationality;
    @Column(name = "birth_date")
    private Date birthDate;
    @Column(name = "death_date")
    private Date deathDate;
}
