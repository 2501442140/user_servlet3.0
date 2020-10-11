package cs.service.impl;

import cs.dao.impl.NewsDaoImpl;
import cs.entity.News;
import cs.service.NewsService;

import java.util.List;

public class NewsServiceImpl implements NewsService {
    private NewsDaoImpl ndi=new NewsDaoImpl();
    @Override
    public List<News> newsfindGradeInfoAll() throws Exception {
        return ndi.newsfindGradeInfoAll();
    }

    @Override
    public int newsfindNewsCount() throws Exception {
        return ndi.newsfindNewsCount();
    }

    @Override
    public int updateNews(News news) {
        return ndi.updateNews(news);
    }

    @Override
    public int updateseleteNews(News news) {
        return ndi.updateseleteNews(news);
    }
}
