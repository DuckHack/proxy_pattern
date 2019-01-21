import java.util.List;
import java.util.Map;
import java.util.Set;

public class DeduplicationInterfaceImpl implements DeduplicationInterface {

    @Override
    public void addSentence(String sentence) {
        System.out.println("Inside the real addSentence method");
    }

    @Override
    public List<Integer> getSentence(String sentence) {
        System.out.println("Inside real the getSentence method");
        return null;
    }

    @Override
    public Map<Integer, String> getDictionary() {
        System.out.println("Inside real the getDictionary method");
        return null;
    }


    @Override
    public void removeSentence(String sentence) {
        System.out.println("Inside real the removeSentence method");
    }

    @Override
    public Set<String> getWords() {
        System.out.println("Inside real the getWords method");
        return null;
    }
}
