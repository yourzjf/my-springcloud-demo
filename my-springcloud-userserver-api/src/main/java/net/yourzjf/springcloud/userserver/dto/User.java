package net.yourzjf.springcloud.userserver.dto;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 5397830278087310554L;
    private Integer id;
    private String name;
    private Integer age;
    private String idcard;

    public static UserBuilder builder(Integer id, String name) {
        return new UserBuilder(id, name);
    }

    public static class UserBuilder {

        private Integer id;
        private String name;
        private Integer age;
        private String idcard;

        public UserBuilder(Integer id, String name) {
            this.id = id;
            this.name = name;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public UserBuilder setIdcard(String idcard) {
            this.idcard = idcard;
            return this;
        }

        public User build() {
            User u = new User();
            u.setId(id);
            u.setName(name);
            u.setAge(age);
            u.setIdcard(idcard);
            return u;
        }
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + ", idcard=" + idcard + "]";
    }
}
