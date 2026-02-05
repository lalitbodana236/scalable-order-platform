package com.platform.product.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseModel {
    @JsonIgnore
    private Long id;
    private Date createdAt;
    private Date lastModifiedAt;
}
