package vn.team06.qlhocvienisc.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CHUYENNGANH")
public class TinhNang {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int ID;
	
	@Column(nullable = true)
	private String TENMENU;
	
	@Column(nullable = true)
	private String LINK;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TYPE")
	LoaiTaiKhoan loaitaikhoan;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTENMENU() {
		return TENMENU;
	}

	public void setTENMENU(String tENMENU) {
		TENMENU = tENMENU;
	}

	public String getLINK() {
		return LINK;
	}

	public void setLINK(String lINK) {
		LINK = lINK;
	}

	public LoaiTaiKhoan getLoaitaikhoan() {
		return loaitaikhoan;
	}

	public void setLoaitaikhoan(LoaiTaiKhoan loaitaikhoan) {
		this.loaitaikhoan = loaitaikhoan;
	}
	
}
