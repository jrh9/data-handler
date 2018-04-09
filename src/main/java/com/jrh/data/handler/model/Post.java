package com.jrh.data.handler.model;


import java.util.ArrayList;
import java.util.List;

public class Post {
    private int id;
    private String title;
    private String text;
    private int submittedBy;
    private List<Comment> comments;

    public Post() {

    }

    public Post(int id, String title, String text, int submittedBy, List<Comment> comments) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.submittedBy = submittedBy;
        this.comments = comments;
    }

    public Post(String title, String text, int submittedBy) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.submittedBy = submittedBy;
        this.comments = new ArrayList<Comment>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public  void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setSubmittedBy(int userId) {
        this.submittedBy = userId;
    }

    public int getSubmittedBy() {
        return submittedBy;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Post {" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", submittedBy='" + submittedBy + '\'' +
                ", text='" + text + '\'' +
                ", comments=" + comments +
                '}';
    }

    /*
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;

        Post other = (Post) obj;
        if (id != other.id)
            return false;
        return true;
    }

}
