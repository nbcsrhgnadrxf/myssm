package ssm.model;

public class Gcuser implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4633149900579039028L;

	
	private int uId;
	
	private String uName;
	
	private String uSex;
	
	private String uBirthday;
	
	private String uTel;
	
	private String uAddress;
	
	private String uPwd;
	
	private String uImg;
	
	private String uDcb;
	
	private String uFb;

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuSex() {
		return uSex;
	}

	public void setuSex(String uSex) {
		this.uSex = uSex;
	}

	public String getuBirthday() {
		return uBirthday;
	}

	public void setuBirthday(String uBirthday) {
		this.uBirthday = uBirthday;
	}

	public String getuTel() {
		return uTel;
	}

	public void setuTel(String uTel) {
		this.uTel = uTel;
	}

	public String getuAddress() {
		return uAddress;
	}

	public void setuAddress(String uAddress) {
		this.uAddress = uAddress;
	}

	public String getuPwd() {
		return uPwd;
	}

	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}

	public String getuImg() {
		return uImg;
	}

	public void setuImg(String uImg) {
		this.uImg = uImg;
	}

	public String getuDcb() {
		return uDcb;
	}

	public void setuDcb(String uDcb) {
		this.uDcb = uDcb;
	}

	
	public String getuFb() {
		return uFb;
	}

	public void setuFb(String uFb) {
		this.uFb = uFb;
	}

	

	public Gcuser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gcuser(int uId, String uName, String uSex, String uBirthday, String uTel, String uAddress, String uPwd,
			String uImg, String uDcb, String uFb) {
		super();
		this.uId = uId;
		this.uName = uName;
		this.uSex = uSex;
		this.uBirthday = uBirthday;
		this.uTel = uTel;
		this.uAddress = uAddress;
		this.uPwd = uPwd;
		this.uImg = uImg;
		this.uDcb = uDcb;
		this.uFb = uFb;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uAddress == null) ? 0 : uAddress.hashCode());
		result = prime * result + ((uBirthday == null) ? 0 : uBirthday.hashCode());
		result = prime * result + ((uDcb == null) ? 0 : uDcb.hashCode());
		result = prime * result + ((uFb == null) ? 0 : uFb.hashCode());
		result = prime * result + uId;
		result = prime * result + ((uImg == null) ? 0 : uImg.hashCode());
		result = prime * result + ((uName == null) ? 0 : uName.hashCode());
		result = prime * result + ((uPwd == null) ? 0 : uPwd.hashCode());
		result = prime * result + ((uSex == null) ? 0 : uSex.hashCode());
		result = prime * result + ((uTel == null) ? 0 : uTel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gcuser other = (Gcuser) obj;
		if (uAddress == null) {
			if (other.uAddress != null)
				return false;
		} else if (!uAddress.equals(other.uAddress))
			return false;
		if (uBirthday == null) {
			if (other.uBirthday != null)
				return false;
		} else if (!uBirthday.equals(other.uBirthday))
			return false;
		if (uDcb == null) {
			if (other.uDcb != null)
				return false;
		} else if (!uDcb.equals(other.uDcb))
			return false;
		if (uFb == null) {
			if (other.uFb != null)
				return false;
		} else if (!uFb.equals(other.uFb))
			return false;
		if (uId != other.uId)
			return false;
		if (uImg == null) {
			if (other.uImg != null)
				return false;
		} else if (!uImg.equals(other.uImg))
			return false;
		if (uName == null) {
			if (other.uName != null)
				return false;
		} else if (!uName.equals(other.uName))
			return false;
		if (uPwd == null) {
			if (other.uPwd != null)
				return false;
		} else if (!uPwd.equals(other.uPwd))
			return false;
		if (uSex == null) {
			if (other.uSex != null)
				return false;
		} else if (!uSex.equals(other.uSex))
			return false;
		if (uTel == null) {
			if (other.uTel != null)
				return false;
		} else if (!uTel.equals(other.uTel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Gcuser [uId=" + uId + ", uName=" + uName + ", uSex=" + uSex + ", uBirthday=" + uBirthday + ", uTel="
				+ uTel + ", uAddress=" + uAddress + ", uPwd=" + uPwd + ", uImg=" + uImg + ", uDcb=" + uDcb + ", uFb="
				+ uFb + "]";
	}


}
