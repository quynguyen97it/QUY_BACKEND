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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "DIEMMONHOC")
public class DiemMonHoc {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int ID;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MAHV", nullable = false)
	@JsonBackReference
    private HocVien hocvien;
	
	
	@OneToOne
	@JoinColumn(name="MAGV")
	CanBoGiangVien cbgv;
	
	@Column(nullable = true)
	private Float DIEMGK;
	
	@Column(nullable = true)
	private Float DIEMHP;
	
	@OneToOne
	@JoinColumn(name="MAMH")
	MonHoc monhoc;
	
	@Column(nullable = true)
	private Date NGAYNHAP;
	
	@Column(nullable = true)
	private String KETQUA;

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

	public CanBoGiangVien getCbgv() {
		return cbgv;
	}

	public void setCbgv(CanBoGiangVien cbgv) {
		this.cbgv = cbgv;
	}

	public Float getDIEMGK() {
		return DIEMGK;
	}

	public void setDIEMGK(Float dIEMGK) {
		DIEMGK = dIEMGK;
	}

	public Float getDIEMHP() {
		return DIEMHP;
	}

	public void setDIEMHP(Float dIEMHP) {
		DIEMHP = dIEMHP;
	}

	public MonHoc getMonhoc() {
		return monhoc;
	}

	public void setMonhoc(MonHoc monhoc) {
		this.monhoc = monhoc;
	}

	public Date getNGAYNHAP() {
		return NGAYNHAP;
	}

	public void setNGAYNHAP(Date nGAYNHAP) {
		NGAYNHAP = nGAYNHAP;
	}

	public String getKETQUA() {
		return KETQUA;
	}

	public void setKETQUA(String kETQUA) {
		KETQUA = kETQUA;
	}
}
