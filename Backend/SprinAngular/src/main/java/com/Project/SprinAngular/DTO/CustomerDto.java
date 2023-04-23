package com.Project.SprinAngular.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int mobileNo;
}
