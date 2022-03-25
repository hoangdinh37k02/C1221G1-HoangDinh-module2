package final_exam.service;

import final_exam.util.NotFoundStudentException;

public interface IService {
    void add();
    void delete() throws NotFoundStudentException;
    void display();
    void search();
}
