package com.example.mappingexcersice.onetomany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subid;

    private String subjectName;
    @ManyToOne
    @JoinColumn(name="CID",referencedColumnName = "courseID")
    private Course course;
}
