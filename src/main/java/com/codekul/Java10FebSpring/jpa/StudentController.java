package com.codekul.Java10FebSpring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("saveStudent")
    public String saveStudent(@RequestBody Student student) {
        studentRepository.save(student);
        return "Student saved...";
    }

    @GetMapping("getAllStudent")
    public List<Student> getAllRecord() {
        return studentRepository.findAll();
    }

//    @GetMapping("getStudentById/{id}")
//    public  Student getStudentById(@PathVariable("id") Integer id){
//        return studentRepository.getById(id);
//    }

    @GetMapping("getStudentById/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") Integer id) {
        return studentRepository.findById(id);
    }

/*
    @PutMapping("updateStudent")
    public Student updateStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
*/

    @PutMapping("updateStudent")
    public Student updateStudent(@RequestBody Student student) {
        Student student1 = studentRepository.getById(student.getId());
        student1.setAddress(student.getAddress());
        student1.setName(student.getName());
        student1.setBirthDate(student.getBirthDate());
        return studentRepository.save(student1);
    }


    @DeleteMapping("deleteById/{id}")
    public String deleteStudent(@PathVariable("id") Integer id) {
        studentRepository.deleteById(id);
        return "student deleted";
    }

    @DeleteMapping("deleteByObject")
    public String deleteByObject(@RequestBody Student student) {
        studentRepository.delete(student);
        return "student deleted";
    }

    @DeleteMapping("deleteByIds/{ids}")
    public String deleteByIds(@PathVariable("ids") List<Integer> ids) {
        studentRepository.deleteAllById(ids);
        return "student deleted";
    }

    @GetMapping("getByName/{name}")
    public Student getByName(@PathVariable("name") String name) {
        return studentRepository.findByName(name);
    }

    @GetMapping("getByNameAndAddress")
    public Student getByNameAndAddress(@RequestParam("name") String name, @RequestParam("address") String address) {
        return studentRepository.findByNameAndAddress(name, address);
    }

    @GetMapping("getByNameOrAddress")
    public Student getByNameOrAddress(@RequestParam("name") String name, @RequestParam("address") String address) {
        return studentRepository.findByNameOrAddress(name, address);
    }

    @GetMapping("getDistinctByName")
    public Student getDistinctByName(@RequestParam("name") String name) {
        return studentRepository.findDistinctByName(name);
    }

    @GetMapping("getByBirthDate")
    public List<Student> getByBirthDate(@RequestParam("firstDate") String firstDate, @RequestParam("SecondDate") String secondDate) {
        return studentRepository.findByBirthDateBetween(LocalDate.parse(firstDate), LocalDate.parse(secondDate));
    }

    @GetMapping("getByBirthDateAfter")
    public List<Student> getByBirthDateAfter(@RequestParam("firstDate") String firstDate) {
        return studentRepository.findByBirthDateAfter(LocalDate.parse(firstDate));
    }

    @GetMapping("getByIdLessThan/{id}")
    public List<Student> getByIdLessThan(@PathVariable("id") Integer id) {
        return studentRepository.findByIdLessThanEqual(id);
    }

    @GetMapping("getByNameNull")
    public List<Student> getByNameNull() {
        return studentRepository.findByNameNotNull();
    }

    @GetMapping("getByNameLike")
    public List<Student> getByNameLike(@RequestParam("name") String name) {
        return studentRepository.findByNameContaining(name);
    }
    @GetMapping("getByNameIn")
    public List<Student> getByNameIn(@RequestParam("name") List<String> name) {
        return studentRepository.findByNameIn(name);
    }

}
