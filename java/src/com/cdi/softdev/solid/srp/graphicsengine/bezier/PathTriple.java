package com.cdi.softdev.solid.srp.graphicsengine.bezier;

public class PathTriple {

    private Point pre;
    private Point anchor;
    private Point post;

    public PathTriple(Point pre, Point anchor, Point post) {
        this.pre = pre;
        this.anchor = anchor;
        this.post = post;
    }

    public Point getPre() {
        return pre;
    }

    public void setPre(Point pre) {
        this.pre = pre;
    }

    public Point getAnchor() {
        return anchor;
    }

    public void setAnchor(Point anchor) {
        this.anchor = anchor;
    }

    public Point getPost() {
        return post;
    }

    public void setPost(Point post) {
        this.post = post;
    }
}
