package com.mao.bootdemo.entity;

public class User {
    /**
     * 表：user
     * 字段：id
     * 注释：
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * 表：user
     * 字段：username
     * 注释：
     *
     * @mbggenerated
     */
    private String username;

    /**
     * 表：user
     * 字段：password
     * 注释：
     *
     * @mbggenerated
     */
    private String password;

    /**
     * 表：user
     * 字段：role
     * 注释：
     *
     * @mbggenerated
     */
    private String role;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }
}