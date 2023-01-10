package com.example.offlinequiz;


import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> MatematikëQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        //Create object of QuestionsList class and pass a questions along with option and answer
        final QuestionsList question1 = new QuestionsList("Sa është rezultati i x=5+5 ?", "10", "14", "5", "0", "10", "");
        final QuestionsList question2 = new QuestionsList("Sa është rezultati i x=5*2-3 ?", "10", "14", "7", "0", "7", "");
        final QuestionsList question3 = new QuestionsList("Sa është rezultati i x=a^2-b^2 ?", "a", "b", "a-b", "(a-b)*(a+b)", "(a-b)*(a+b)", "");
        final QuestionsList question4 = new QuestionsList("Sa është rezultati i x=8+2*3-4/2 ?", "10", "14", "12", "2", "12", "");
        final QuestionsList question5 = new QuestionsList("Sa është rezultati i x=11^2 ?", "100", "121", "500", "22", "121", "");
        final QuestionsList question6 = new QuestionsList("Sa është rezultati i x=2^10 ?", "2048", "20", "1024", "512", "1024", "");
        final QuestionsList question7 = new QuestionsList("Sa është rezultati i x=1000^2-999^2 ?", "10000", "2000", "1999", "1", "1999", "");
        final QuestionsList question8 = new QuestionsList("Sa është rezultati i x=4/8 ?", "2", "4/2", "1/8", "1/2", "1/2", "");
        final QuestionsList question9 = new QuestionsList("Sa është rezultati i x=1/2+3/4-6/12 ?", "3/4", "1/4", "0", "1/2", "3/4", "");
        final QuestionsList question10 = new QuestionsList("Sa është rezultati i x=(a+b)^2 ?", "a+b", "a^2+b^2", "(a+b)*(a-b)", "a^2+2*a*b+b^2", "a^2+2*a*b+b^2", "");

        //Add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> InformatikëQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Cila nga programet e mëposhtme është Program Aplikativ ?", "MS Word", " C++", "Java", "Google Chrome", "MS Word", "");
        final QuestionsList question2 = new QuestionsList("1 Bajt ka sa bita ? ", "1000 bita", "10 bita", "8 bita", "4 bita", "8 bita", "");
        final QuestionsList question3 = new QuestionsList("1KB ka sa Bytes ?", "1000", "1024", "100", "1000000", "1024", "");
        final QuestionsList question4 = new QuestionsList("Cilin numër në sistemin hexadecimal reprezenton numri 1101 ?", "D", "E", "13", "A", "D", "");
        final QuestionsList question5 = new QuestionsList("Cilën numër në sistemin binar reprezenton numri 32 ?", "11111", "11011", "10001", "10000", "10000", "");
        final QuestionsList question6 = new QuestionsList("Cila nga gjuhët e mëposhtme programuese është gjuhë e nivelit të ulët ?", "Gjuha Assembler", "Java", "C++", "Python", "Gjuha Assembler", "");
        final QuestionsList question7 = new QuestionsList("Cili nga komponentet elektronike të mëposhtme është komponenti kryesor fizik i kompjuterit ?", "Dioda", "Rezistori", "Transistori", " Asnjëra nga këto", "Transistori", "");
        final QuestionsList question8 = new QuestionsList("Cila nga njësitë e mëposhtme brenda në CPU është përgjegjëse për llogaritjet aritmetikore dhe jo vetëm ?", " Regjistrat", "Akumulatori", " Njësia Kontrolluese", "ALU", "ALU", "");
        final QuestionsList question9 = new QuestionsList("Cila nga tipet e ndryshme të memorieve të mëposhtme është më e shpejta ?", "Hard Disc Drive", " Floppy Drive", "Cash Memory", "ROM Memory", "Cash Memory", "");
        final QuestionsList question10 = new QuestionsList("Cila nga komponentet e mëposhtme është përgjegjëse për ekzekutimin e programeve dhe jo vetëm ?", "CPU", "ROM Memory", "RAM Memory", "Sistemi Operativ", "CPU", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> GjuhëShqipeQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Ngritja dhe ulja e zërit quhet:", "Rrokje", "Intonacion", "Varg", "Tingull", "Intonacion", "");
        final QuestionsList question2 = new QuestionsList("Cila nuk është pjesë e ndryshueshme e ligjeratës?", "Folja", "Emri", "Numërori", "Mbiemri", "Numërori", "");
        final QuestionsList question3 = new QuestionsList("Lakimi i dytë i emrave paraqitet kur emri mbaron me:", "I", "U", "A-ja", "Asnjë", "U", "");
        final QuestionsList question4 = new QuestionsList("Folja lexoj në të kryerën e dëftores, në diatezën veprore bën:", "Lexoj", "Lexoja", "Kam lexuar", "Kisha lexuar", "Kam lexuar", "");
        final QuestionsList question5 = new QuestionsList("Lidhëza OSE është lidhëz:", "Veçuese", "Shtuese", "Kundërshtore", "Përmbyllëse", "Veçuese", "");
        final QuestionsList question6 = new QuestionsList("Fjalitë e përbëra me nënrenditje kanë:", "Dy pjesë të varura nga njëra-tjetra", "Asnjë pjesë", "8 e më shumë folje", "Një pjesë të pavarur, kurse pjesa tjetër e varur nga pjesa tjetër", "Një pjesë të pavarur, kurse pjesa tjetër e varur nga pjesa tjetër", "");
        final QuestionsList question7 = new QuestionsList("Pasthirrma AU paraqet ndjenja:", "Gëzimi", "Frike", "Nxitje", "Habie", "Habie", "");
        final QuestionsList question8 = new QuestionsList("Fonetika është degë e gjuhës e cila merret me:", "Drejtshkrimin", "Tingujt", "Gramatikën", "Asnjërën", "Tingujt", "");
        final QuestionsList question9 = new QuestionsList("Sa zanore ka Gjuha Shqipe ?", "7", "8", "29", "36", "7", "");
        final QuestionsList question10 = new QuestionsList("Sa bashkëtingëllore ka Gjuha Shqipe ?", "7", "36", "29", "32", "29", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> GjuhëAnglezeQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("The Past Participle of the verb be is:", "been", "was", "were", "have", "been", "");
        final QuestionsList question2 = new QuestionsList("The Superlative form of the adjective good is:", "better", "goddest", "godder", "the best", "the best", "");
        final QuestionsList question3 = new QuestionsList("The Comparative form of the adjective far is:", "farer", "farest", "further", "the furthest", "further", "");
        final QuestionsList question4 = new QuestionsList("If he _____ phone, tell him to ring back later.", "should", "must", "might", "will", "will", "");
        final QuestionsList question5 = new QuestionsList("I am not feeling well. I would rather _____ in tonight.", "stay", "to stay", "you to stay", "staying", "stay", "");
        final QuestionsList question6 = new QuestionsList("The Past Tense of the verb teach is:", "teached", "taught", "teaches", "teach", "taught", "");
        final QuestionsList question7 = new QuestionsList("Have you done the loundry ?", "Yes, I do", "No, I did not", "No, I have not", "On Wednesdays", "No, I have not", "");
        final QuestionsList question8 = new QuestionsList("Do you want to watch a movie ?", "At the cinema", "Yes I watched it", "No, I do not", "Yes, I did", "No, I do not", "");
        final QuestionsList question9 = new QuestionsList("Which one from the words below represents a verb ?", "good", "all of them", "learn", "beautiful", "learn", "");
        final QuestionsList question10 = new QuestionsList("The Past Continous of the verb read is:", "was/were reading", "is reading", "reads", "reading", "was/were reading", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Matematikë":
                return MatematikëQuestions();
            case "Informatikë":
                return InformatikëQuestions();
            case "Gjuhë Shqipe":
                return GjuhëShqipeQuestions();
            default:
                return GjuhëAnglezeQuestions();
        }
    }
}



