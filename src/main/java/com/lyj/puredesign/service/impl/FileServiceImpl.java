package com.lyj.puredesign.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lyj.puredesign.pojo.Files;
import com.lyj.puredesign.mapper.FileMapper;
import com.lyj.puredesign.service.IFileService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LiuYunJie
 * @since 2022-03-20
 */
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, Files> implements IFileService {

    @Autowired
    private FileMapper fileMapper;

    @Override
    public List<Files> getFileByMd5(String md5) {
        QueryWrapper<Files> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("md5", md5);
        return fileMapper.selectList(queryWrapper);
    }

    @Override
    public void insert(Files files) {
        fileMapper.insert(files);
    }

    @Override
    public List<Files> selectList(List<Integer> ids) {
        QueryWrapper<Files> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("id", ids);
        return fileMapper.selectList(queryWrapper);
    }
}
