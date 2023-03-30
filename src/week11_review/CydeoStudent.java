package week11_review;

public class CydeoStudent extends Student {

    private String groupName, programLanguage;
   private int batchNumber;

    public CydeoStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName,
                        char grade, String groupName, String programLanguage, int batchNumber) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
        setGroupName(groupName);
       setProgramLanguage(programLanguage);
        setBatchNumber(batchNumber);
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0) {
            System.err.println("invalid number" + batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        if (groupName == null) {
            System.err.println("groupname can not be null");
            System.exit(1);
        }
        if (groupName.isEmpty()) {
            System.err.println("groupname can not be null");
            System.exit(1);
        }
        if (Character.isDigit(groupName.charAt(0)) || !Character.isLetterOrDigit(groupName.charAt(0))) {
            System.err.println("Group name can not start with a digit or special character");
            System.exit(1);
        }

        this.groupName = groupName;
    }

    public String getProgramLanguage() {

        return programLanguage;
    }

    public void setProgramLanguage(String programLanguage) {
        if (programLanguage.equalsIgnoreCase("java") ||programLanguage.equalsIgnoreCase("python") || programLanguage.equalsIgnoreCase("javascript")) {
            this.programLanguage = programLanguage;
        } else {
            System.err.println("Programming language must be \"Java\", \"Python\", or \"JavaScript\"");
            System.exit(1);
        }
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() +
                super.toString() +
                "groupName='" + groupName + '\'' +
                ", programLanguage='" + programLanguage + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}






