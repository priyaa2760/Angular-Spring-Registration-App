package com.Project.SprinAngular.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerUpdateDto {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int mobileNo;
}
