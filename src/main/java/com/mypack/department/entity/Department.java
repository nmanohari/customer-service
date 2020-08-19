package com.mypack.department.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "DEPARTMENT")
@Data
@ToString
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue
    @Column(name = "deptno")
    private Long id;

    @Column(name = "name")
    private String name;

    private String location;

}
