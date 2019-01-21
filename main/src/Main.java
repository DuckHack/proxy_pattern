public class Main {
    public static void main(String[] args) {
        //testing
        DeduplicationInterface dediImpl = (DeduplicationInterface) ProxyFactory.getProxyForObj(new DeduplicationInterfaceImpl());

        dediImpl.addSentence("Sentence");
        System.out.println();
        dediImpl.getDictionary();
        System.out.println();
        dediImpl.getWords();
    }
}