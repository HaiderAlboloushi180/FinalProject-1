package com.example.mentapy;

import java.io.Serializable;

public class Article implements Serializable {
    private String articleTitle;
    private String articleImgURL;
    private String articleDesc;
    private String articleLink;

    public Article() {}

    public Article(String articleTitle, String articleImgURL, String articleDesc, String articleLink) {
        this.articleTitle = articleTitle;
        this.articleImgURL = articleImgURL;
        this.articleDesc = articleDesc;
        this.articleLink = articleLink;
    }

    public String getArticleTitle() { return articleTitle; }
    public void setArticleTitle(String articleTitle) { this.articleTitle = articleTitle; }

    public String getArticleImgURL() { return articleImgURL; }
    public void setArticleImgURL(String articleImgURL) { this.articleImgURL = articleImgURL; }

    public String getArticleDesc() { return articleDesc; }
    public void setArticleDesc(String articleDesc) { this.articleDesc = articleDesc; }

    public String getArticleLink() { return articleLink; }
    public void setArticleLink(String articleLink) { this.articleLink = articleLink; }
}
