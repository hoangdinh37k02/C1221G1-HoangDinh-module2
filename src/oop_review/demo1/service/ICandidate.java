package oop_review.demo1.service;

import oop_review.demo1.models.Candidate;

import java.util.ArrayList;

public interface ICandidate {
    ArrayList<Candidate> CANDIDATE_ARRAY_LIST = new ArrayList<>();
    void add();
    void display();
    void search();
}
