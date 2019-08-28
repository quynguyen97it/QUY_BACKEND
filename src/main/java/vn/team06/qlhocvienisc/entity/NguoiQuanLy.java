package vn.team06.qlhocvienisc.entity;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "NGUOIQUANLY")
public class NguoiQuanLy {
	@Id 
	@Column(nullable = false)
	private String MANQL;

	@Column(nullable = true)
	private String HO;
	
	@Column(nullable = true)
	private String TENLOT;
	
	@Column(nullable = true)
	private String TEN;
	
	@Column(nullable = true)
	private String GIOITINH;
	
	@Column(nullable = true)
	private Date NGAYSINH;
	
	@Column(nullable = true)
	private String NOISINH;
	
	@Column(nullable = true)
	private int CMND;
	
	@Column(nullable = true)
	private int SDT;
	
	@Column(nullable = true)
	private String EMAIL;
	
	@Column(nullable = true)
	private String DIACHI;
	
	@Column(nullable = true)
	private int LUONG;
	
	@Column(nullable = true)
	private int HSLUONG;
	
	@Column(nullable = true)
	private Date NGAYVAOLAM;
	
	@Column(nullable = true)
	private String PASSWORD;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNTTYPE")
	LoaiTaiKhoan loaitaikhoan;
	
	public String getMANQL() {
		return MANQL;
	}

	public void setMANQL(String mANQL) {
		MANQL = mANQL;
	}
	
	public String getHO() {
		return HO;
	}

	public void setHO(String hO) {
		HO = hO;
	}

	public String getTENLOT() {
		return TENLOT;
	}

	public void setTENLOT(String tENLOT) {
		TENLOT = tENLOT;
	}

	public String getTEN() {
		return TEN;
	}

	public void setTEN(String tEN) {
		TEN = tEN;
	}

	public String getGIOITINH() {
		return GIOITINH;
	}

	public void setGIOITINH(String gIOITINH) {
		GIOITINH = gIOITINH;
	}

	public Date getNGAYSINH() {
		return NGAYSINH;
	}

	public void setNGAYSINH(Date nGAYSINH) {
		NGAYSINH = nGAYSINH;
	}

	public String getNOISINH() {
		return NOISINH;
	}

	public void setNOISINH(String nOISINH) {
		NOISINH = nOISINH;
	}

	public int getCMND() {
		return CMND;
	}

	public void setCMND(int cMND) {
		CMND = cMND;
	}

	public int getSDT() {
		return SDT;
	}

	public void setSDT(int sDT) {
		SDT = sDT;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getDIACHI() {
		return DIACHI;
	}

	public void setDIACHI(String dIACHI) {
		DIACHI = dIACHI;
	}

	public int getLUONG() {
		return LUONG;
	}

	public void setLUONG(int lUONG) {
		LUONG = lUONG;
	}

	public int getHSLUONG() {
		return HSLUONG;
	}

	public void setHSLUONG(int hSLUONG) {
		HSLUONG = hSLUONG;
	}

	public Date getNGAYVAOLAM() {
		return NGAYVAOLAM;
	}

	public void setNGAYVAOLAM(Date nGAYVAOLAM) {
		NGAYVAOLAM = nGAYVAOLAM;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public LoaiTaiKhoan getLoaitaikhoan() {
		return loaitaikhoan;
	}

	public void setLoaitaikhoan(LoaiTaiKhoan loaitaikhoan) {
		this.loaitaikhoan = loaitaikhoan;
	}
}
