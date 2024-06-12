package OOPS;


class Course {
    //Instance & Static variable
    static int maxCapacity;
    String courseName;
    String enrolledStduents;
    boolean isEnrolled;

    //Static variable
    static {
        maxCapacity = 1000;

    }

    //Block code
    {
        maxCapacity--;
    }

    //Constractator
    Course(String courseName, String enrolledStduents){
        this.courseName = courseName;
        this.enrolledStduents = enrolledStduents;
    }

    //Static method
    static int setMaxCapacity(){
        return maxCapacity;

    }

    //instance method

    void enrollStudent(){
        if ( isEnrolled ){
            System.out.println("Already enrolled!!");
        } else{
            this.isEnrolled = true;
            System.out.println("Wow!! you enrolled");
        }
    }
    void unenrollStudent(){
        if ( isEnrolled ){
            this.isEnrolled = false;
            System.out.println("Hope, you enjoyeed the course!!");
        } else{
            System.out.println("Already unrolled to this course!!");
        }
    }

    public static void main(String[] args) {
        Course python = new Course("Python", "Krishna");
        Course C = new Course("C", "Hari");

        System.out.println(Course.setMaxCapacity());
        python.enrollStudent();
        python.enrollStudent();

        python.unenrollStudent();
        python.unenrollStudent();
        System.out.println(Course.setMaxCapacity());



    }


}


