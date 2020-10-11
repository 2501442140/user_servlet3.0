package cs.dao;

import cs.entity.News;

import java.util.List;

public interface NewsDao {
    public List<News> newsfindGradeInfoAll() throws Exception;

    public int newsfindNewsCount()throws Exception;

    public int updateNews(News news);

    public int updateseleteNews(News news);


}
