/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartattendance.logic;

import java.util.ArrayList;
import java.time.LocalDate;

public class AttendanceManager {

    public static ArrayList<String> records = new ArrayList<>();

    public static void markAttendance(String studentName) {
        String date = LocalDate.now().toString();
        records.add(studentName + " - Present - " + date);
    }

    public static String getAttendanceReport() {
        if(records.isEmpty()) {
            return "No attendance records found.";
        }

        StringBuilder sb = new StringBuilder();
        for(String r : records) {
            sb.append(r).append("\n");
        }
        return sb.toString();
    }
}
