package services;
import java.util.*;

import entity.*;


public interface EnquiryServiceInterface {
	
	default void displayEnquiries(List<Enquiry> enquiries) {
        System.out.println("--- Enquiries ---");
        for (Enquiry enquiry : enquiries) {
        	System.out.println("Enquiry ID: " + enquiry.getID());
        	System.out.println("Submission date/time: " + enquiry.getSubmissionDate());
        	System.out.println("Applicant Name: " + enquiry.getApplicant().getName());
        	System.out.println("Project Name: " + enquiry.getProjectName());
        	System.out.println("Message: " + enquiry.getMessage());
        	if (enquiry.getResponse() != null) {
        		System.out.println("Response: " + enquiry.getResponse());
        	} else {
        		System.out.println("Response: No response yet.");
        	}
        }
    }
	
}


interface ManagerEnquiryServiceInterface extends EnquiryServiceInterface {
	
	void viewEnquiries(Manager manager, boolean filterByManaging);
}


interface OfficerEnquiryServiceInterface extends EnquiryServiceInterface {
	
	boolean viewEnquiries(Officer officer);
}


interface ApplicantEnquiryServiceInterface extends EnquiryServiceInterface {
	
	boolean viewEnquiries(Applicant applicant);
}
	
	/* implement this in application class

	private boolean filterByManaging = false; // maybe this in Manager object itself?
	
	public void filterChange() {
		
		if (filterByManaging == false) filterByManaging = true;
		else filterByManaging = false;
	}
	
	*/
