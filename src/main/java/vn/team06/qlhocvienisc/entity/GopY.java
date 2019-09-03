package vn.team06.qlhocvienisc.entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "GOPY")
public class GopY {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int ID;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="NGUOIGOPY", nullable = false)
	@JsonBackReference
    private HocVien hocvien;
	
	@Column(nullable = true)
	private String NOIDUNG;
	
	@Column(nullable = true)
	private Date NGAYNHAN;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public HocVien getHocvien() {
		return hocvien;
	}

	public void setHocvien(HocVien hocvien) {
		this.hocvien = hocvien;
	}

	public String getNOIDUNG() {
		return NOIDUNG;
	}

	public void setNOIDUNG(String nOIDUNG) {
		NOIDUNG = nOIDUNG;
	}

	public Date getNGAYNHAN() {
		return NGAYNHAN;
	}

	public void setNGAYNHAN(Date nGAYNHAN) {
		NGAYNHAN = nGAYNHAN;
	}
}
