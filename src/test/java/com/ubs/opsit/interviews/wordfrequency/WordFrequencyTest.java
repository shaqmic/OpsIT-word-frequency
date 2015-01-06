package com.ubs.opsit.interviews.wordfrequency;

import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class WordFrequencyTest {

    
    @Test
    public void testCountOccurrencesOfWordsWithin() {
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        //= shaquille.countOccurrencesOfWordsWithin("the man on the moon");
        Map = shaquille.countOccurrencesOfWordsWithin("the man in the moon");
         //System.out.println(Map.toString());
         Map = shaquille.countOccurrencesOfWordsWithin("the man on the moon");
         //System.out.println(Map.toString());  
        //Assert.assertEquals(1, Map.get("sdnskvnslkvsd").getData());
        Assert.assertEquals(4, Map.get("the").getData());
    }
    @Test
    public void testOneSentenceInput(){
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        Map = shaquille.countOccurrencesOfWordsWithin("the man on the moon");
        Assert.assertEquals(2, Map.get("the").getData());
    }
    @Test
    public void CapitalSeparation(){
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        Map = shaquille.countOccurrencesOfWordsWithin("The man in the moon");
        Map = shaquille.countOccurrencesOfWordsWithin("The man on the moon");
        //System.out.println(Map);
        Assert.assertEquals(4, Map.get("the").getData());
    }
    @Test 
    public void Tab(){
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        Map = shaquille.countOccurrencesOfWordsWithin(" the\tman in the moon");
        //System.out.println(" the\tman in the moon");
        Map = shaquille.countOccurrencesOfWordsWithin("the man on the moon");
        //System.out.println(Map);
        Assert.assertEquals(4, Map.get("the").getData());
        
    }
    @Test
    public void TwoPlusSpaces(){
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        Map = shaquille.countOccurrencesOfWordsWithin("the  man in the moon");
        Map = shaquille.countOccurrencesOfWordsWithin("the man on the moon");
        Assert.assertEquals(2, Map.get("man").getData());
    }
    @Test 
    public void leadingSpaces(){
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        Map = shaquille.countOccurrencesOfWordsWithin("   the  man in the moon");
        Map = shaquille.countOccurrencesOfWordsWithin("the man on the moon");
        Assert.assertEquals(4, Map.get("the").getData());
    }
    @Test 
    public void trailingSpaces(){   
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        Map = shaquille.countOccurrencesOfWordsWithin("the  man in the moon    ");
        Map = shaquille.countOccurrencesOfWordsWithin("the man on the moon ");
        Assert.assertEquals(2, Map.get("moon").getData());
    }
    @Test
    public void nullInput(){
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        Map = shaquille.countOccurrencesOfWordsWithin(null);
    }
    @Test
    public void trailingPeriod(){
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        Map = shaquille.countOccurrencesOfWordsWithin("the man in the moon.");
        Map = shaquille.countOccurrencesOfWordsWithin("the man on the moon");
        Assert.assertEquals(2, Map.get("moon").getData());
    }
    @Test
    public void Puncuation(){
        // (, . / \ % " ! ?)
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        Map = shaquille.countOccurrencesOfWordsWithin("the, man. in% the! moon/");
        Map = shaquille.countOccurrencesOfWordsWithin("the\" man\" in, the! moon?");
        //System.out.println("Puncuation"+ Map);
        Assert.assertEquals(4, Map.get("the").getData());
        Assert.assertEquals(2, Map.get("man").getData());
        Assert.assertEquals(2, Map.get("in").getData());
        Assert.assertEquals(2, Map.get("moon").getData());
    }
    @Test
    public void RandomParagraph1(){
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        Map = shaquille.countOccurrencesOfWordsWithin("Welcome to the College of Engineering at Tennessee State University. For more than half a century, we have provided a quality education in engineering and technology... with a mission to increase the diversity of tomorrow's technical workforce. We challenge you to investigate and inquire about our programs, and become part of a tradition of Transforming Students Unequivocally. As a perspective student, it is an opportunity to unleash your unknown potential. As an industry/government partner, our faculty looks to enhance your business competitiveness through research and community engagement. It all begins here... at This Special University.... TSU!!!");
        //System.out.println(Map);
    }
    @Test
    public void RandomParagraph2(){
        Interview shaquille = new Interview();
        HashMap<String, numOfData> Map;
        //Map = shaquille.countOccurrencesOfWordsWithin("This is.... \n Sparta!!!");
        Map = shaquille.countOccurrencesOfWordsWithin("Hello Shaquille, "+
            "I received your resume in response to Java roles within UBS Nashville. " +
            "We have both but really have a big push on the development side and think, based on your background, would be a good fit for that. We are developing several SCRUM teams currently consisting of 5 Developers, 1 PM, 1 BA and a QA resource. They handle the development for all of the trading floor applications handling up 17 million or so trading transactions a day. Very sharp developers, AGILE/SCRUM team, they do pair programming and is a good chance to develop quickly in your career. " +
            "As part of the interview process, they administer a \"coding exercise\" as an initial step. A couple of things to keep in mind are focus on clean code and a test driven approach. They will review your code and make recommendations and a lot of this exercise is around how one responds to the feedback etc. " +
            "If you would, take a look and get it back to me within a couple of days. The manager is going to be in the week of the 5th (January) and would love for you to be able to sit down with him and have a chat. So be thinking of some times the 5th and 6th that you might be able to do that (if you are in town). " +
            "Here are the requirements  for the attached exercise..                " +
            "Import the zip file as a Gradle project into the IDE of your choice. IntelliJ is a big plus. " +
            "Do NOT modify any of the java classes already provided. All tests should pass as they are upon completion of the exercise " +
            "Complete the work using TDD approach. Feel free to add more tests in addition to the existing ones to show your progress. Your work should be guarded by automated tests " +
            "Build the project successfully using Gradle. Instructions are provided in the zip. Hint: There is an issue in Gradle build file that you will need to overcome " +
            "Deliver the work using GitHub or BitBucket is desirable. " +
            "We look forward to reviewing and discussing your work in a follow-up interview " +
            "Let us know if you have any questions,");

        //System.out.println(Map);
        
    }
}
