package com.example.Resthal.repositories;

import com.example.Resthal.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(
        path = "repo-prog-languages",
        collectionResourceDescription = @Description("Repository for managing programming languages")
)

public interface ProgrammingLanguageRepo extends JpaRepository<ProgrammingLanguage, Long> {
}
