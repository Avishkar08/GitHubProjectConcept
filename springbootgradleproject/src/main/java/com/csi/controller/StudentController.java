package com.csi.controller;

import com.csi.model.Student;
import com.csi.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @PostMapping("/savedata")
    public ResponseEntity<String> saveData(Student student){
        studentServiceImpl.saveData(student);
        return ResponseEntity.ok("Data Saved SuccessFully");
    }

    @PostMapping("/savebulkofdata/{studList}")
    public ResponseEntity<String> saveBulkOfData(@PathVariable List<Student> studList){
        studentServiceImpl.saveBulkOfData(studList);
        return ResponseEntity.ok("Bulk of Data Saved SuccessFully");
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Student>> findAll(){
        return ResponseEntity.ok(studentServiceImpl.findAll());
    }

//    @PutMapping("/update/{studId}")
//    public ResponseEntity<String> updateById(@PathVariable int studId,@RequestBody Student student){
//    }

    @DeleteMapping("/deletebyid/{studId}")
    public ResponseEntity<String> deleteById(@PathVariable int studId){
        studentServiceImpl.deletebyid(studId);
        return ResponseEntity.ok("Data Deleted SuccessFully");
    }
}
