package optionaldrills;


public class Candidate {
    String name;
    String spouse;
    Job jobProfile;

    public static void main(String[] args) {
        Candidate sampCandidate = new Candidate();
        sampCandidate.setName("Peterson");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpouse() {
        return spouse;
    }

    public void setSpouse(String spouse) {
        this.spouse = spouse;
    }

    public Job getJobProfile() {
        return jobProfile;
    }

    public void setJobProfile(Job jobProfile) {
        this.jobProfile = jobProfile;
    }
}
class Certification {
    String type;
    double score;
}

class Job {
    String name;
    String proficiency;
    Certification certification;
}