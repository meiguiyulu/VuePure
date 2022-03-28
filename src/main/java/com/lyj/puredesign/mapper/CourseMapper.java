package com.lyj.puredesign.mapper;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lyj.puredesign.pojo.Course;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 青哥哥
 * @since 2022-03-03
 */
public interface CourseMapper extends BaseMapper<Course> {

    Page<Course> findPage(Page<Course> page, @Param("name") String name);
}