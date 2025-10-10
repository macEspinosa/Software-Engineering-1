public class SchoolAppDemo {
    public static void main(String[] args) {
        // Create instances of each independent system
        AttendanceSystem attendance = new AttendanceSystem();
        GradingSystem grading = new GradingSystem();
        LibrarySystem library = new LibrarySystem();

        // Create adapters for each system
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendance);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(grading);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(library);

        // Integrate systems into the unified School Management App
        System.out.println("Integrating different systems into the School Management Application:\n");

        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
    }
}
