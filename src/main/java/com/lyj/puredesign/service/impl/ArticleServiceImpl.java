package com.lyj.puredesign.service.impl;

import com.lyj.puredesign.pojo.Article;
import com.lyj.puredesign.mapper.ArticleMapper;
import com.lyj.puredesign.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 青哥哥
 * @since 2022-03-22
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
