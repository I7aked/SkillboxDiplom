package main.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User
{
    public User() {
    }

    public User(boolean isModerator, String name, LocalDateTime regTime, String email, String password, String code, String photo) {
        this.isModerator = isModerator;
        this.name = name;
        this.regTime = regTime;
        this.email = email;
        this.password = password;
        this.code = code;
        this.photoLink = photo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "is_moderator")
    private boolean isModerator;

    @OneToMany(mappedBy = "user")
    private List<Posts> post;

    @OneToMany(mappedBy = "user")
    private List<PostVotes> postVote;

    @OneToMany(mappedBy = "user")
    private List<PostComments> postComments;

    @Column(name = "name")
    private String name;

    @Column(name = "reg_time")
    private LocalDateTime regTime;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "code")
    private String code;

    @Column(name = "photo")
    private String photoLink;

    public void addPostVoteToUser(PostVotes postVote)
    {
        this.postVote.add(postVote);
    }

    public void addPostCommetToUser(PostComments postComments)
    {
        this.postComments.add(postComments);
    }

    public void addPostToUser(Posts post)
    {
        this.post.add(post);
    }

    public boolean isModerator() {
        return isModerator;
    }

    public void setModerator(boolean moderator) {
        isModerator = moderator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getRegTime() {
        return regTime;
    }

    public void setRegTime(LocalDateTime regTime) {
        this.regTime = regTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photo) {
        this.photoLink = photo;
    }

    public List<Posts> getPost() {
        return post;
    }

    public void setPost(List<Posts> post) {
        this.post = post;
    }
    public List<PostVotes> getPostVote() {
        return postVote;
    }

    public void setPostVote(List<PostVotes> postVote) {
        this.postVote = postVote;
    }

    public List<PostComments> getPostComments() {
        return postComments;
    }

    public void setPostComments(List<PostComments> postComments) {
        this.postComments = postComments;
    }
}


