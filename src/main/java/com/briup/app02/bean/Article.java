package com.briup.app02.bean;

public class Article {
    private long id;
    private String title;
    private long publishTime;
    private String content;
    private Integer readTimes;
    private Integer thumbUp;
    private Integer thumbDown;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishTime=" + publishTime +
                ", content='" + content + '\'' +
                ", readTimes=" + readTimes +
                ", thumbUp=" + thumbUp +
                ", thumbDown=" + thumbDown +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getReadTimes() {
        return readTimes;
    }

    public void setReadTimes(Integer readTimes) {
        this.readTimes = readTimes;
    }

    public Integer getThumbUp() {
        return thumbUp;
    }

    public void setThumbUp(Integer thumbUp) {
        this.thumbUp = thumbUp;
    }

    public Integer getThumbDown() {
        return thumbDown;
    }

    public void setThumbDown(Integer thumbDown) {
        this.thumbDown = thumbDown;
    }
}
