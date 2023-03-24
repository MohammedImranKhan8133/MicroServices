package com.imran.userservice.vo;

import com.imran.userservice.entity.UserDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private UserDetail UserDetail;
    private Department department;
}
