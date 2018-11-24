package com.freeze.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author hejiebing
 * @create 2018-11-14-23:56
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {
    private static final long serialVersionUID = 5162486454977396143L;
    private Long deptNo;
    private String dname;
    private String db_source;
}
