package com.lyj.puredesign.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyj.puredesign.mapper.StudentCourseMapper;
import com.lyj.puredesign.pojo.Course;
import com.lyj.puredesign.mapper.CourseMapper;
import com.lyj.puredesign.pojo.StudentCourse;
import com.lyj.puredesign.service.ICourseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 青哥哥
 * @since 2022-03-03
 */
@Service
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

    @Resource
    private CourseMapper courseMapper;
    @Autowired
    private StudentCourseMapper studentCourseMapper;

    @Override
    public Page<Course> findPage(Page<Course> page, String name) {
        return courseMapper.findPage(page, name);
    }

    @Transactional
    @Override
    public void setStudentCourse(Integer courseId, Integer studentId) {
        QueryWrapper<StudentCourse> wrapper = new QueryWrapper<StudentCourse>()
                .eq("student_id", studentId)
                .eq("course_id", courseId);

        studentCourseMapper.delete(wrapper);
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.setCourseId(courseId);
        studentCourse.setStudentId(studentId);
        studentCourseMapper.insert(studentCourse);
    }

}
