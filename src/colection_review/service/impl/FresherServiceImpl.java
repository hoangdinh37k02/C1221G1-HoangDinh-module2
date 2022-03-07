package colection_review.service.impl;

import colection_review.models.Candidates;
import colection_review.models.Fresher;
import colection_review.service.CandidateService;

import java.util.ArrayList;
import java.util.List;

public class FresherServiceImpl implements CandidateService<Fresher> {
    private List<Candidates> fresherList = new ArrayList<>();

    public FresherServiceImpl(){}

    public FresherServiceImpl(List<Candidates> fresherList) {
        this.fresherList = fresherList;
    }

    public List<Candidates> getFresherList() {
        return fresherList;
    }

    public void setFresherList(List<Candidates> fresherList) {
        this.fresherList = fresherList;
    }

    @Override
    public void addCandidate(Fresher fresher) {
        this.fresherList.add(fresher);
    }

    @Override
    public boolean searchCandidate(String name) {
        boolean result = false;
        name=name.toLowerCase();
        for (Candidates element: fresherList) {
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
        for (Candidates element: fresherList) {
            System.out.println(element);
        }
    }
}
