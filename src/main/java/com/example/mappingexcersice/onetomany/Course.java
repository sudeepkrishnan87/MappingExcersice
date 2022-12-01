package com.example.mappingexcersice.onetomany;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Course {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long courseID;
    @Getter
    @Setter
    private String courseName;
    @Getter
    @Setter
    @OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
    public List<Subjects> subjects=new ArrayList<>();

}
