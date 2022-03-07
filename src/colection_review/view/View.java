package colection_review.view;

import colection_review.controller.CandidatesController;
import colection_review.service.CandidateService;

public class View {
    public static void main(String[] args) {
        CandidatesController candidatesController = new CandidatesController();
        candidatesController.main();
    }

}
