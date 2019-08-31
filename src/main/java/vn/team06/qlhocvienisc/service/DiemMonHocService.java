package vn.team06.qlhocvienisc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import vn.team06.qlhocvienisc.entity.DiemMonHoc;
import vn.team06.qlhocvienisc.repository.DiemMonHocRepository;

@Service
public class DiemMonHocService {
	@Autowired
	DiemMonHocRepository diemmonhocRepository;
	
	public List<DiemMonHoc> getAll() {
        return (List<DiemMonHoc>) diemmonhocRepository.findAll();
    }
     
    public DiemMonHoc createDiemMonHoc(DiemMonHoc diemmonhoc) {
        return diemmonhocRepository.save(diemmonhoc);
    }
     
    public DiemMonHoc updateDiemMonHoc(Integer Id, DiemMonHoc diemmonhoc)
    {
    	DiemMonHoc updatedDMH;
        Optional<DiemMonHoc> searchEntity = diemmonhocRepository.findById(Id);
        if (searchEntity.isPresent()) {
        	DiemMonHoc dmh = searchEntity.get();
//        	kh.setTENKHOAHOC(khoahoc.getTENKHOAHOC());
        	updatedDMH = diemmonhocRepository.save(dmh);
         } else {
             throw new EntityNotFoundException();
         }
         return updatedDMH;
       }
     
      public ResponseEntity<Object> deleteDiemMonHoc(Integer Id) 
      {
        Optional<DiemMonHoc> diemmonhoc = diemmonhocRepository.findById(Id);
        if (diemmonhoc.isPresent()) {
        	DiemMonHoc dmh = diemmonhoc.get();
        	diemmonhocRepository.delete(dmh);
         } else {
                throw new EntityNotFoundException();
         }
         return ResponseEntity.ok().build();
      }
      
      public List<DiemMonHoc> getAllDiemMonHoc(Integer pageNo, Integer pageSize, String sortBy)
      {
          Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
   
          Page<DiemMonHoc> pagedResult = diemmonhocRepository.findAll(paging);
           
          if(pagedResult.hasContent()) {
              return pagedResult.getContent();
          } else {
              return new ArrayList<DiemMonHoc>();
          }
      }
}

