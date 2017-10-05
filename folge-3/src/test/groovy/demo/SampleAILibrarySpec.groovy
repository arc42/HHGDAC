package demo
import spock.lang.*

class SampleAILibrarySpec extends Specification {

    void 'test AI-Library'() {
        //tag::example[]
        when: 'an arbitrary question is given'
            def question = "what is the meaning of live?"
        then: 'the correct answer is given'
            SampleAILibrary.answerQuestion(question) == "42"
        //end::example[]
    }

}
