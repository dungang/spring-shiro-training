/**
 *
 */
package com.wangzhixuan.commons.shiro;

import java.io.Serializable;
import java.util.Set;

/**
 * @description：
 *      自定义Authentication对象，
 *      使得Subject除了携带用户的登录名外还可以携带更多信息
 * @author：CUI
 * @date：2017/3/25 22:28
 */
public class ShiroUser implements Serializable {
    private static final long serialVersionUID = -1373760761780840081L;
    
    private Long id;                  // 用户ID
    private final String loginName;   // 登录名
    private String name;              // 登录用户名????
    private Set<String> urlSet;       // 权限集
    private Set<String> roles;        // 角色集

    public ShiroUser(String loginName) {
        this.loginName = loginName;
    }

    public ShiroUser(Long id, String loginName, String name, Set<String> urlSet) {
        this.id = id;
        this.loginName = loginName;
        this.name = name;
        this.urlSet = urlSet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getUrlSet() {
        return urlSet;
    }

    public void setUrlSet(Set<String> urlSet) {
        this.urlSet = urlSet;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getLoginName() {
        return loginName;
    }

    /**
     * 本函数输出将作为默认的<shiro:principal/>输出.
     */
    @Override
    public String toString() {
        return loginName;
    }
}