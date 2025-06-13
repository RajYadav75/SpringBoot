package in.raj.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.*;

@Data
@Entity
@Table(name="SECURITY_USERS")
public class UserInfo implements Serializable {
    @Id
    @SequenceGenerator(name="gen1",sequenceName = "UNID_SEQ1",initialValue = 100,allocationSize = 1)
    @GeneratedValue(generator = "gen1",strategy=GenerationType.SEQUENCE)
    private  Integer unid;
    @Column(length = 20)
    private  String  uname;
    @Column(length = 100)
    private  String  pwd;
    @Column(length = 20)
    private  String   email;
    private  Integer  status=1;
    @Column(name="role")
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "SECURITY_ROLES",joinColumns=@JoinColumn(name="USER_ID",referencedColumnName = "UNID") )
    private Set<String> roles;

    public Integer getUnid() {
        return unid;
    }

    public void setUnid(Integer unid) {
        this.unid = unid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public UserInfo(Integer unid, String uname, String pwd, String email, Integer status, Set<String> roles) {
        this.unid = unid;
        this.uname = uname;
        this.pwd = pwd;
        this.email = email;
        this.status = status;
        this.roles = roles;
    }

}
