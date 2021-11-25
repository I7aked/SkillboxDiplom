package main.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tags")
public class Tags
{
    public Tags() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name = "tag2post"
            ,joinColumns = @JoinColumn(name = "tag_id")
            ,inverseJoinColumns = @JoinColumn(name = "post_id"))
    private List<Posts> posts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }
}
