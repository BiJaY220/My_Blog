package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.project.entities.BlogPost;
import com.project.entities.Categories;

public class PostDao {
	 Connection con;

	    public PostDao(Connection con) {
	        this.con = con;
	    }

	    public ArrayList<Categories> getAllCategories() {
	        ArrayList<Categories> list = new ArrayList<>();

	        try {

	            String q = "select * from categories";
	            Statement st = this.con.createStatement();
	            ResultSet set = st.executeQuery(q);
	            while (set.next()) {
	                int cid = set.getInt("cid");
	                String name = set.getString("name");
	                String description = set.getString("description");
	                Categories c = new Categories(cid, name, description);
	                list.add(c);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return list;
	    }

	    public boolean savePost(BlogPost p) {
	        boolean f = false;
	        try {

	            String q = "insert into posts(pTitle,pContent,pCode,pPic,catId,userId) values(?,?,?,?,?,?)";
	            PreparedStatement pstmt = con.prepareStatement(q);
	            pstmt.setString(1, p.getbTitle());
	            pstmt.setString(2, p.getbContent());
	            pstmt.setString(3, p.getbCode());
	            pstmt.setString(4, p.getbPic());
	            pstmt.setInt(5, p.getCateId());
	            pstmt.setInt(6, p.getUserId());
	            pstmt.executeUpdate();
	            f = true;

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return f;
	    }

//	    get all the posts
	    public List<BlogPost> getAllPosts() {

	        List<BlogPost> list = new ArrayList<>();
	        //fetch all the post
	        try {

	            PreparedStatement p = con.prepareStatement("select * from posts order by bid desc");

	            ResultSet set = p.executeQuery();

	            while (set.next()) {

	                int bid = set.getInt("bid");
	                String bTitle = set.getString("bTitle");
	                String bContent = set.getString("bContent");
	                String bCode = set.getString("bCode");
	                String bPic = set.getString("bPic");
	                Timestamp date = set.getTimestamp("bDate");
	                int catId = set.getInt("cateId");
	                int userId = set.getInt("userId");
	                BlogPost post = new BlogPost(bid, bTitle, bContent, bCode, bPic, date, catId, userId);

	                list.add(post);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return list;
	    }

	    public List<BlogPost> getPostByCatId(int catId) {
	        List<BlogPost> list = new ArrayList<>();
	        //fetch all post by id
	        //fetch all the post
	        try {

	            PreparedStatement p = con.prepareStatement("select * from posts where catId=?");
	            p.setInt(1, catId);
	            ResultSet set = p.executeQuery();

	            while (set.next()) {

	                int bid = set.getInt("bid");
	                String bTitle = set.getString("bTitle");
	                String bContent = set.getString("bContent");
	                String bCode = set.getString("bCode");
	                String bPic = set.getString("bPic");
	                Timestamp date = set.getTimestamp("bDate");

	                int userId = set.getInt("userId");
	                BlogPost post = new BlogPost(bid, bTitle, bContent, bCode, bPic, date, catId, userId);

	                list.add(post);
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return list;
	    }

	    public BlogPost getPostByPostId(int postId) {
	        BlogPost post = null;
	        String q = "select * from posts where bid=?";
	        try {
	            PreparedStatement p = this.con.prepareStatement(q);
	            p.setInt(1, postId);

	            ResultSet set = p.executeQuery();

	            if (set.next()) {

	                int bid = set.getInt("bid");
	                String bTitle = set.getString("bTitle");
	                String bContent = set.getString("bContent");
	                String bCode = set.getString("bCode");
	                String bPic = set.getString("bPic");
	                Timestamp date = set.getTimestamp("bDate");
	                int cid=set.getInt("cateId");
	                int userId = set.getInt("userId");
	                post = new BlogPost(bid, bTitle, bContent, bCode, bPic, date, cid, userId);

	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return post;
	    }

}
