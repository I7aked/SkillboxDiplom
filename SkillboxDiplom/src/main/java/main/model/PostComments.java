package main.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "post_comments")
public class PostComments
{
    public PostComments() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "parent_id")
    private int parentId;

    @ManyToOne
    @JoinColumn(name ="post_id")
    private Posts post;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "text")
    private String text;

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public Posts getPost() {
        return post;
    }

    public void setPostId(Posts post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUserId(User userId) {
        this.user = user;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
