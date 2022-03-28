package com.lyj.puredesign.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyj.puredesign.pojo.Course;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 青哥哥
 * @since 2022-03-03
 */
public interface ICourseService extends IService<Course> {

    Page<Course> findPage(Page<Course> page, String name);

    void setStudentCourse(Integer courseId, Integer studentId);
}
