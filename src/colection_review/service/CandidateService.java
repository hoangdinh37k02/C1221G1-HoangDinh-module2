package colection_review.service;

public interface CandidateService<E> {
    void addCandidate(E object);
    boolean searchCandidate(String name);
    void display();
}
