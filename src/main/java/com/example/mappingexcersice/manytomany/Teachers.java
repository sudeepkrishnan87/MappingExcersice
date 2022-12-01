package com.example.mappingexcersice.manytomany;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
public class Teachers {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teacherId;
    private String teacherName;
    @ManyToMany(mappedBy = "teachers")
    private List<Students> students=new ArrayList<>();
}
