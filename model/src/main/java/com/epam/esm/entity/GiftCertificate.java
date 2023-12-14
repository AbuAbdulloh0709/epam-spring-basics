package com.epam.esm.entity;

import java.math.BigDecimal;
import java.util.List;

public class GiftCertificate {
    private long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int duration;
    private String createDate;
    private String lastUpdateDate;
    private List<Tag> tags;

    public GiftCertificate() {
    }

    public GiftCertificate(long id, String name, String description, BigDecimal price, int duration, String createDate, String lastUpdateDate, List<Tag> tags) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.duration = duration;
        this.createDate = createDate;
        this.lastUpdateDate = lastUpdateDate;
        this.tags = tags;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(String lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }


    @Override
    public String toString() {
        final StringBuilder result = new StringBuilder("GiftCertificate{");
        result.append("id=").append(id);
        result.append(", name='").append(name).append('\'');
        result.append(", description='").append(description).append('\'');
        result.append(", price=").append(price);
        result.append(", duration=").append(duration);
        result.append(", createDate=").append(createDate);
        result.append(", lastUpdateDate=").append(lastUpdateDate);
        result.append(", tags=").append(tags);
        result.append('}');
        return result.toString();
    }
}
