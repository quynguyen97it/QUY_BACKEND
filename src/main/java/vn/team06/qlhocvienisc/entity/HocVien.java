package vn.team06.qlhocvienisc.entity;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "HOCVIEN")
public class HocVien {
	@Id 
	@Column(columnDefinition = "LONGVARBINARY")
	private String MAHV;
	
	private String HO;
	
	private String TENLOT;
	
	private String TEN;
	
	private String GIOITINH;
	
	private Date NGAYSINH;
	
	private String NOISINH;
	
	private int CMND;
	
	private int SDT;
	
	private String EMAIL;
	
	private String DIACHI;
	
	private String PASSWORD;
	
	private Date TGCOTHEDILAM;
	
	private String MATRUONG;
	
	private String MAKHOAHOC;
	
	private String ACCOUNTTYPE;
	
	private String TYPE;
	
	
	
	public String getMaTruonghoc() {
		return truonghoc.getMATRUONG();
	}	
	public String getTenTruonghoc() {
		return truonghoc.getTENTRUONG();
	}

	public void setTruonghoc(TruongHoc truonghoc) {
		this.truonghoc = truonghoc;
	}

	public String getMaKhoahoc() {
		return khoahoc.getMAKHOAHOC();
	}
	
	public String getTENKhoahoc() {
		return khoahoc.getTENKHOAHOC();
	}
	public void setKhoahoc(KhoaHoc khoahoc) {
		this.khoahoc = khoahoc;
	}

	public void setLoaitaikhoan(LoaiTaiKhoan loaitaikhoan) {
		this.loaitaikhoan = loaitaikhoan;
	}
	
	public Integer getIDLoaitaikhoan() {
		return loaitaikhoan.getID();
	}

	public String getTenLoaitaikhoan() {
		return loaitaikhoan.getTENLOAI();
	}
	public void setDanhmuchocvien(DanhMucHocVien danhmuchocvien) {
		this.danhmuchocvien = danhmuchocvien;
	}

	public Integer getIDDanhmuchocvien() {
		return danhmuchocvien.getID();
	}
	
	public String getTenLoaiDanhmuchocvien() {
		return danhmuchocvien.getTENLOAI();
	}

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="MATRUONG",insertable=false, updatable=false)
    private TruongHoc truonghoc;
	
	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="MAKHOAHOC", insertable=false, updatable=false)
    private KhoaHoc khoahoc;

	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="ACCOUNTTYPE", insertable=false, updatable=false)
    private LoaiTaiKhoan loaitaikhoan;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="TYPE", insertable=false, updatable=false)
    private DanhMucHocVien danhmuchocvien;

	public String getMATRUONG() {
		return MATRUONG;
	}

	public void setMATRUONG(String mATRUONG) {
		MATRUONG = mATRUONG;
	}

	public String getMAKHOAHOC() {
		return MAKHOAHOC;
	}

	public void setMAKHOAHOC(String mAKHOAHOC) {
		MAKHOAHOC = mAKHOAHOC;
	}

	public String getACCOUNTTYPE() {
		return ACCOUNTTYPE;
	}

	public void setACCOUNTTYPE(String aCCOUNTTYPE) {
		ACCOUNTTYPE = aCCOUNTTYPE;
	}

	public String getTYPE() {
		return TYPE;
	}

	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}

	@OneToMany(cascade = {CascadeType.REMOVE}, mappedBy = "hocvien")
	@Column(nullable = true)
	@JsonManagedReference
    private List<HoSo> hoso;
	
	@OneToMany(cascade = {CascadeType.REMOVE}, mappedBy = "hocvien")
	@Column(nullable = true)
	@JsonManagedReference
    private List<DiemMonHoc> diemmonhoc;
	
	@OneToMany(cascade = {CascadeType.REMOVE}, mappedBy = "hocvien")
	@Column(nullable = true)
	@JsonManagedReference
    private List<GopY> gopy;
	
	
	
	

	public String getMAHV() {
		return MAHV;
	}

	public void setMAHV(String mAHV) {
		MAHV = mAHV;
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

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public Date getTGCOTHEDILAM() {
		return TGCOTHEDILAM;
	}

	public void setTGCOTHEDILAM(Date tGCOTHEDILAM) {
		TGCOTHEDILAM = tGCOTHEDILAM;
	}

	

	public List<HoSo> getHoso() {
		return hoso;
	}

	public void setHoso(List<HoSo> hoso) {
		this.hoso = hoso;
	}

	public List<DiemMonHoc> getDiemmonhoc() {
		return diemmonhoc;
	}

	public void setDiemmonhoc(List<DiemMonHoc> diemmonhoc) {
		this.diemmonhoc = diemmonhoc;
	}

	public List<GopY> getGopy() {
		return gopy;
	}

	public void setGopy(List<GopY> gopy) {
		this.gopy = gopy;
	}
}
