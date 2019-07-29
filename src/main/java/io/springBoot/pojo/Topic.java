package io.springBoot.pojo;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Getter
@Setter
@Entity
public class Topic {
    public Topic(Long id, String summary, String description) {
        this.visit_id = id;
        this.summary = summary;
        this.description = description;
    }

    public Topic()
    {

    }


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long visit_id;
    private String summary;
    private String description;
}
