package vn.team06.qlhocvienisc.entity;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "KHOAHOC")
public class KhoaHoc {
	@Id 
	@Column(columnDefinition = "LONGVARBINARY")
	private String MAKHOAHOC;
	
	@Column(nullable = true)
	private String TENKHOAHOC;
	
	@Column(nullable = true)
	private Date NGAYBD;
	
	@Column(nullable = true)
	private Date NGAYKT;
	
	private int CHUYENNGANH_ID;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="CHUYENNGANH_ID", insertable=false, updatable=false)
    private ChuyenNganh chuyennganh;
	
	@OneToMany(mappedBy = "khoahoc", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<HocVien> hocvien;
	
	@OneToMany(mappedBy = "khoahoc", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<ThongBao> thongbao;
	
	@OneToMany(mappedBy = "khoahoc", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private Set<ThoiKhoaBieu> thoikhoabieu;

	public Set<ThoiKhoaBieu> getThoikhoabieu() {
		return thoikhoabieu;
	}

	public void setThoikhoabieu(Set<ThoiKhoaBieu> thoikhoabieu) {
		this.thoikhoabieu = thoikhoabieu;
	}

	public Set<ThongBao> getThongbao() {
		return thongbao;
	}

	public void setThongbao(Set<ThongBao> thongbao) {
		this.thongbao = thongbao;
	}

	public String getMAKHOAHOC() {
		return MAKHOAHOC;
	}

	public void setMAKHOAHOC(String mAKHOAHOC) {
		MAKHOAHOC = mAKHOAHOC;
	}

	public String getTENKHOAHOC() {
		return TENKHOAHOC;
	}

	public void setTENKHOAHOC(String tENKHOAHOC) {
		TENKHOAHOC = tENKHOAHOC;
	}

	public Date getNGAYBD() {
		return NGAYBD;
	}

	public void setNGAYBD(Date nGAYBD) {
		NGAYBD = nGAYBD;
	}

	public Date getNGAYKT() {
		return NGAYKT;
	}

	public void setNGAYKT(Date nGAYKT) {
		NGAYKT = nGAYKT;
	}
	
	public int getCHUYENNGANH_ID() {
		return CHUYENNGANH_ID;
	}

	public void setCHUYENNGANH_ID(int cHUYENNGANH_ID) {
		CHUYENNGANH_ID = cHUYENNGANH_ID;
	}
	
//	public int getIDChuyennganh() {
//		return chuyennganh.getID();
//	}
	
	public String getChuyennganh() {
		return chuyennganh.getTENCN();
	}
	
	public void setChuyennganh(ChuyenNganh chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	
	public Set<HocVien> getHocvien() {
		return hocvien;
	}

	public void setHocvien(Set<HocVien> hocvien) {
		this.hocvien = hocvien;
	}
	
}
