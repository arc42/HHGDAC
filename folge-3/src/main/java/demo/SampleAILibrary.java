package demo;

class SampleAILibrary {

    // beantwortet alle Fragen

    // tag::signatur[]
    static String answerQuestion(String question) throws Exception
    //end::signatur[]
    {
        if (question==null) {
            throw new Exception("no question given");
        } else {
            return "42";
        }
    }
}