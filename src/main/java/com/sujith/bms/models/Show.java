package com.sujith.bms.models;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

import com.sujith.bms.models.enums.Feature;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
    @ManyToOne
    private Movie movie;
    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Auditorium auditorium;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Feature> showFeatures;
}
