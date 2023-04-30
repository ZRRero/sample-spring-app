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
public class Book {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @Column
    private String title;
    @Column
    private String description;
    @Column(name = "cover_image_url")
    private String coverImageUrl;
    @Column(name = "published_date")
    private Date publishedDate;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
