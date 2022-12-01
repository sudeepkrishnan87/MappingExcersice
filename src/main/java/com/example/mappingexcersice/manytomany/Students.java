package com.example.mappingexcersice.manytomany;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Students {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long student_Id;
    private String studentName;
    @ManyToMany
    @JoinTable(
            name="Teacher_Student",
            joinColumns = @JoinColumn(name="Student_Id"),
            inverseJoinColumns = @JoinColumn(name="Teacher_Id")
    )
    private List<Teachers> teachers=new ArrayList<>();

}
