package com.Project.SprinAngular.DTO;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerSaveDto {
    private String customerName;
    private String customerAddress;
    private int mobileNo;
}
