

/**
 * Lab 8
 *
 * Test suite for the ContestantInfo class.
 *
 * @author Stephen
 * @version 2018-03-12
 *
 */
public class ContestantInfoTest
{
    /**
     * The ContestantInfo instance to test.
     */
    private static ContestantInfo info;

    /**
     * Creates a ContestantInfo instance for testing.
     */
    public static void initialize() throws AssertException
    {
    	// TODO: implement.
    	info = new ContestantInfo(Region.SOUTH, HandChoice.ROCK);
    	
    }

    /**
     * Tests the ContestantInfo constructor.
     */
    public void contestantInfoConstructorTest() throws AssertException
    {
    	// TODO: implement.
    	Assert.assertEquals(Region.SOUTH, info.getRegion());
    	Assert.assertEquals(HandChoice.ROCK, info.getChoice());
    	
    }

    /**
     * Tests that ContestantInfo.toString() returns the expected value.
     */
    public void contestantInfoToStringTest() throws AssertException
    {
    	// TODO: implement.
    	Assert.assertEquals("contestant from south throwing rock", info.toString().toLowerCase());
    }
}
