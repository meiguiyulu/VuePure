package com.lyj.puredesign.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author LiuYunJie
 * @since 2022-03-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("student_course")
public class StudentCourse implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer studentId;

    private Integer courseId;


}
