/*
 * File name: JSONTreeNode.java
 * Copyright: aqlu. Copyright 2010-2014, All rights reserved
 * Description: <description>
 * Reviser: aqlu
 * Revising Date: 2010-10-19
 */
package com.ofpay.edge.bean;

import java.io.Serializable;
import java.util.List;

/**
 * <p>
 * JSONTreeNode
 * </p>
 * @author aqlu
 * @version 1.0, 2010-10-19
 * @since 1.0
 */
public class JSONTreeNode implements Serializable {
    /**
     * Content of note
     */
    private static final long serialVersionUID = 491440269424488306L;

    private String id; // ID

    private String text; // 节点显示

    private String cls; // 图标

    private String iconCls;

    private boolean leaf; // 是否叶子

    private String href; // 链接

    private String hrefTarget; // 链接指向

    private boolean expandable; // 是否展开

    private String description; // 描述信息

    private boolean singleClickExpand; // 是否单击展开

    private boolean isClass;

    private List<JSONTreeNode> children;

    /**
     * <p>
     * get singleClickExpand
     * </p>
     * @return the singleClickExpand
     */
    public boolean isSingleClickExpand() {
        return singleClickExpand;
    }

    /**
     * <p>
     * set singleClickExpand
     * </p>
     * @param singleClickExpand the singleClickExpand to set
     */
    public void setSingleClickExpand(boolean singleClickExpand) {
        this.singleClickExpand = singleClickExpand;
    }

    /**
     * <p>
     * get id
     * </p>
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * set id
     * </p>
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * get text
     * </p>
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * <p>
     * set text
     * </p>
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * <p>
     * get cls
     * </p>
     * @return the cls
     */
    public String getCls() {
        return cls;
    }

    /**
     * <p>
     * set cls
     * </p>
     * @param cls the cls to set
     */
    public void setCls(String cls) {
        this.cls = cls;
    }

    /**
     * <p>
     * get leaf
     * </p>
     * @return the leaf
     */
    public boolean isLeaf() {
        return leaf;
    }

    /**
     * <p>
     * set leaf
     * </p>
     * @param leaf the leaf to set
     */
    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    /**
     * <p>
     * get href
     * </p>
     * @return the href
     */
    public String getHref() {
        return href;
    }

    /**
     * <p>
     * set href
     * </p>
     * @param href the href to set
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     * <p>
     * get hrefTarget
     * </p>
     * @return the hrefTarget
     */
    public String getHrefTarget() {
        return hrefTarget;
    }

    /**
     * <p>
     * set hrefTarget
     * </p>
     * @param hrefTarget the hrefTarget to set
     */
    public void setHrefTarget(String hrefTarget) {
        this.hrefTarget = hrefTarget;
    }

    /**
     * <p>
     * get expandable
     * </p>
     * @return the expandable
     */
    public boolean isExpandable() {
        return expandable;
    }

    /**
     * <p>
     * set expandable
     * </p>
     * @param expandable the expandable to set
     */
    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    /**
     * <p>
     * get description
     * </p>
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * set description
     * </p>
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the iconCls
     */
    public String getIconCls() {
        return iconCls;
    }

    /**
     * @param iconCls the iconCls to set
     */
    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    /**
     * @return the children
     */
    public List<JSONTreeNode> getChildren() {
        return children;
    }

    /**
     * @param children the children to set
     */
    public void setChildren(List<JSONTreeNode> children) {
        this.children = children;
    }

    /**
     * @return the isClass
     */
    public boolean getIsClass() {
        return isClass;
    }

    /**
     * @param isClass the isClass to set
     */
    public void setIsClass(boolean isClass) {
        this.isClass = isClass;
    }

}
