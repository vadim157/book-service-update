package com.trofimets.springcloud.bookserviceupdate.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "gallerydb")
public class Book {
    @Id
    private String id;
    @NotBlank
    @Size(max = 10)
    private String title;
    private String description;
    private String imageLink;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(description, book.description) && Objects.equals(imageLink, book.imageLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, imageLink);
    }
}
