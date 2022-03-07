package colection_review.service.impl;

import colection_review.models.Candidates;
import colection_review.models.Intern;
import colection_review.service.CandidateService;

import java.util.ArrayList;
import java.util.List;

public class InternServiceImpl implements CandidateService<Intern> {
    private List<Candidates> internList = new ArrayList<>();

    public InternServiceImpl(){}

    public InternServiceImpl(List<Candidates> internList) {
        this.internList = internList;
    }

    public List<Candidates> getInternList() {
        return internList;
    }

    public void setInternList(List<Candidates> internList) {
        this.internList = internList;
    }

    @Override
    public void addCandidate(Intern intern) {
        this.internList.add(intern);
    }

    @Override
    public boolean searchCandidate(String name) {
        boolean result = false;
        name=name.toLowerCase();
        for (Candidates element: internList) {
            boolean isContainFirstName = element.getFirstName().toLowerCase().contains(name);
            boolean isContainLastName = element.getLastName().toLowerCase().contains(name);
            if (isContainFirstName||isContainLastName){
                System.out.println(element);
                result=true;
            }
        }
        return result;
    }


    @Override
    public void display() {
        for (Candidates element: internList) {
            System.out.println(element);
        }
    }
}
