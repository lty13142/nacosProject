package com.lty.user.sys.vo;

import com.lty.commons.School;
import com.lty.user.sys.entity.Person;
import lombok.Data;

/**
 * @author Tianyu
 * @date 2022/9/23 10:09
 */
@Data
public class PersonVo extends Person {

    private School school;

}
