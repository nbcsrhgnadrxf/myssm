package gc.com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;

/**
 * (GcUser)实体类
 *
 * @author makejava
 * @since 2019-11-06 15:29:40
 */

@Data                //Setter Getter equles hashcode
@AllArgsConstructor //创建一个无参构造函数
@NoArgsConstructor //创建一个全参构造函数
public class GcUser implements Serializable {
    private static final long serialVersionUID = -55998604746408557L;
    
    private Integer uid;
    
    private String uname;
    
    private String usex;
    
    private Date ubirthday;
    
    private String utel;
    
    private String uemail;
    
    private String uaddress;
    
    private String upwd;
    
    private String uimg;
    
    private String udcb;
    
    private String ufb;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public Date getUbirthday() {
        return ubirthday;
    }

    public void setUbirthday(Date ubirthday) {
        this.ubirthday = ubirthday;
    }

    public String getUtel() {
        return utel;
    }

    public void setUtel(String utel) {
        this.utel = utel;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUimg() {
        return uimg;
    }

    public void setUimg(String uimg) {
        this.uimg = uimg;
    }

    public String getUdcb() {
        return udcb;
    }

    public void setUdcb(String udcb) {
        this.udcb = udcb;
    }

    public String getUfb() {
        return ufb;
    }

    public void setUfb(String ufb) {
        this.ufb = ufb;
    }

}