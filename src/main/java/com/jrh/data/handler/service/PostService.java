package com.jrh.data.handler.service;

import com.jrh.data.handler.model.Post;
import org.springframework.stereotype.Component;

import java.util.concurrent.atomic.AtomicInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

@Component
public class PostService {

    private static List<Post> posts = new ArrayList<>();
    private static AtomicInteger uids = new AtomicInteger(0); // Unique ID generator

    static {
        //Initialize posts and Posts
        initialize();
    }

    public List<Post> retrieveAllposts() {
        return posts;
    }

    public Post getPost(String id) {
        for (Post Post : posts) {
            if (Post.getTitle().equals(id)) {
                return Post;
            }
        }
        return null;
    }

    public List<Post> getPosts() {
        return posts;
    }

    private SecureRandom random = new SecureRandom();

    public Post addPost() {
        return new Post();
    }

    public Post addPost(String title, String text, int submittedBy) {

        Post newPost = new Post(title, text, submittedBy);
        int postId = uids.getAndIncrement();
        newPost.setId(postId);

        return newPost;
    }

    public List<Post> getposts() {
        return posts;
    }

    private static void initialize() {

        /*
        Comment comm1 = new Comment(id, submittedBy, text, children);

        String randomId = UUID.randomUUID().toString();

        Post post1 = new Post(randomId, "Test Post 1", "<insert_text1_here>",
                Arrays.asList("child-post-id-1", "child-post-id-2"));

        randomId = UUID.randomUUID().toString();
        Post post2 = new Post(randomId, "Testing Post 2", "<insert_text2_here>",
                Arrays.asList("child-post-1", "child-post-2", "child-post-3"));


        randomId = UUID.randomUUID().toString();
        Post post3 = new Post(randomId, "Test Post 3", "insert-text3-here",
                Arrays.asList());

        randomId = UUID.randomUUID().toString();
        Post post4 = new Post(randomId, "Test Post 4", "<text>",
                Arrays.asList("id-1", "id-2"));

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);
        posts.add(post4);

        Post Post1 = new Post(1, "John Doe", 1,
                new ArrayList<>(Arrays.asList(post1)));

        Post Post2 = new Post(2, "Jane Doe", 2,
                new ArrayList<>(Arrays.asList(post2, post3)));

        Post Post3 = new Post(3, "Test Ing",3,
                new ArrayList<>(Arrays.asList(post4)));

        Post Post4 = new Post(4, "Ran Dom", 4,
                new ArrayList<>(Arrays.asList()));

        posts.add(Post1);
        posts.add(Post2);
        posts.add(Post3);
        posts.add(Post4);

        */


    }
}