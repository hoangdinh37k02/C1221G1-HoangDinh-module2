package extra_exercise.service;

import extra_exercise.ultil.NotFoundFileException;

public interface IBenhNhan {
    void add();
    void display();
    void delete() throws NotFoundFileException;
}
