package main.model;

import javax.persistence.*;

@Entity
@Table(name = "tag2post")
public class TagsTwoPost
{
    public TagsTwoPost() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "post_id")
    private int postId;

    @Column(name ="tag_id")
    private int tagId;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }
}
