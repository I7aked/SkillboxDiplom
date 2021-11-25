package main.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "post_votes")
public class PostVotes
{
    public PostVotes() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "post_id")
    private Posts posts;

    @Column(name = "time")
    private LocalDateTime time;

    @Column(name = "value")
    private boolean value;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Posts getPost() {
        return posts;
    }

    public void setPostId(Posts postId) {
        this.posts = posts;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public boolean isValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
}
