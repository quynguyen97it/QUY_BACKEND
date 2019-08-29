package vn.team06.qlhocvienisc.entity;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "THONGBAO")
public class ThongBao {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int ID;
	
	@Column(nullable = true)
	private String TIEUDE;
	
	@Column(nullable = true)
	private String NOIDUNG;
	
	@Column(nullable = true)
	private Date NGAYDANG;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "NGUOIDANG")
	private NguoiQuanLy nql;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MAKHOAHOC")
	KhoaHoc khoahoc;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getTIEUDE() {
		return TIEUDE;
	}

	public void setTIEUDE(String tIEUDE) {
		TIEUDE = tIEUDE;
	}

	public String getNOIDUNG() {
		return NOIDUNG;
	}

	public void setNOIDUNG(String nOIDUNG) {
		NOIDUNG = nOIDUNG;
	}

	public Date getNGAYDANG() {
		return NGAYDANG;
	}

	public void setNGAYDANG(Date nGAYDANG) {
		NGAYDANG = nGAYDANG;
	}

	public NguoiQuanLy getNql() {
		return nql;
	}

	public void setNql(NguoiQuanLy nql) {
		this.nql = nql;
	}

	public KhoaHoc getKhoahoc() {
		return khoahoc;
	}

	public void setKhoahoc(KhoaHoc khoahoc) {
		this.khoahoc = khoahoc;
	}
	
}
