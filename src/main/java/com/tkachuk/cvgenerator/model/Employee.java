package com.tkachuk.cvgenerator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Just a POJO representing employee's entity.
 */

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private String firstName;
    private String lastName;
    private Integer age;
    private String goal;
    private String experiences;
}
