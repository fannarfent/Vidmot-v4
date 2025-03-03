package hi.verkefni.vinnsla;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.HashMap;
import java.util.Map;

public class Spurningar {
    private final ObservableList<String> flokkar = FXCollections.observableArrayList();
    private final Map<String, ObservableList<String>> spurningar = new HashMap<>();
    private final SimpleStringProperty fjoldiSvaradraSpurninga = new SimpleStringProperty("0");

    public Spurningar() {
    }

    public Spurningar(String... initialFlokkar) {
        for (String flokkur : initialFlokkar) {
            flokkar.add(flokkur);
        }

        // Example questions for each category
        ObservableList<String> leadershipQuestions = FXCollections.observableArrayList(
                "Can you give an example of a time when you demonstrated leadership skills?",
                "How do you handle leadership responsibilities?",
                "What do you think makes a good leader?"
        );

        ObservableList<String> workEthicQuestions = FXCollections.observableArrayList(
                "Can you describe a time when you went above and beyond at work?",
                "How do you prioritize your tasks?",
                "What does having a good work ethic mean to you?"
        );

        ObservableList<String> skillQuestions = FXCollections.observableArrayList(
                "What are your core skills?",
                "How do you keep your skills up to date?",
                "Can you give an example of a project where you used these skills?"
        );

        ObservableList<String> technicalQuestions = FXCollections.observableArrayList(
                "What programming languages are you proficient in?",
                "Can you describe your experience with software development methodologies?",
                "How do you approach debugging a complex issue?"
        );

        spurningar.put("Leadership", leadershipQuestions);
        spurningar.put("Work Ethic", workEthicQuestions);
        spurningar.put("Færnispurningar", skillQuestions);
        spurningar.put("Tæknispurningar", technicalQuestions);
    }

    public ObservableList<String> getSpurningalisti(String flokkur) {
        return spurningar.getOrDefault(flokkur, FXCollections.observableArrayList());
    }

    public ObservableList<String> getFlokkar() {
        return flokkar;
    }

    public static void main(String[] args) {
        Spurningar spurningar = new Spurningar("Leadership", "Work Ethic", "Færnispurningar", "Tæknispurningar");
        System.out.println(spurningar.getSpurningalisti("Færnispurningar").get(1));
        System.out.println(spurningar.getSpurningalisti("Tæknispurningar").get(0));
        System.out.println(spurningar.getFlokkar());
    }
}
