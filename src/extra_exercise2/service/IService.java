package extra_exercise2.service;

import extra_exercise2.util.NotFoundProductException;

public interface IService {
    void add();
    void display();
    void delete() throws NotFoundProductException;
    void search() throws NotFoundProductException;

}
