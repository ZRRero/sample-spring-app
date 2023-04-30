package com.zrrero.books.repositories;

import com.zrrero.books.domain.entities.Author;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "authors", path = "authors")
public interface IAuthorRepository extends PagingAndSortingRepository<Author, UUID> {
}
