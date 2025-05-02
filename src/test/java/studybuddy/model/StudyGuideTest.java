public class StudyGuideTest {
    @Test
    public void testAddTopic() {
        StudyGuide guide = new StudyGuide("Biology");
        Topic topic = new Topic("Cells", "High");
        guide.addTopic(topic);
        assertEquals(1, guide.getTopics().size());
    }
}
