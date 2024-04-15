package com.csi.service;

import com.csi.model.Student;
import com.csi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {

    @Autowired
    private StudentRepository studentRepositoryImpl;

    public Student saveData(Student student){
        return studentRepositoryImpl.save(student);
    }

    public List<Student> saveBulkOfData(List<Student> studList){
        return studentRepositoryImpl.saveAll(studList);
    }

    public List<Student> findAll(){
        return studentRepositoryImpl.findAll();
    }

    public Student update(Student student){
        return studentRepositoryImpl.save(student);
    }

    public void deletebyid(int studId){
        studentRepositoryImpl.deleteById(studId);
    }

}
