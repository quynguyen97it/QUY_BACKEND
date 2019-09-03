package vn.team06.qlhocvienisc.entity;
import java.sql.Date;
import java.sql.Time;

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
@Table(name = "THOIKHOABIEU")
public class ThoiKhoaBieu {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int ID;
	
	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MAKHOAHOC")
	KhoaHoc khoahoc;*/
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MACBGV")
	CanBoGiangVien cbgv;
	
	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MAMH")
	MonHoc monhoc;*/
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "MAPHG")
	PhongHoc phonghoc;
	
	@Column(nullable = true)
	private Time GIOBD;
	
	@Column(nullable = true)
	private Time GIOKT;
	
	@Column(nullable = true)
	private Date NGAYHOC;


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public Time getGIOBD() {
		return GIOBD;
	}


	public void setGIOBD(Time gIOBD) {
		GIOBD = gIOBD;
	}


	public Time getGIOKT() {
		return GIOKT;
	}


	public void setGIOKT(Time gIOKT) {
		GIOKT = gIOKT;
	}


	public Date getNGAYHOC() {
		return NGAYHOC;
	}


	public void setNGAYHOC(Date nGAYHOC) {
		NGAYHOC = nGAYHOC;
	}


	public CanBoGiangVien getCbgv() {
		return cbgv;
	}


	public void setCbgv(CanBoGiangVien cbgv) {
		this.cbgv = cbgv;
	}


	public PhongHoc getPhonghoc() {
		return phonghoc;
	}


	public void setPhonghoc(PhongHoc phonghoc) {
		this.phonghoc = phonghoc;
	}
	
}
