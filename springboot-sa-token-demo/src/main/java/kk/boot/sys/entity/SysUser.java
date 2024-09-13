package kk.boot.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 用户
 * </p>
 *
 * @author shan
 * @since 2024-09-13
 */
@TableName("sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId
    private String id;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 签名
     */
    private String signature;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private String age;

    /**
     * 扩展信息
     */
    private String extJson;

    /**
     * 删除标志
     */
    private String deleteFlag;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建用户
     */
    private String createUser;

    /**
     * 修改时间
     */
    private LocalDateTime updateTime;

    /**
     * 修改用户
     */
    private String updateUser;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public  String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getExtJson() {
        return extJson;
    }

    public void setExtJson(String extJson) {
        this.extJson = extJson;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        return "SysUser{" +
            "id = " + id +
            ", avatar = " + avatar +
            ", signature = " + signature +
            ", account = " + account +
            ", password = " + password +
            ", name = " + name +
            ", nickname = " + nickname +
            ", gender = " + gender +
            ", age = " + age +
            ", extJson = " + extJson +
            ", deleteFlag = " + deleteFlag +
            ", createTime = " + createTime +
            ", createUser = " + createUser +
            ", updateTime = " + updateTime +
            ", updateUser = " + updateUser +
        "}";
    }


}
