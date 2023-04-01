package Seminar2;
public class Dz2parcing {
    public static void main (String[] args) {
        String json = "[{\"фамилия\":\"Иванофф\",\"оценка\":\"5\",\"предмет\":\"Математиква\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        StringBuilder result = new StringBuilder();
        String[] students = json.split("\\},\\s*\\{");
        for (String student : students) {
            String[] fields = student.replaceAll("[\\{\\}]", "").split(",");
            String surname = fields[0].split(":")[1].replace("\"", "");
            String grade = fields[1].split(":")[1].replace("\"", "");
            String subject = fields[2].split(":")[1].replace("\"", "");
            result.append("Студэнт ").append(surname).append(" получил ").append(grade).append(" по предмету ").append(subject).append(".\n");
        }System.out.println(result.toString());
        // return result.toString();
    }
}
