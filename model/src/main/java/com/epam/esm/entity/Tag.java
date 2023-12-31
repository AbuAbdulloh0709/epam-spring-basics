package com.epam.esm.entity;

public class Tag {
    private long id;
    private String name;

    public Tag() {
    }

    public Tag(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder("Tag{");
        result.append("id=").append(id);
        result.append(", name='").append(name).append('\'');
        result.append('}');
        return result.toString();
    }
}
