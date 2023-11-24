package org.msn;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name = "Movie", description = "Movie representation")
public class Movie {

    private Long id;
    @Schema(required = true)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
