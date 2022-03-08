package oop_review.demo.service;

import oop_review.demo.models.Candidate;
import oop_review.demo.models.Experience;

import java.util.ArrayList;

public interface ICandidate {
    ArrayList<Candidate> candidateList = new ArrayList<>();
    void add();
    void display();
    void search();
    void createBaseInfo();
}
