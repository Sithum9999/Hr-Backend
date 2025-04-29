package org.icet.learn.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @NotBlank
    private Long id;
    @NotBlank
    @Size(max = 100)
    private String name;
    @NotBlank
    @Column(unique = true)
    private String email;
    @NotBlank
    private String department;
    @NotBlank
    private String createdAt;
    @NotBlank
    private String updatedAt;
}
