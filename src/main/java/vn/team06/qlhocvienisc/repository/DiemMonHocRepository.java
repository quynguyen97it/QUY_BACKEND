package vn.team06.qlhocvienisc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import vn.team06.qlhocvienisc.entity.DiemMonHoc;

@Repository
public interface DiemMonHocRepository extends CrudRepository<DiemMonHoc, Integer>{
	
}
