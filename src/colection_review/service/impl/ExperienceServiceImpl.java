package colection_review.service.impl;

import colection_review.models.Candidates;
import colection_review.models.Experience;
import colection_review.service.CandidateService;

import java.util.ArrayList;
import java.util.List;

public class ExperienceServiceImpl implements CandidateService<Experience> {
    private List<Candidates> experienceList = new ArrayList<>();

    public ExperienceServiceImpl(){}

    public ExperienceServiceImpl(List<Candidates> experienceList){
        this.experienceList = experienceList;
    }

    public List<Candidates> getExperienceList() {
        return experienceList;
    }

    public void setExperienceList(List<Candidates> experienceList) {
        this.experienceList = experienceList;
    }


    @Override
    public void addCandidate(Experience experience) {
        this.experienceList.add(experience);
    }

    @Override
    public boolean searchCandidate(String name) {
        boolean result = false;
        name=name.toLowerCase();
        for (Candidates element: experienceList) {
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
        for (Candidates element: experienceList) {
            System.out.println(element);
        }
    }
}
