package com.zrrero.books.repositories;

import com.zrrero.books.domain.entities.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "books", path = "books")
public interface IBookRepository extends PagingAndSortingRepository<UUID, Book> {
}
