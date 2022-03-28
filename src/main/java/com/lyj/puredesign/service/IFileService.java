package com.lyj.puredesign.service;

import com.lyj.puredesign.pojo.Files;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LiuYunJie
 * @since 2022-03-20
 */
public interface IFileService extends IService<Files> {

    /**
     * 根据md5查找数据
     * @param md5
     * @return
     */
    List<Files> getFileByMd5(String md5);

    /**
     * 存储文件
     * @param files
     */
    void insert(Files files);

    /**
     * 查询文件
     * @param ids
     * @return
     */
    List<Files> selectList(List<Integer> ids);
}
