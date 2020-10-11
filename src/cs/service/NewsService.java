package cs.service;

import cs.entity.News;

import java.util.List;

public interface NewsService {
    public List<News> newsfindGradeInfoAll() throws Exception;

    public int newsfindNewsCount()throws Exception;

    public int updateNews(News news);

    public int updateseleteNews(News news);
}
