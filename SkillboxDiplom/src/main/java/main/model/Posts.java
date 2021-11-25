package main.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "posts")
public class Posts
{
    public Posts() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "moderation_status")
    private ModerationStatus moderationStatus;

    @Column(name = "moderator_id")
    private int moderatorId;

    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;

    @Column(name = "time")
    private LocalDateTime time;

    @OneToMany(mappedBy = "posts")
    private List<PostVotes> postVotes;

    @OneToMany(mappedBy = "post")
    private List<PostComments> postComments;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;

    @ManyToMany
    @JoinTable(name = "tag2post"
    ,joinColumns = @JoinColumn(name = "post_id")
    ,inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tags> tags;

    @Column(name = "view_count")
    private int viewCount;

    public void addPostCommentToPost(PostComments postComments)
    {
        this.postComments.add(postComments);
    }

    public void addPostVoteToPost(PostVotes postVotes)
    {
        this.postVotes.add(postVotes);
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public ModerationStatus getModerationStatus() {
        return moderationStatus;
    }

    public void setModerationStatus(ModerationStatus moderationStatus) {
        this.moderationStatus = moderationStatus;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getModeratorId() {
        return moderatorId;
    }

    public void setModeratorId(int moderatorId) {
        this.moderatorId = moderatorId;
    }

    public List<PostVotes> getPostVotes() {
        return postVotes;
    }

    public void setPostVotes(List<PostVotes> postVotes) {
        this.postVotes = postVotes;
    }

    public List<PostComments> getPostComments() {
        return postComments;
    }

    public void setPostComments(List<PostComments> postComments) {
        this.postComments = postComments;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }
}
