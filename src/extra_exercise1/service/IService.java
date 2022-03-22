package extra_exercise1.service;

import extra_exercise1.util.NotFoundProductException;

public interface IService {
    void add();
    void delete() throws NotFoundProductException;
    void display();
    void search();
}
